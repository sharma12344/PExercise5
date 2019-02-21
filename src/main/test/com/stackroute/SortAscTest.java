package com.stackroute;

import com.sun.source.tree.Tree;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

import static org.junit.Assert.*;

public class SortAscTest {
    SortAsc sa;

    @Before
    public void setUp() throws Exception {
        sa= new SortAsc();
    }

    @After
    public void tearDown() throws Exception {
        sa = null;
    }

    @Test
    public void test1() throws IOException {


        TreeSet<String> Expected= new TreeSet<String>();
        Expected.add("Alice");
        Expected.add("Bluto");
        Expected.add("Eugene");
        Expected.add("Harry");
        Expected.add("Olive");

        String input[]={"Harry","Olive","Alice","Bluto","Eugene"};
        TreeSet actual= sa.sortAsc(input);
        assertEquals(Expected,actual);

        assertNotNull(sa);

    }

}