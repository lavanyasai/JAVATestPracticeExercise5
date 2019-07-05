package com.stackroute.pe5;

import java.util.Comparator;


/*
Sorts the list of student details in decreasing order, for student having same age, sorts based on their names.
For students having same name and age, sort them according to their ID.
 */

public class StudentSorter implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        if(s1.getAge() - s2.getAge() == 0) {
            if((s1.getName().compareTo(s2.getName())) == 0) {
                return s1.getId() - s2.getId();
            }
            else {
                return s1.getName().compareTo(s2.getName());
            }
        }
        return s1.getAge() - s2.getAge();
    }
}
