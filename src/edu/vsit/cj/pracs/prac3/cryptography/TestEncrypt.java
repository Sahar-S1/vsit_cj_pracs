package edu.vsit.cj.pracs.prac3.cryptography;

public class TestEncrypt {
    public static void main(String argv[]) {
        Caesar caesar = new Caesar();

        String plain = "this is the secret message";   // Here's the message
        String secret = caesar.encrypt(plain);         // Encrypt the message

        System.out.println(" ********* Caesar Cipher Encryption *********");
        System.out.println("PlainText: " + plain);    // Display the results
        System.out.println("Encrypted: " + secret);
        System.out.println("Decrypted: " + caesar.decrypt(secret));// Decrypt

        Transpose transpose = new Transpose();
        secret = transpose.encrypt(plain);

        System.out.println("\n ********* Transpose Cipher Encryption *********");
        System.out.println("PlainText: " + plain);    // Display the results
        System.out.println("Encrypted: " + secret);
        System.out.println("Decrypted: " + transpose.decrypt(secret));// Decrypt
    }
}

/**
 ********* Caesar Cipher Encryption *********
 PlainText: this is the secret message
 Encrypted: wklv lv wkh vhfuhw phvvdjh
 Decrypted: this is the secret message
 ********* Transpose Cipher Encryption *********
 PlainText: this is the secret message
 Encrypted: siht si eht terces egassem
 Decrypted: this is the secret message
 */
