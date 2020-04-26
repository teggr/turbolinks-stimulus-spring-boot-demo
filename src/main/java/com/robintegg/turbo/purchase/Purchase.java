package com.robintegg.turbo.purchase;

import com.robintegg.turbo.store.Item;

import java.math.BigDecimal;
import java.util.List;

public class Purchase {

    private final List<Item> items;
    private final BigDecimal amount;
    private final int itemCount;

    public Purchase(List<Item> items) {
        this.items = items;
        itemCount = items.size();
        amount = items.stream()
                .map(Item::getPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public int getItemCount() {
        return itemCount;
    }

    public List<Item> getItems() {
        return items;
    }

}
