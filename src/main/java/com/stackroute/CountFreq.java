/* Write a program to find the number of counts in the following String. Store the output in
Map<String,Integer> as key value pair. */

package com.stackroute;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CountFreq {
    //this method will take an input sring and count frequency of occurence of each word
    public HashMap check(String string, String[] input) {
        int array[] = new int[input.length];
        int len[] = new int[input.length];

        HashMap hashMap = new HashMap();

        input[0].length();
        for (int i = 0; i < array.length; i++) {
            array[i] = string.length() - (string.replaceAll(input[i], "").length());
        }

        for (int i = 0; i < array.length; i++) {
            len[i] = input[i].length();
        }

        for (int i = 0; i < array.length; i++) {
            hashMap.put(input[i], (array[i] / len[i]));
        }

        return hashMap;
    }

}
