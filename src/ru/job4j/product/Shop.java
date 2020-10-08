package ru.job4j.product;

public class Shop {
    public static void main(String[] args) {
        Product product = of("Oil", 100);
        System.out.println(product.label());
    }

    public static Product of(String name, int price) {
        LiquidationProduct liquid = new LiquidationProduct();
        if ("Oil".equals(name)) {
            return liquid.liquidationProduct("oil", 50);
        }
        return new Product(name, price);
    }
}
