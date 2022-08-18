package com.bookstore;

import base.Author;
import base.Book;

public class BookImpl {

    public static void main(String[] args) {
        Book obj = new Book();
        Author author =new Author();

        obj.setISBN(123345);
        obj.setDescription("The Book is about a Girl.");
        obj.setPrice(230);
        obj.setTitle("One Indian Girl");
        author.setAuthorName("Chethan Bhagath");
        author.setPenName("Mark Thawen");
        obj.setAuthor(author);

        obj.display();
    }
}
