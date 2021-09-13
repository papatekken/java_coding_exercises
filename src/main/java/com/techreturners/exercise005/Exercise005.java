package com.techreturners.exercise005;

public class Exercise005 {

    public boolean isPangram(String input) {
        if (input.trim().equals(""))
            return false;

        input = input.toLowerCase();
        String foundLetter= "";

        for(int counter=0;counter<26;counter++)
            foundLetter +="0";

        for(int counter=0;counter<input.length();counter++){
            int code= (int) input.charAt(counter)-97;
            if(code>=0 && code <=25)
                foundLetter= foundLetter.substring(0, code) + "1" + foundLetter.substring(code + 1);
        }
        return !foundLetter.contains("0");
    }

}
