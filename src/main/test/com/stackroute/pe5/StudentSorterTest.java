package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class StudentSorterTest {

    private StudentSorter studentSorter;

    @Before
    public void setUp() throws Exception {
        studentSorter = new StudentSorter();
    }

    @Test
    public void givenStudentDetailsReturnsDetailsInDescendingOrder() {
        ArrayList<Student> actualArrayList = new ArrayList<>();
        actualArrayList.add(new Student(101,"Vijay",23));
        actualArrayList.add(new Student(106,"Ajay",27));
        actualArrayList.add(new Student(105,"Jai",21));
        Collections.sort(actualArrayList, new StudentSorter());
        Collections.reverse(actualArrayList);
        ArrayList<Student> expectedArrayList = new ArrayList<>();
        expectedArrayList.add(new Student(106,"Ajay",27));
        expectedArrayList.add(new Student(101,"Vijay",23));
        expectedArrayList.add(new Student(105,"Jai",21));
        assertEquals(expectedArrayList.toString(), actualArrayList.toString());
    }

    @Test
    public void givenSameAgeStudentDetailReturnsDetailsSortedUsingAgeInDescendingOrder() {
        ArrayList<Student> actualArrayList = new ArrayList<>();
        actualArrayList.add(new Student(101,"Ajay",23));
        actualArrayList.add(new Student(106,"Vijay",23));
        actualArrayList.add(new Student(105,"Jai",21));
        Collections.sort(actualArrayList, new StudentSorter());
        Collections.reverse(actualArrayList);
        ArrayList<Student> expectedArrayList = new ArrayList<>();
        expectedArrayList.add(new Student(106,"Vijay",23));
        expectedArrayList.add(new Student(101,"Ajay",23));
        expectedArrayList.add(new Student(105,"Jai",21));
        assertEquals(expectedArrayList.toString(), actualArrayList.toString());
    }

    @Test
    public void givenSameNameSameAgeStudentDetailsReturnsDetailsSortedUsingIdInDescendingOrder() {
        ArrayList<Student> actualArrayList = new ArrayList<>();
        actualArrayList.add(new Student(105,"Vijay",23));
        actualArrayList.add(new Student(101,"Vijay",23));
        actualArrayList.add(new Student(106,"Jai",21));
        Collections.sort(actualArrayList, new StudentSorter());
        Collections.reverse(actualArrayList);
        ArrayList<Student> expectedArrayList = new ArrayList<>();
        expectedArrayList.add(new Student(105,"Vijay",23));
        expectedArrayList.add(new Student(101,"Vijay",23));
        expectedArrayList.add(new Student(106,"Jai",21));
        assertEquals(expectedArrayList.toString(), actualArrayList.toString());
    }

    @After
    public void tearDown() throws Exception {
        studentSorter = null;
    }
}
