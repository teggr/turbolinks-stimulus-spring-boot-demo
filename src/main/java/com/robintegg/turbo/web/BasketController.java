package com.robintegg.turbo.web;

import com.robintegg.turbo.basket.BasketService;
import com.robintegg.turbo.store.Item;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/basket")
public class BasketController {

    private final BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @PostMapping
    public String post(@ModelAttribute Item item) {
        basketService.addItem(item);
        return "redirect:/";
    }

}
