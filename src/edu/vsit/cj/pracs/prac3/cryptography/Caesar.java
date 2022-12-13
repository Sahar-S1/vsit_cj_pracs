package edu.vsit.cj.pracs.prac3.cryptography;

public class Caesar extends Cipher {
    private String shift(String s, int offset) {
        StringBuffer result = new StringBuffer();
        for(int c: s.toCharArray()) {
            result.append((char)((((c - 'a') + offset) % 26) + 'a'));
        }
        return result.toString();
    }

    @Override
    public String encode(String s) {
        return shift(s, 3);
    }

    @Override
    public String decode(String s) {
        return shift(s, -3);
    }
}
