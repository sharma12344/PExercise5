/*Create a Student class that represents the following information of a student: id, name, and age
all the member variables should be private .
a. Implement `getter and setter` .
b. Create a `StudentSorter` class that implements `Comparator interface` .
c. Write a class `Maintest` create Student class object(minimum 5)
d. Add these student object into a List of type Student .
e. Sort the list based on their age in decreasing order, for student having
same age, sort based on their name.
f. For students having same name and age, sort them according to their ID.*/

package com.stackroute;

import java.util.Collections;
import java.util.*;

public class Student {
    public ArrayList<StudentSorter> check() {

        ArrayList<StudentSorter> obj = new ArrayList<StudentSorter>();
        obj.add(new StudentSorter(3, "upasana", 22));
        obj.add(new StudentSorter(1, "monu", 24));
        obj.add(new StudentSorter(2, "sonu", 23));
        obj.add(new StudentSorter(7, "sonu", 21));
        obj.add(new StudentSorter(9, "monu", 24));
        obj.add(new StudentSorter(10, "tina", 24));

        StudentSorter1 c = new StudentSorter1();
        Collections.sort(obj, c);
        for (StudentSorter stu : obj) {
            System.out.println(stu.id + " " + stu.name + " " + stu.age);
        }

        return obj;
    }
}

