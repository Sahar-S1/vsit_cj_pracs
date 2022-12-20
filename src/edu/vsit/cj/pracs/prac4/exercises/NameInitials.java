package edu.vsit.cj.pracs.prac4.exercises;

// 2
public class NameInitials {
    public static void main(String[] args) {
        final String FULL_NAME = "Sahil Ravi Makhijani";
        StringBuffer initials = new StringBuffer();

        for(int i = 0; i < FULL_NAME.length(); i++) {
            if(i == 0 || FULL_NAME.charAt(i - 1) == ' ') {
                initials.append(FULL_NAME.charAt(i));
            }
        }

        System.out.println(initials);
    }
}
