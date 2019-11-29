package com.document.newfolder.udemnyJava.primitivetype;

public class PrimitiveTypeChallange {

    public void primitiveType() {
        // write your code here
        byte mybyte = 10;
        short myshort = 10;
        int myint = 100;

        long longtotal = 500L * (mybyte + myshort + myint);
        System.out.println(longtotal);

        short shortTotal = (short) (1000 * (mybyte + myshort + myint));
        System.out.println(shortTotal);
    }
}
