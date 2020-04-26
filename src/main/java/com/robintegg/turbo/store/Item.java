package com.robintegg.turbo.store;

import java.math.BigDecimal;

public class Item {

    private final String name;
    private final BigDecimal price;
    private final String style;

    public Item(String name, BigDecimal price, String style) {
        this.name = name;
        this.price = price;
        this.style = style;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getStyle() {
        return style;
    }

}
