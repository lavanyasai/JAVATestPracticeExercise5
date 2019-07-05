package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

import static org.junit.Assert.*;

public class NumberOfCountsTest {

    NumberOfCounts numberOfCounts;
    Map<String, Integer> actualResult = new TreeMap<>();
    Map<String, Integer> expectedResult = new TreeMap<>();
    @Before
    public void setUp() throws Exception {
        numberOfCounts = new NumberOfCounts();
    }

    @Test
    public void givenStringReturnsMapWithCounts() {
        actualResult = NumberOfCounts.numberOfCounts("one one -one___two,,three,one @three+one?two");
        expectedResult.put("one", 5);
        expectedResult.put("two", 2);
        expectedResult.put("three", 2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void givenStringReturnsCountOneForEveryWord() {
        actualResult = NumberOfCounts.numberOfCounts("@three+one?two");
        expectedResult.put("one", 1);
        expectedResult.put("two", 1);
        expectedResult.put("three", 1);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void givenNullStringReturnsEmptyMap() {
        actualResult = NumberOfCounts.numberOfCounts("");
        assertEquals(expectedResult, actualResult);
    }

    @After
    public void tearDown() throws Exception {
        numberOfCounts = null;
    }
}