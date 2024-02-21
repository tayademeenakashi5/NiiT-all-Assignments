package com.jap;

import com.jap.GameDemo;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class GameDemoTest {
GameDemo demo;
    @Before
    public void setUp(){
        demo = new GameDemo();
    }

    @After
    public void tearDown(){
        demo = null;
    }


    @Test
    public void divideNumberWithTwoPositiveNumbers(){
        String result = demo.divideByNumber(10, 2);
        assertEquals("Expected remainder for 10 divided by 2 is 5", "5", result);

    }

    @Test
    public void divideNumberWithPositiveAndZeroNumber(){
        assertEquals("java.lang.ArithmeticException: / by zero",demo.divideByNumber(10,0));
    }
}