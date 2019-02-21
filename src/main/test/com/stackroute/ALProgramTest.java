package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class ALProgramTest {
    ALProgram al;

    @Before
    public void setUp() throws Exception {
        al= new ALProgram();
    }

    @After
    public void tearDown() throws Exception {
        al = null;
    }

    @Test
    public void test1() throws IOException {


        ArrayList<String> Expected= new ArrayList<String>();
        Expected.add("Kiwi");
        Expected.add("Grape");
        Expected.add("Mango");
        Expected.add("Berry");

        ArrayList<String> arrayList= new ArrayList<String>();
        arrayList.add("Apple");
        arrayList.add("Grape");
        arrayList.add("Melon");
        arrayList.add("Berry");

        ArrayList actual= al.checkList(arrayList);
        assertEquals(Expected,actual);

        assertNotNull(al);

    }

    @Test
    public void test2() throws IOException {


        ArrayList<String> Expected= new ArrayList<String>();

        ArrayList<String> arrayList= new ArrayList<String>();
        arrayList.add("Apple");
        arrayList.add("Grape");
        arrayList.add("Melon");
        arrayList.add("Berry");

        ArrayList actual= al.removeList(arrayList);
        assertEquals(Expected,actual);

        assertNotNull(al);

    }

}