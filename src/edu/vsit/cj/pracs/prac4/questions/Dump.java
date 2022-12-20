package edu.vsit.cj.pracs.prac4.questions;

public class Dump {
    public static void main(String[] args) {
        // 1
        StringBuilder sb = new StringBuilder("Able was I ere I saw Elba.");
        System.out.println(sb.capacity());

        // 2
        String hannah = "Did Hannah see bees? Hannah did.";
        System.out.println(hannah.length());
        System.out.println(hannah.charAt(12));
        System.out.println(hannah.charAt(hannah.indexOf('b')));

        // 3
        String ans = "Was it a car or a cat I saw?".substring(9, 12);
        System.out.println(ans.length());
        System.out.println(ans);
    }
}
