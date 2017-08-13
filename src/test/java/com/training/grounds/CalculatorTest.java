package com.training.grounds;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setup(){
        calculator = new Calculator();
    }

    @Test
    public void calculatorCanAddTwoNumbersTogether(){

        int answer = calculator.add(3,7);

        assertEquals("Incorrect sum of numbers!", 10, answer);

    }

//    @Test
//    public void calculatorCanAddTwoDifferentNumbersTogether(){
//
//        int answer = calculator.add(22,6);
//
//        assertEquals("Incorrect sum of numbers!", 28, answer);
//
//    }
//
//    @Test
//    public void calculatorCanDivideTwoNumbers(){
//
//        int answer = calculator.divide(10,2);
//
//        assertEquals("Incorrect quotient of numbers!", 5, answer);
//
//    }
//
//    @Test
//    public void calculatorCanMultiplyTwoNumbers(){
//
//        int answer = calculator.multiply(10,3);
//
//        assertEquals("Incorrect product of numbers!", 30, answer);
//    }
//
//    @Test
//    public void calculatorCanMultiplyTwoDifferentNumbers(){
//
//        int answer = calculator.multiply(15,5);
//
//        assertEquals("Incorrect product of numbers!", 75, answer);
//    }
//
//    @Test
//    public void canSumAnArrayOfNumbers(){
//
//        int answer = calculator.add(new int[]{1,2,3,4,5,6});
//
//        assertEquals("Incorrect sum of numbers!", 21, answer);
//
//    }
//
//    @Test
//    public void canSumADifferentArrayOfNumbers(){
//
//        int answer = calculator.add(new int[]{201,202,111,2000,3});
//
//        assertEquals("Incorrect sum of numbers!", 2517, answer);
//
//    }
//
//    @Test
//    public void canSumAListOfNumbers(){
//
//        int answer = calculator.add(Arrays.asList(1,2,3,4,5,6));
//
//        assertEquals("Incorrect sum of numbers!", 21, answer);
//
//    }
//
//    @Test
//    public void canSumADifferentListOfNumbers(){
//
//        int answer = calculator.add(Arrays.asList(201,202,111,2000,3));
//
//        assertEquals("Incorrect sum of numbers!", 2517, answer);
//
//    }

}
