package com.singtel.devtest;

import com.singtel.devtest.model.Butterfly;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
public class ButterflyTest extends PrintLineTest {

    @Test
    public void flyTest() {
        new Butterfly().fly();
        String expected = "I am flying" + System.lineSeparator();
        Assert.isTrue(expected.equals(outContent.toString()), "Butterfly cannot fly");
    }


}
