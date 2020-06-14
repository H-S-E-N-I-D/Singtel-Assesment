package com.singtel.devtest;

import com.singtel.devtest.model.Chicken;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
public class ChickenTest extends PrintLineTest{



    @Test
    public void singTest() {
        new Chicken().sing();
        String expected = "Cluck, cluck" + System.lineSeparator();
        Assert.isTrue(expected.equals(outContent.toString()), "Chicken sound is not Cluck, cluck");
    }

    @Test
    public void flyTest() {
        //new Chicken().fly(); no fly method for chicken
    }
}
