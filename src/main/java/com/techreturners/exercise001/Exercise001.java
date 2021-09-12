package com.techreturners.exercise001;
import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        return  firstName.substring(0, 1).toUpperCase() + '.' + lastName.substring(0, 1).toUpperCase() ;
    }

    public double addVat(double originalPrice, double vatRate) {
        return Math.round((originalPrice + originalPrice * vatRate /100 )*100.0)/100.0;
    }

    public String reverse(String sentence) {
        String outSentence ="";
        for(int i=sentence.length()-1;i>=0;i--)
            outSentence +=sentence.charAt(i);
        return outSentence;
    }

    public int countLinuxUsers(List<User> users) {
        int counter =0;
        for(int i=0;i<users.size();i++)
             if(users.get(i).getType()=="Linux")
                counter++;
        return counter;
    }
}
