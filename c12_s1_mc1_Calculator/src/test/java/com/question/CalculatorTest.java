package com.question;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator calculator =null;
    @Before
    public void setUp() throws Exception {
        calculator =new Calculator();
    }

    @After
    public void tearDown() throws Exception {
        calculator = null;
    }

    @Test
    public void add() {
        int addResult1 = calculator.add(15,17);
        int addResult2 = calculator.add(-15,17);
        assertEquals(32,addResult1);
        assertEquals(2,addResult2);
    }

    @Test
    public void subtract() {
        int subResult1 = calculator.subtract(37,7);
        int subResult2 = calculator.subtract(37,-7);
        assertEquals(30,subResult1);
        assertEquals(44,subResult2);
    }

    @Test
    public void multiply() {
        double mulResult1 = calculator.multiply(5,6);
        double mulResult2 = calculator.multiply(-5,6);
        double mulResult3 = calculator.multiply(2.2,2);
        assertEquals(30,mulResult1,0);
        assertEquals(-30,mulResult2,0);
        assertEquals(4.4,mulResult3,0);
    }

    @Test
    public void modulo() {
        int modResult1 = calculator.modulo(10,3);
        assertEquals(1,modResult1);
    }

    @Test
    public void divide() {
        int divResult1 = calculator.divide(30,6);
        int divResult2 = calculator.divide(30,-6);
        assertEquals(5,divResult1);
        assertEquals(-5,divResult2);
    }
}