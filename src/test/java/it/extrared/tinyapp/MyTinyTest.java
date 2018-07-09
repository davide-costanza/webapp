package it.extrared.tinyapp;

import org.junit.Test;
import static org.junit.Assert.*;

public class MyTinyTest {

    @Test
    public void testConcatenate() {
        MyTiny myTiny = new MyTiny();

        String result = myTiny.concatenate("one", "two");

        assertEquals("onetwo", result);
    }
}

