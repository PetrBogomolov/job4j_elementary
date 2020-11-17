package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book martin = new Book("Cleane code", 464);
        Book tolstoy = new Book("Война и мир", 2080);
        Book pyshkin = new Book("Евгений Онегин", 736);
        Book twen = new Book("the Prince and the beggar", 72);
        Book[] collector = new Book[4];
        collector[0] = martin;
        collector[1] = tolstoy;
        collector[2] = pyshkin;
        collector[3] = twen;
        for (int index = 0; index < collector.length; index++) {
            System.out.println(collector[index]);
        }
        System.out.println();
        Book save = collector[0];
        collector[0] = collector[3];
        collector[3] = save;
        for (int index = 0; index < collector.length; index++) {
            System.out.println(collector[index]);
        }
        System.out.println("If name book is Clean code");
        for (int index = 0; index < collector.length; index++) {
            Book element = collector[index];
            if (element.getName().equals("Cleane code")) {
                System.out.println(collector[index]);
            }
        }
    }
}
