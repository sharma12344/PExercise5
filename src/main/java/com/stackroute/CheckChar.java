/*A program where an array of strings is input and output is a Map<String,boolean> where
each different string is a key and its value is true if that string appears 2 or more times in the array*/

package com.stackroute;

import java.util.HashMap;

public class CheckChar {
    public HashMap checkCharacter(String[] input) {
        //this method checks if frequency of occurence of any string is more than 2
        int len[] = new int[input.length];
        boolean output[] = new boolean[input.length];

        HashMap hashMap = new HashMap();


        for (int i = 0; i < input.length; i++) {
            int count = 0;
            for (int j = 0; j < input.length - 1; j++) {
                if (input[i].equals(input[j]))
                    len[i] = count++;
                if (len[i] > 0)
                    output[i] = true;
                else output[i] = false;
            }

        }


        for (int i = 0; i < len.length; i++) {
            hashMap.put(input[i], output[i]);

        }

        return hashMap;
    }

}

