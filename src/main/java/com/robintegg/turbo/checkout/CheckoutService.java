package com.robintegg.turbo.checkout;

import com.robintegg.turbo.basket.BasketService;
import com.robintegg.turbo.purchase.PurchaseService;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

@Service
@SessionScope
public class CheckoutService {

    private final BasketService basketService;
    private final PurchaseService purchaseService;

    public CheckoutService(BasketService basketService, PurchaseService purchaseService) {
        this.basketService = basketService;
        this.purchaseService = purchaseService;
    }

    public void checkout() {
        purchaseService.startPurchase(basketService.getItems());
    }

    public String complete() {
        purchaseService.complete();
        basketService.clear();
        return "Your purchase has completed and the items will be delivered soon. Thanks";
    }

    public void cancel() {
        purchaseService.cancel();
        basketService.clear();
    }

}
