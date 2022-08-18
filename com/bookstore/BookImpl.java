package com.bookstore;

import base.Book;

public class BookImpl {

    public static void main(String[] args) {
        Book obj = new Book();

        obj.setISBN(123345);
        obj.setDescription("The Book is about a Girl.");
        obj.setPrice(230);
        obj.setTitle("One Indian Girl");
        obj.setAuthorName("Chethan Bhagath");
        obj.setPenName("Mark Thawen");

        obj.display();
    }
}
