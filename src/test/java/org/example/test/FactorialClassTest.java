package org.example.test;

import org.example.FactorialClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class FactorialClassTest {

    @Test
    public void getFactorial() {
        int x = FactorialClass.getFactorial(3);
        assertEquals(6, x);
    }

}
