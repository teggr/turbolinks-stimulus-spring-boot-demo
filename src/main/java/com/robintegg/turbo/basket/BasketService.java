package com.robintegg.turbo.basket;

import com.robintegg.turbo.store.Item;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Service
@SessionScope
public class BasketService {

    private List<Item> items = new ArrayList<>();

    public BasketSummary getBasketSummary() {
        return new BasketSummary(items);
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }

    public void clear() {
        items.clear();
    }
}
