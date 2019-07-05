package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

import static org.junit.Assert.*;

public class RepeatingWordsTest {

    private RepeatingWords repeatingWords;
    private Map<String, Boolean> actualResult = new TreeMap<>();
    private Map<String, Boolean> expectedResult = new TreeMap<>();

    @Before
    public void setUp() throws Exception {
        repeatingWords = new RepeatingWords();
    }

    @Test
    public void givenStringReturnsWhetherTheWordIsRepeatedMoreThanTwoTimes() {
        actualResult = repeatingWords.checkWhetherTheWordsAreRepeatingMoreThanTwoTimes(new String[] {"a", "b", "c", "d", "a", "c", "c"});
        expectedResult.put("a", true);
        expectedResult.put("b", false);
        expectedResult.put("c", true);
        expectedResult.put("d", false);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void givenNullStringReturnsNullString() {
        actualResult = repeatingWords.checkWhetherTheWordsAreRepeatingMoreThanTwoTimes(new String[] {});
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void givenNonRepeatingStringArrayReturnsAllFalse() {
        actualResult = repeatingWords.checkWhetherTheWordsAreRepeatingMoreThanTwoTimes(new String[] {"a", "b", "c", "d"});
        expectedResult.put("a", false);
        expectedResult.put("b", false);
        expectedResult.put("c", false);
        expectedResult.put("d", false);
        assertEquals(expectedResult, actualResult);
    }

    @After
    public void tearDown() throws Exception {
        repeatingWords = null;
    }
}