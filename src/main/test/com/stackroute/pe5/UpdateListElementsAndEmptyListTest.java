package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class UpdateListElementsAndEmptyListTest {

    private UpdateListElementsAndEmptyList updateListElementsAndEmptyList;
    private List<String> expectedList;
    private List<String> actualList;

    @Before
    public void setUp() throws Exception {
        updateListElementsAndEmptyList = new UpdateListElementsAndEmptyList();
    }

    @Test
    public void givenListReturnsUpdatedList() {
        List<String> stringActualList = new ArrayList<>();
        stringActualList.add("Apple");
        stringActualList.add("Grape");
        stringActualList.add("Melon");
        stringActualList.add("Berry");
        actualList = UpdateListElementsAndEmptyList.updateList(stringActualList, new int[] {0, 2}, new String[] {"Kiwi", "Mango"});
        List<String> stringExpectedList = new ArrayList<>();
        stringExpectedList.add("Kiwi");
        stringExpectedList.add("Grape");
        stringExpectedList.add("Mango");
        stringExpectedList.add("Berry");
        expectedList = stringExpectedList;
        assertEquals(expectedList, actualList);
    }

    @Test
    public void givenListReturnsEmptyList() {
        List<String> stringActualList = new ArrayList<>();
        stringActualList.add("Apple");
        stringActualList.add("Grape");
        stringActualList.add("Melon");
        stringActualList.add("Berry");
        actualList = UpdateListElementsAndEmptyList.emptyList(stringActualList, new int[] {0, 2}, new String[] {"Kiwi", "Mango"});
        assertEquals(Collections.emptyList(), actualList);
    }

    @Test
    public void givenSingleModifyListReturnsListWithOneModification() {
        List<String> stringActualList = new ArrayList<>();
        stringActualList.add("Apple");
        stringActualList.add("Grape");
        stringActualList.add("Melon");
        stringActualList.add("Berry");
        actualList = UpdateListElementsAndEmptyList.emptyList(stringActualList, new int[] {0}, new String[] {"Kiwi"});
        assertEquals(Collections.emptyList(), actualList);
    }

    @After
    public void tearDown() throws Exception {
        updateListElementsAndEmptyList = null;
    }
}