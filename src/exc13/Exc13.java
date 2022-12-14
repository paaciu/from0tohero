package exc13;


import java.util.*;


 abstract class Book {
        String title;
        String author;

        Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        abstract void display();
    }

// Declare your class here. Do not use the 'public' access modifier.
// Declare the price instance variable

    class MyBook extends Book {
        private int price;
        MyBook(
                String title,
                String author,
                int price){
            super(title, author);
            this.price = price;
        }

        MyBook(String title, String author) {
            super(title, author);
        }

        void display(){
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Price: " + price);
        }
}

public class Exc13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();
    }
}