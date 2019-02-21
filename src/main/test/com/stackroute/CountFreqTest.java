package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;

import static org.junit.Assert.*;

public class CountFreqTest {

    CountFreq cf;

    @Before
    public void setUp() throws Exception {
        cf = new CountFreq();
    }

    @After
    public void tearDown() throws Exception {
        cf = null;
    }

    @Test
    public void TestOfListFirst() throws IOException {

        HashMap expected= new HashMap();
        expected.put("one",5);
        expected.put("two",2);
        expected.put("three",2);

        String str="one one -one___two,,three,one @three*one?two";
        String input[]={"one","two", "three"};
        HashMap actual= cf.check(str, input);

        assertEquals("msg",expected,actual);

        assertNotNull(cf);
        assertEquals(expected,actual);
        assertNotNull(cf);

    }
}