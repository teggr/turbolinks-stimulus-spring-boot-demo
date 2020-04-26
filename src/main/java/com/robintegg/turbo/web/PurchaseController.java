package com.robintegg.turbo.web;

import com.robintegg.turbo.checkout.CheckoutService;
import com.robintegg.turbo.purchase.PurchaseService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/purchase")
public class PurchaseController {

    private final PurchaseService purchaseService;
    private final CheckoutService checkoutService;

    public PurchaseController(PurchaseService purchaseService, CheckoutService checkoutService) {
        this.purchaseService = purchaseService;
        this.checkoutService = checkoutService;
    }

    @GetMapping
    public String get(Model model) {
        model.addAttribute("purchase", purchaseService.getPurchase());
        return "purchase";
    }

    @PostMapping(params = "complete")
    public RedirectView postComplete(RedirectAttributes redirectAttributes) {
        String feedback = checkoutService.complete();
        redirectAttributes.addFlashAttribute("message", feedback);
        return new RedirectView("/");
    }

    @PostMapping(params = "cancel")
    public String postCancel() {
        checkoutService.cancel();
        return "redirect:/";
    }

}
