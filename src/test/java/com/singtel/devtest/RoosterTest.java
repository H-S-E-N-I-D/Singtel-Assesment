package com.singtel.devtest;

import com.singtel.devtest.model.Rooster;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
public class RoosterTest extends PrintLineTest {


    /*@Test
    public void singTest() {
        new Rooster().sing();
        String expected = "Cock-a-doodle-doo" + System.lineSeparator();
        Assert.isTrue(expected.equals(outContent.toString()), "Rooster sound is not 'Cock-a-doodle-doo'");
    }

    @Test
    public void flyTest() {
        //new Rooster().fly(); no fly method for Rooster
    }*/
    @Test
    public void danishRoosterTest() {
        String language1 = "Danish";
        new Rooster(language1).sing();
        String expected = "kykyliky" + System.lineSeparator();
        Assert.isTrue(expected.equals(outContent.toString()), "Danish rooster sound is not 'kykyliky'");
    }

    @Test
    public void greekRoosterTest() {
        String language = "Greek";
        new Rooster(language).sing();
        String expected = "kikiriki" + System.lineSeparator();
        Assert.isTrue(expected.equals(outContent.toString()), "Greek rooster sound is not 'kikiriki'");
    }

    @Test
    public void japaneseRoosterTest() {
        String language = "Japanese";

        new Rooster(language).sing();
        String expected = "ko-ke-kok-ko-o" + System.lineSeparator();
        Assert.isTrue(expected.equals(outContent.toString()), "Japanese rooster sound is not 'ko-ke-kok-ko-o'");
    }


}
