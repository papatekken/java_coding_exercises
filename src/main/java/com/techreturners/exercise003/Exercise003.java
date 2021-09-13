package com.techreturners.exercise003;
import java.util.ArrayList;
import java.util.List;

public class Exercise003 {
    private List<IceCream> iceCreams = new ArrayList<IceCream>();

    public Exercise003(){
        iceCreams.add(new IceCream("Pistachio", 0));
        iceCreams.add(new IceCream("Raspberry Ripple", 1));
        iceCreams.add(new IceCream("Vanilla", 2));
        iceCreams.add(new IceCream("Mint Chocolate Chip", 3));
        iceCreams.add(new IceCream("Chocolate", 4));
        iceCreams.add(new IceCream("Mango Sorbet", 5));
    }

    int getIceCreamCode(String iceCreamFlavour) {
        for(int counter=0;counter<iceCreams.size();counter++)
            if(iceCreams.get(counter).getIceCreamFlavour().equals(iceCreamFlavour))
                return iceCreams.get(counter).geticeCreamCode();
        return -1;
    }

    String[] iceCreamFlavours() {
        String[] outFlavours = new String[iceCreams.size()];
        for(int counter=0;counter<iceCreams.size();counter++)
            outFlavours[counter] = iceCreams.get(counter).getIceCreamFlavour();
        return outFlavours;
    }

}
