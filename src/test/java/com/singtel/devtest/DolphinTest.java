package com.singtel.devtest;

import com.singtel.devtest.model.Dolphin;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
public class DolphinTest extends PrintLineTest {

    @Test
    public void swimTest() {
        new Dolphin().swim();
        String expected = "I am swimming" + System.lineSeparator();
        Assert.isTrue(expected.equals(outContent.toString()), "Dolphin cannot swim");
    }
}
