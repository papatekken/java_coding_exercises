package com.techreturners.exercise005;

import java.util.Arrays;

public class Exercise005 {

    public boolean isPangram(String input) {
        if (input.trim()=="")
            return false;

        input = input.toLowerCase();
        String foundLetter= "";

        for(int i=0;i<26;i++)
            foundLetter +="0";

        for(int i=0;i<input.length();i++){
            int code= (int) input.charAt(i)-97;
            if(code>=0 && code <=25)
                foundLetter= foundLetter.substring(0, code) + "1" + foundLetter.substring(code + 1);
        }
        return !foundLetter.contains("0");
    }

}
