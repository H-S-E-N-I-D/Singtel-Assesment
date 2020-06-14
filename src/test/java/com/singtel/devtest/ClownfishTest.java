package com.singtel.devtest;

import com.singtel.devtest.model.Clownfish;
import com.singtel.devtest.model.Fish;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
public class ClownfishTest extends PrintLineTest {

    @Test
    public void sizeTest() {
        Fish.Size expectedSize =  new Clownfish().getSize();
        Assert.isTrue(expectedSize.equals(Fish.Size.SMALL), "Clownfish is not small");
    }

    @Test
    public void colorTest() {
        Fish.Color expectedColor =  new Clownfish().getColor();
        Assert.isTrue(expectedColor.equals(Fish.Color.ORANGE), "Clownfish is not orange");
    }

    @Test
    public void fishEatTest() {
        //new Clownfish().eat(new Fish());  Clownfish is not a fish eater

    }


}
