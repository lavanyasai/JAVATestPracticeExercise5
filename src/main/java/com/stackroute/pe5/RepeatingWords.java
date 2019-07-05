package com.stackroute.pe5;

import java.util.Map;
import java.util.TreeMap;

/*
Checks whether the string appears 2 or more times in the array.
 */

public class RepeatingWords {
    public static Map<String, Boolean> checkWhetherTheWordsAreRepeatingMoreThanTwoTimes(String[] inputString) {
        Map<String, Boolean> stringBooleanMap = new TreeMap<>();
        for(int i=0; i<inputString.length; i++) {
            String foundWord = inputString[i];
            if(!stringBooleanMap.containsKey(foundWord)) {
                stringBooleanMap.put(foundWord, false);
            }
            else {
                stringBooleanMap.put(foundWord, true);
            }
        }
        return stringBooleanMap;
    }
}
