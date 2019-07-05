package com.stackroute.pe5;

import java.util.List;

/*
Updates list elements and clears the array list.
 */

public class UpdateListElementsAndEmptyList {

    public static List<String> updateList(List<String> stringList, int[] index, String[] element) {
        for(int i=0; i< index.length; i++) {
            stringList.set(index[i], element[i]);
        }
        return stringList;
    }

    public static List<String> emptyList(List<String> stringList, int[] index, String[] element) {
        for(int i=0; i< index.length; i++) {
            stringList.set(index[i], element[i]);
        }
        stringList.clear();
        return stringList;
    }
}
