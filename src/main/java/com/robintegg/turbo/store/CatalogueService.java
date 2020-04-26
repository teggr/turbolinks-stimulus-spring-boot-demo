package com.robintegg.turbo.store;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class CatalogueService {

    private List<Item> items = new ArrayList<>();

    public CatalogueService() {

        // initialise with some items
        items.add(new Item("Red Pen", new BigDecimal("1.00"), "pen-style-red"));
        items.add(new Item("Orange Pen", new BigDecimal("1.00"), "pen-style-orange"));
        items.add(new Item("Yellow Pen", new BigDecimal("1.00"), "pen-style-yellow"));
        items.add(new Item("Green Pen", new BigDecimal("1.00"), "pen-style-green"));
        items.add(new Item("Purple Pen", new BigDecimal("1.00"), "pen-style-purple"));
        items.add(new Item("Blue Pen", new BigDecimal("1.00"), "pen-style-blue"));

    }

    public List<Item> getAllItems() {
        return items;
    }

}
