package com.singtel.devtest;

import com.singtel.devtest.model.Fish;
import com.singtel.devtest.model.Shark;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
public class SharkTest extends PrintLineTest {

    @Test
    public void sizeTest() {
        Fish.Size expectedSize =  new Shark().getSize();
        Assert.isTrue(expectedSize.equals(Fish.Size.LARGE), "Shark is not large");
    }

    @Test
    public void colorTest() {
        Fish.Color expectedColor =  new Shark().getColor();
        Assert.isTrue(expectedColor.equals(Fish.Color.GREY), "Shark is not grey");
    }

    @Test
    public void fishEatTest() {
        new Shark().eat(new Fish());
        String expected = "I eat Fish" + System.lineSeparator();
        Assert.isTrue(expected.equals(outContent.toString()), "Shark is not eating fish");
    }


}
