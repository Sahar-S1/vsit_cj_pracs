package edu.vsit.cj.pracs.prac2.mylibrary;

public class Author {
    String name;
    String email;

    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Author[" +
                "name=" + name +
                ",email=" + email +
                "]";
    }
}
