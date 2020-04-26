package com.robintegg.turbo.purchase;

import com.robintegg.turbo.store.Item;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;

@Service
@SessionScope
public class PurchaseService {

    Purchase purchase= null;

    public void startPurchase(List<Item> items) {
        purchase = new Purchase(items);
    }

    public Purchase getPurchase() {
        return purchase;
    }

    public void complete() {
        purchase = null;
    }

    public void cancel() {
        purchase = null;
    }
}
