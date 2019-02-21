/*a method that accepts a Map object having two key-value pairs with the keys val1 and val2.
Modify and return the given map as follows:
a. If the key `val1` has a value, set the key `val2` to have that value, and
b. Set the key `val1` to have the value `" "` (empty string).*/
package com.stackroute;

import java.util.HashMap;

public class MapRep {
    public HashMap checkMap() {
        //this method replaces value at one key with value from another
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("val1", "Java");
        map.put("val2", "C++");
        if (map.containsKey("val1")) {
            String aValue = map.get("val1");
            map.put("val2", aValue);
            map.put("val1", " ");
        }
        return map;

    }
}
