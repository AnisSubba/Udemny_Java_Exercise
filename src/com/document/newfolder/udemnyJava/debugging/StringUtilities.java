package com.document.newfolder.udemnyJava.debugging;

public class StringUtilities {
    private StringBuilder sbuilder = new StringBuilder();
    private int charsAdded = 0;

    public void addChar(StringBuilder sbuilder, char c){
        this.sbuilder.append(c);
        charsAdded++;
    }
}
