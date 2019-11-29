package com.document.newfolder.udemnyJava.IntByteShoetLong;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Is the text palindrome:  ");
        String myPhase = input.nextLine();

        System.out.println(myPhase);
        String revString = "";
        char[]ch = myPhase.toCharArray();

        for(int i=ch.length-1; i>=0; i--) {
            revString = revString + ch[i];
        }
        System.out.println(revString);


    }
}
