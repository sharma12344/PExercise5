/* a program to implement set interface which sorts the given randomly ordered names in
ascending order. Convert the sorted set in to an array list*/

package com.stackroute;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class SortAsc {
    //this method sorts the elements of treeset
    public TreeSet sortAsc(String[] s) {
        TreeSet<String> set = new TreeSet<>();
        for (int i = 0; i < s.length; i++) {
            set.add(s[i]);
        }
        return set;
    }


}
