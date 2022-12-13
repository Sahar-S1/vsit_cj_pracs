package edu.vsit.cj.pracs.prac3.cryptography;

public class Transpose extends Cipher {
    private String reverse(String s) {
        return new StringBuffer(s).reverse().toString();
    }

    @Override
    public String encode(String s) {
        return this.reverse(s);
    }

    @Override
    public String decode(String s) {
        return this.reverse(s);
    }
}
