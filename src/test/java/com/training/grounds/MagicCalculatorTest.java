package com.training.grounds;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MagicCalculatorTest {

    private MagicCalculator magicCalculator;

    @Before
    public void setup(){
        magicCalculator = new MagicCalculator();
    }

    @Test
    public void isAMagicCalculator(){
        assertTrue(magicCalculator.getClass().getSuperclass().getName().equals("com.training.grounds.Calculator"));
    }

    @Test
    public void canDynamicallyAdd(){
        int answer = magicCalculator.calculateDynamically("add", 3, 301);

        assertEquals(304, answer);
    }

    @Test
    public void canDynamicallyAddSomethingElse(){
        int answer = magicCalculator.calculateDynamically("add", 67, 111);

        assertEquals(178, answer);
    }

    @Test
    public void canDynamicallyMultiply(){
        int answer = magicCalculator.calculateDynamically("multiply", 3, 10);

        assertEquals(30, answer);
    }

    @Test
    public void canDynamicallyMultiplySomethingElse(){
        int answer = magicCalculator.calculateDynamically("multiply", 2, 1000);

        assertEquals(2000, answer);
    }

    @Test
    public void canDynamicallyDivide(){
        int answer = magicCalculator.calculateDynamically("divide", 3, 1);

        assertEquals(3, answer);
    }

    @Test
    public void canDynamicallyDivideSomethingElse(){
        int answer = magicCalculator.calculateDynamically("divide", 1000, 2);

        assertEquals(500, answer);
    }

    @Test
    public void canFilterNumbersFromAListUnderAThreshold(){
        List<Integer> numbers = Arrays.asList(20,5002,1,11,2000,202);
        List<Integer> expectedResult = new ArrayList<Integer>(Arrays.asList(5002,2000));

        List<Integer> answer = magicCalculator.filterNumbersByThreshold(numbers,2000);

        assertEquals(answer.toString(), expectedResult.toString());




    }
}
