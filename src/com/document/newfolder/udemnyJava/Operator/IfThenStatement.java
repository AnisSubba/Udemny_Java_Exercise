package com.document.newfolder.udemnyJava.Operator;

public class IfThenStatement {
/*
the if-then statement is a control flow statement. which tells your program to execute a certain
section of code only if a particular test evaluates to true. also known as conditional logic which is a
specific statements in java to allow us to check a condition and execute code based on whether the condition is
true or false.
code allows more than one statement to be executed
 */
        public void ifStatement(){

            boolean isAlien = false;
//            if the context inside the if statement is true then it will execute the
//            sout method
            if(isAlien == false) {
                System.out.println("it is not an Alien!");
                System.out.println("I wasn't scared at all");
            }

            int topScore = 80;
            if (topScore != 100){
                System.out.println("you got the high score!");
            }

            int secondTopScore = 95;
            if ((topScore > secondTopScore) && (topScore < 100)){
                System.out.println("greater then Second top score but less than 100");
            }

            if ((topScore > 90) || (secondTopScore <= 90)){
                System.out.println("Either or both of the condition is true");
            }

            int newValue = 50;
            if (newValue == 50) {
                System.out.println("This is an error");
            }
        }
}
