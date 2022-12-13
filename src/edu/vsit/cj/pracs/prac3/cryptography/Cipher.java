package edu.vsit.cj.pracs.prac3.cryptography;

import java.util.StringTokenizer;

public abstract class Cipher {
    public String encrypt(String s) {
        StringBuffer result = new StringBuffer("");
        StringTokenizer words = new StringTokenizer(s); // Tokenize
        while (words.hasMoreTokens()) { // Encode each word
            result.append(encode(words.nextToken()) + " ");
        }
        return result.toString(); // Return result
    }

    public String decrypt(String s) {
        StringBuffer result = new StringBuffer("");
        StringTokenizer words = new StringTokenizer(s); // Tokenize
        while (words.hasMoreTokens()) { // Encode each word
            result.append(decode(words.nextToken()) + " ");
        }
        return result.toString(); // Return result
    }

    public abstract String encode(String s);
    public abstract String decode(String s);
}
