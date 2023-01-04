package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
   Calculator testing= new Calculator();
    @Test
    public void zeroTimesZero()
    {
        int multiplicand= 0;
        int multiplier= 0;
        int expectedProduct= 0;

        int actualProduct= testing.multiply(multiplicand, multiplier);

        assertEquals(expectedProduct, actualProduct);
    }

    @Test
    public void zeroTimesFive()
    {
        int multiplicand= 0;
        int multiplier= 5;
        int expectedProduct= 0;

        int actualProduct= testing.multiply(multiplicand, multiplier);

        assertEquals(expectedProduct, actualProduct);
    }

    @Test
    public void fiveTimesZero()
    {
        int multiplicand= 5;
        int multiplier= 0;
        int expectedProduct= 0;

        int actualProduct= testing.multiply(multiplicand, multiplier);

        assertEquals(expectedProduct, actualProduct);
    }

    @Test
    public void oneTimesNine()
    {
        int multiplicand= 1;
        int multiplier= 9;
        int expectedProduct= 9;

        int actualProduct= testing.multiply(multiplicand, multiplier);

        assertEquals(expectedProduct, actualProduct);
    }

    @Test
    public void nineTimesone()
    {
        int multiplicand= 9;
        int multiplier= 1;
        int expectedProduct= 9;

        int actualProduct= testing.multiply(multiplicand, multiplier);

        assertEquals(expectedProduct, actualProduct);
    }

    @Test
    public void fiveTimesTwo()
    {
        int multiplicand= 5;
        int multiplier= 2;
        int expectedProduct= 10;

        int actualProduct= testing.multiply(multiplicand, multiplier);

        assertEquals(expectedProduct, actualProduct);
    }
}
