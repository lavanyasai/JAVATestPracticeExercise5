package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

import static org.junit.Assert.*;

public class ModifyValuesOfMapTest {

    private ModifyValuesOfMap modifyValuesOfMap;
    private Map<String, String> expectedResult;
    private Map<String, String> actualResult;

    @Before
    public void setUp() throws Exception {
        modifyValuesOfMap = new ModifyValuesOfMap();
    }

    @Test
    public void givenKeysValuesReturnsModifiedKeyValuePairs() {
        actualResult = new TreeMap<>();
        actualResult.put("val1", "java");
        actualResult.put("val2", "c++");
        actualResult = modifyValuesOfMap.modifyKeyValuePairs(actualResult);
        expectedResult = new TreeMap<>();
        expectedResult.put("val1", " ");
        expectedResult.put("val2", "java");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void givenEmptyValueReturnsModifiedKeyValuePairs() {
        actualResult = new TreeMap<>();
        actualResult.put("val1", " ");
        actualResult.put("val2", "c++");
        actualResult = modifyValuesOfMap.modifyKeyValuePairs(actualResult);
        expectedResult = new TreeMap<>();
        expectedResult.put("val1", " ");
        expectedResult.put("val2", " ");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void givenEmptyTreeMapReturnsEmptyTreeMap() {
        actualResult = new TreeMap<>();
        actualResult = modifyValuesOfMap.modifyKeyValuePairs(actualResult);
        expectedResult = new TreeMap<>();
        assertEquals(expectedResult, actualResult);
    }

    @After
    public void tearDown() throws Exception {
        modifyValuesOfMap = null;
    }
}