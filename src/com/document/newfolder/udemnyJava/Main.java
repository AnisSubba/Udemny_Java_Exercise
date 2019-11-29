package com.document.newfolder.udemnyJava;

import com.document.newfolder.udemnyJava.Operator.IfThenStatement;
import com.document.newfolder.udemnyJava.primitivetype.CharAndBoolean;
import com.document.newfolder.udemnyJava.primitivetype.FloatAndDouble;
import com.document.newfolder.udemnyJava.primitivetype.PrimitiveTypeChallange;
import com.document.newfolder.udemnyJava.primitivetype.StringDataType;

public class Main {

    public static void main(String[] args) {

        PrimitiveTypeChallange primitiveTypeChallange = new PrimitiveTypeChallange();
        primitiveTypeChallange.primitiveType();

        FloatAndDouble floatAndDouble = new FloatAndDouble();
        floatAndDouble.floatAndDouble();

        CharAndBoolean cAndb = new CharAndBoolean();
        cAndb.learningCharAndBoolean();

        StringDataType sDatatupe = new StringDataType();
        sDatatupe.string();

        IfThenStatement ifs = new IfThenStatement();
        ifs.ifStatement();

        // write your code here
        int value = 10000;

        int myIntMinValue = Integer.MIN_VALUE;
        int myIntMaxValue = Integer.MAX_VALUE;
        System.out.println("Minimum Integer Value :" + myIntMinValue);
        System.out.println("Maximum Integer Value :" + myIntMaxValue);
//        a BYTE occupies 8 bit, short has 16 bits and int occupies 32 bits.
//        long has the width of 63 bits.

        byte myByteMinValue = Byte.MIN_VALUE;
        byte myByteMaxValue = Byte.MAX_VALUE;
        System.out.println("Minimum Byte Value :" + myByteMinValue);
        System.out.println("Maximum Byte Value :" + myByteMaxValue);

        short myShortMinValue = Short.MIN_VALUE;
        short myShortMaxValue = Short.MAX_VALUE;
        System.out.println("Minimum Short Value :" + myShortMinValue);
        System.out.println("Maximum Short Value :" + myShortMaxValue);

        long myLongValue = 100L;

        long myLongMinValue = Long.MIN_VALUE;
        long myLongMaxValue = Long.MAX_VALUE;
        System.out.println("Minimum Long Value :" + myLongMinValue);
        System.out.println("Maximum Long Value :" + myLongMaxValue);
// casting means to treat or convert a number from one type to another. we put the type
// we want the number to be in parenthesis for example:
// (byte) (myminByteValue / 2);

        int myTotal = (myIntMinValue/2);

        byte myNewByteValue = (byte) (myByteMinValue/2);

        short myNewShortValue = (short) (myShortMinValue/2);
//one has to specify the integer such as (short) and (byte)

    }

}
