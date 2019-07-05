package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class SortRandomlyOrderedNamesTest {

    SortRandomlyOrderedNames sortRandomlyOrderedNames;
    List<String> expectedResult;
    List<String> actualResult;
    @Before
    public void setUp() throws Exception {
        sortRandomlyOrderedNames = new SortRandomlyOrderedNames();
    }

    @Test
    public void givenSetOfStringsReturnsSortedNames() {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("Harry");
        stringSet.add("Olive");
        stringSet.add("Alice");
        stringSet.add("Bluto");
        stringSet.add("Eugene");
        actualResult = sortRandomlyOrderedNames.sortRandomlyOrderedNames(stringSet);
        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("Alice");
        expectedResult.add("Bluto");
        expectedResult.add("Eugene");
        expectedResult.add("Harry");
        expectedResult.add("Olive");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void givenNumberSetOfStringsReturnsSortedStrings() {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("123");
        stringSet.add("765");
        stringSet.add("456");
        stringSet.add("398");
        actualResult = sortRandomlyOrderedNames.sortRandomlyOrderedNames(stringSet);
        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("123");
        expectedResult.add("398");
        expectedResult.add("456");
        expectedResult.add("765");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void givenNullStringReturnsNull() {
        Set<String> stringSet = new HashSet<>();
        actualResult = sortRandomlyOrderedNames.sortRandomlyOrderedNames(stringSet);
        List<String> expectedResult = new ArrayList<>();
        assertEquals(expectedResult, actualResult);
    }

    @After
    public void tearDown() throws Exception {
        sortRandomlyOrderedNames = null;
    }
}