package com.stackroute.pe5;

import java.util.*;

/*
Sorts the given randomly ordered names in ascending order.
 */

public class SortRandomlyOrderedNames {

    public static List<String> sortRandomlyOrderedNames(Set<String> stringSet) {
        Set<String> stringTreeSet = new TreeSet<>(stringSet);

        List<String> stringList = new ArrayList<>(stringTreeSet);
        return stringList;
    }
}
