package edu.vsit.cj.pracs.prac2.multiauthor;

import edu.vsit.cj.pracs.prac2.library.Author;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Book {
    String name;
    Author[] authors;
    double price;
    int qty;

    public Book(String name, Author[] author, double price, int qty) {
        this.name = name;
        this.authors = author;
        this.price = price;
        this.qty = qty;
    }

    public Book(String name, Author[] author, double price) {
        this(name, author, price, 1);
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        String authorsString = "{" +
                Arrays.stream(authors)
                    .map(a -> a.toString())
                    .collect(Collectors.joining(",")) +
                "}";
        return "Book[" +
                "name=" + name +
                ",authors=" + authorsString +
                ",price=" + price +
                ",qty=" + qty +
                ']';
    }

    public String getAuthorNames() {
        return Arrays.stream(authors)
                        .map(a -> a.getName())
                        .collect(Collectors.joining(","));
    }
}

