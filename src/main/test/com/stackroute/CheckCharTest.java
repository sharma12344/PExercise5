package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;

import static org.junit.Assert.*;

public class CheckCharTest {

    CheckChar cc;

    @Before
    public void setUp() throws Exception {
        cc = new CheckChar();
    }

    @After
    public void tearDown() throws Exception {
        cc = null;
    }

    @Test
    public void TestOfListFirst() throws IOException {

        HashMap expected= new HashMap();
        expected.put("a",true);
        expected.put("b",false);
        expected.put("c",true);
        expected.put("d",false);


        String input[]={"a","b","c","d","a","c","c"};
        HashMap actual= cc.checkCharacter(input);

        assertEquals("msg",expected,actual);

        assertNotNull(cc);
        assertEquals(expected,actual);
        // assertNotEquals(unexpected,actual);
        assertNotNull(cc);

    }

}