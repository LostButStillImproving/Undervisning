package com.testing.kapitel1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExampleTests {

    @Test
    public void AdduptoNtest() {
        opgaver calc = new opgaver();
        int result = calc.AddupToN(10);
        assertEquals(55,result);
    }
}