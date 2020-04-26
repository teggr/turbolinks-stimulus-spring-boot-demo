package com.robintegg.turbo.web;

import com.robintegg.turbo.basket.BasketService;
import com.robintegg.turbo.store.CatalogueService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class StoreController {

    private final CatalogueService catalogueService;
    private final BasketService basketService;

    public StoreController(CatalogueService catalogueService, BasketService basketService) {
        this.catalogueService = catalogueService;
        this.basketService = basketService;
    }

    @GetMapping
    public String get(Model model) {
        model.addAttribute("basket", basketService.getBasketSummary());
        model.addAttribute("items", catalogueService.getAllItems());
        return "store";
    }

}
