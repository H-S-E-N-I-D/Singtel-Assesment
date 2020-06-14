package com.singtel.devtest;

import com.singtel.devtest.model.Caterpillar;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
public class CaterpillarTest extends PrintLineTest {

    @Test
    public void testBeforeTransform() {
        Caterpillar caterpillar=new Caterpillar();
        Assert.isTrue(caterpillar.isCaterpillar(), "Caterpillar is a Butterfly");
        Assert.isTrue(!caterpillar.isButterfly(), "Caterpillar is a Caterpillar");

    }

    @Test
    public void testAfterTransform() {
        Caterpillar caterpillar=new Caterpillar();
        caterpillar.transform();
        Assert.isTrue(!caterpillar.isCaterpillar(), "Caterpillar is a Butterfly");
        Assert.isTrue(caterpillar.isButterfly(), "Caterpillar is a Caterpillar");

    }

}
