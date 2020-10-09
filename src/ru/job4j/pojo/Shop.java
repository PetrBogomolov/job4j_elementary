package ru.job4j.pojo;

public class Shop {
    public static int indexOfNull(Product[] products) {
        int result = -1;
        for (int index = 0; index < products.length; index++) {
            if (products[index] == null) {
                result = index;
                break;
            }
        }
        return result;
    }

    public static Product[] leftShift(Product[] products, int index) {
            products[index] = null;
            int j = index;
            for (int i = index; i < products.length; i++) {
                if (products[i] != null) {
                    Product save = products[j];
                    products[j] = products[i];
                    products[i] = save;
                    j++;
                }

        }
        return products;
    }

    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        for (int index = 0; index < products.length; index++) {
            Product product = products[index];
            if (product != null) {
                System.out.println(product.getName());
            }
        }
    }
}
