package com.techreturners.exercise003;

import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Exercise003Test {

    private Exercise003 ex003;
    
    @Before
    public void setup() {
        ex003 = new Exercise003();
    }

    @Test
    public void checkGetIceCreamCodeForMintChocolateChip() {
        String iceCreamFlavour = "Mint Chocolate Chip";
        int expected = 3;
        assertEquals(expected, ex003.getIceCreamCode(iceCreamFlavour));
    }

    @Test
    public void checkGetIceCreamCodeForMangoSorbet() {
        String iceCreamFlavour = "Mango Sorbet";
        int expected = 5;
        assertEquals(expected, ex003.getIceCreamCode(iceCreamFlavour));
    }

    @Test
    public void checkGetIceCreamCodeForRaspberryRipple() {
        String iceCreamFlavour = "Raspberry Ripple";
        int expected = 1;
        assertEquals(expected, ex003.getIceCreamCode(iceCreamFlavour));
    }

    @Test
    public void checkPickMultipleIceCreamFlavours() {
        String[] expected = { "Pistachio", "Raspberry Ripple", "Vanilla", "Mint Chocolate Chip", "Chocolate", "Mango Sorbet" };
        assertArrayEquals(expected, ex003.iceCreamFlavours());
    }

    
    // *** additional test ***
    @Test
    public void checkPickMultipleIceCreamCode() {
        int[] expected = { 0,1,2,3,4,5 };
        String[] iceCreamFlavours = ex003.iceCreamFlavours();
        int[] iceCreamCodes = new int[iceCreamFlavours.length];
        for(int i =0;i<iceCreamFlavours.length;i++)
            iceCreamCodes[i] = ex003.getIceCreamCode(iceCreamFlavours[i]);
        assertArrayEquals(expected, iceCreamCodes);
    }
}
