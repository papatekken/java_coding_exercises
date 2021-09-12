package com.techreturners.exercise003;

public class IceCream{
    private String iceCreamFlavour;
    private int iceCreamCode;

    public IceCream(String iceCreamFlavour, int iceCreamCode) {
        this.iceCreamFlavour = iceCreamFlavour;
        this.iceCreamCode = iceCreamCode;
    }

    public String getIceCreamFlavour() {
        return iceCreamFlavour;
    }

    public int geticeCreamCode() {
        return iceCreamCode;
    }    
}