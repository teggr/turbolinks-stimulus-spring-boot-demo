package com.robintegg.turbo.web;

import com.robintegg.turbo.basket.BasketService;
import com.robintegg.turbo.checkout.CheckoutService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/checkout")
public class CheckoutController {

    private final CheckoutService checkoutService;

    public CheckoutController(BasketService basketService, CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    @PostMapping
    public String postStart() {
        checkoutService.checkout();
        return "redirect:/purchase";
    }

}
