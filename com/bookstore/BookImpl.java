package com.bookstore;

import base.Author;
import base.Book;

public class BookImpl {

    public static void main(String[] args) {
        Book obj = new Book();
        Author obj2 =new Author();

        obj.setISBN(123345);
        obj.setDescription("The Book is about a Girl.");
        obj.setPrice(230);
        obj.setTitle("One Indian Girl");
        obj2.setAuthorName("Chethan Bhagath");
        obj2.setPenName("Mark Thawen");
        obj.setAuthor(obj2);

        obj.display();

    }
}
