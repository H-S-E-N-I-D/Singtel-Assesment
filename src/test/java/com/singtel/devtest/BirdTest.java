package com.singtel.devtest;

import com.singtel.devtest.model.Bird;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class BirdTest extends PrintLineTest {

    @Test
    public void singTest() {
        new Bird().sing();
        String expected = "I am singing" + System.lineSeparator();
        Assert.isTrue(expected.equals(outContent.toString()), "Bird can't sing");
    }

    //Now every Bird cannot fly
    /*@Test
    public void flyTest() {
        new Bird().fly();
        String expected = "I am flying" + System.lineSeparator();
        Assert.isTrue(expected.equals(outContent.toString()), "Bird can't fly");
    }*/

    @Test
    public void walkTest() {
        new Bird().walk();
        String expected = "I am walking" + System.lineSeparator();
        Assert.isTrue(expected.equals(outContent.toString()), "Bird can't walk");
    }
}
