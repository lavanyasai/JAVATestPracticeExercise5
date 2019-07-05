package com.stackroute.pe5;

import java.util.Iterator;
import java.util.Map;

/*
Modifies values of map and returns the modified map.
 */

public class ModifyValuesOfMap {

    static Map<String, String> modifyKeyValuePairs(Map<String, String> stringMap) {
        Iterator<Map.Entry<String, String>> iterator = stringMap.entrySet().iterator();
        if (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            String word = " ";
            if (!stringMap.get("val1").equals(" ")) {
                word = entry.getValue();
                stringMap.put("val1", " ");
            }
            Map.Entry<String, String> presentEntry = iterator.next();
            if (word != null) {
                presentEntry.setValue(word);
            }
        }
        return stringMap;
    }
}
