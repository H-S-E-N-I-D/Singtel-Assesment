package com.singtel.devtest;

import com.singtel.devtest.model.Duck;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
public class DuckTest extends PrintLineTest {


    @Test
    public void singTest() {
        new Duck().sing();
        String expected = "Quack, quack" + System.lineSeparator();
        Assert.isTrue(expected.equals(outContent.toString()), "Duck sound is not 'Quack, quack'");
    }

    @Test
    public void swimTest() {
        new Duck().swim();
        String expected = "I am swimming" + System.lineSeparator();
        Assert.isTrue(expected.equals(outContent.toString()), "Duck cannot swim");
    }
}
