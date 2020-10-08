package ru.job4j.product;

public class Shop {
    public static void main(String[] args) {
        Product product = of("Oil", 100);
        System.out.println(product.label());
    }

    public static Product of(String name, int price) {
        if ("Oi".equals(name)) {
            return new LiquidationProduct(name, price).getProduct();
        }
        return new Product(name, price);
    }
}
