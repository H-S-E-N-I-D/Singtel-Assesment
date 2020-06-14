package com.singtel.devtest;

import com.singtel.devtest.model.Rooster;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
public class RoosterTest extends PrintLineTest {


    @Test
    public void singTest() {
        new Rooster().sing();
        String expected = "Cock-a-doodle-doo" + System.lineSeparator();
        Assert.isTrue(expected.equals(outContent.toString()), "Rooster sound is not 'Cock-a-doodle-doo'");
    }

    @Test
    public void flyTest() {
        //new Rooster().fly(); no fly method for Rooster
    }


}
