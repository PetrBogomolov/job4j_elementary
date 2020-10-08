package ru.job4j.product;

public final class LiquidationProduct {
    private Product product;

    public Product liquidationProduct(String name, int price) {
        return new Product(name, price);
    }

    public String label() {
        return product.label();
    }
}
