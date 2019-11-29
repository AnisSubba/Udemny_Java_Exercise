package com.document.newfolder.udemnyJava.debugging;

import org.w3c.dom.ls.LSOutput;

public class debugging {

    public void debuggingExercise () {
        StringUtilities utils = new StringUtilities();
        StringBuilder sb = new StringBuilder();
        while (sb.length() < 10){
            utils.addChar(sb, 'a');
        }
        System.out.println(sb);
    }

}
