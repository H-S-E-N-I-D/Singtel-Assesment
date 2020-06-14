package com.singtel.devtest;

import com.singtel.devtest.model.Fish;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
public class FishTest extends PrintLineTest {

    @Test
    public void swimTest() {
        new Fish().swim();
        String expected = "I am swimming" + System.lineSeparator();
        Assert.isTrue(expected.equals(outContent.toString()), "Fish cannot swim");
    }

    @Test
    public void singTest() {
        //new Fish().sing();    //Fish can't sing

    }

    @Test
    public void walkTest() {
        //new Fish().walk();  //Fish can't walk

    }



}
