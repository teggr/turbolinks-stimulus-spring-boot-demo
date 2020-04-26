package com.robintegg.turbo.basket;

import com.robintegg.turbo.store.Item;

import java.math.BigDecimal;
import java.util.List;

public class BasketSummary {

    private final BigDecimal amount;
    private final int itemCount;

    public BasketSummary(List<Item> items) {
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

    public boolean isEmpty() {
        return itemCount == 0;
    }

}
