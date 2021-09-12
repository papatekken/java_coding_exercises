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
        int counter =0;
        for(int i=0;i<iceCreams.size();i++)
            if(iceCreams.get(i).getIceCreamFlavour()==iceCreamFlavour)
                return iceCreams.get(i).geticeCreamCode();
        return -1;
    }

    String[] iceCreamFlavours() {
        String[] outFlavours = new String[iceCreams.size()];;
        for(int i=0;i<iceCreams.size();i++)
            outFlavours[i] = iceCreams.get(i).getIceCreamFlavour();
        return outFlavours;
    }

}
