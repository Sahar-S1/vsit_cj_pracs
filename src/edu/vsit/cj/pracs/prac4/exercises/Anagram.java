package edu.vsit.cj.pracs.prac4.exercises;

// 3
public class Anagram {
    public static boolean check(String s1, String s2) {
        StringBuffer checklist = new StringBuffer(s1.toLowerCase());

        for(char ch: s2.toLowerCase().toCharArray()) {
            if(ch == ' ') {
                continue;
            }

            int index = checklist.indexOf(String.valueOf(ch));

            if(index == -1) {
                return false;
            }

            checklist.deleteCharAt(index);
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(Anagram.check("parliament", "partial men"));
        System.out.println(Anagram.check("software", "swear oft"));
        System.out.println(Anagram.check("sahil", "miller"));
        System.out.println(Anagram.check("heart", "earth"));
    }
}
