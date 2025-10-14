package com.paimon.lumine;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class FizzBuzz2Test {
    
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testFizzBuzzBasic() {
        FizzBuzz2.fizzybuzzy(15);
        String expected = "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n13\n14\nFizzBuzz\n";
        assertEquals(expected, outContent.toString());
    }

    @Test
    public void testFizzBuzzSingleNumber() {
        outContent.reset();
        FizzBuzz2.fizzybuzzy(1);
        String expected = "1\n";
        assertEquals(expected, outContent.toString());
    }

    @Test
    public void testFizzBuzzMultipleOfThree() {
        outContent.reset();
        FizzBuzz2.fizzybuzzy(3);
        String expected = "1\n2\nFizz\n";
        assertEquals(expected, outContent.toString());
    }

    @Test
    public void testFizzBuzzMultipleOfFive() {
        outContent.reset();
        FizzBuzz2.fizzybuzzy(5);
        String expected = "1\n2\nFizz\n4\nBuzz\n";
        assertEquals(expected, outContent.toString());
    }

    @Test
    public void testFizzBuzzMultipleOfFifteen() {
        outContent.reset();
        FizzBuzz2.fizzybuzzy(30);
        String output = outContent.toString();
        
        // Check that 15 and 30 produce "FizzBuzz"
        String[] lines = output.split("\n");
        assertEquals("FizzBuzz", lines[14]); // 15th element (index 14)
        assertEquals("FizzBuzz", lines[29]); // 30th element (index 29)
    }

    @Test
    public void testFizzBuzzZero() {
        outContent.reset();
        FizzBuzz2.fizzybuzzy(0);
        String expected = "";
        assertEquals(expected, outContent.toString());
    }

    @Test
    public void testSpecificNumbers() {
        outContent.reset();
        FizzBuzz2.fizzybuzzy(6);
        String output = outContent.toString();
        String[] lines = output.split("\n");
        
        assertEquals("1", lines[0]);   // 1
        assertEquals("2", lines[1]);   // 2
        assertEquals("Fizz", lines[2]); // 3
        assertEquals("4", lines[3]);   // 4
        assertEquals("Buzz", lines[4]); // 5
        assertEquals("Fizz", lines[5]); // 6
    }
}