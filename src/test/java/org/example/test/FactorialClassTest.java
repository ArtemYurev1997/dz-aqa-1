package org.example.test;

import org.example.FactorialClass;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialClassTest {

    @Test
    public void getFactorial() {
        int x = FactorialClass.getFactorial(3);
        assertEquals(6, x);
    }

}
