/*Java program to update specific array element by given element and empty the array list.*/

package com.stackroute;

import java.util.*;

public class ALProgram {
    public ArrayList checkList(ArrayList arrayList) {
        //this method replaces at particular index
        arrayList.set(0, "Kiwi");
        arrayList.set(2, "Mango");
        return arrayList;
    }

    public ArrayList removeList(ArrayList arrayList) {
        //this method clears the array list
        arrayList.clear();
        return arrayList;
    }

}
