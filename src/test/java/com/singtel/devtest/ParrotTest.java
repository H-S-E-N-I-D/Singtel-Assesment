package com.singtel.devtest;

import com.singtel.devtest.model.Parrot;
import com.singtel.devtest.util.Habitat;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
public class ParrotTest extends PrintLineTest {


    @Test
    public void singTestWithDogs() {
        new Parrot(Habitat.WITH_DOGS).sing();
        String expected = "Woof, woof" + System.lineSeparator();
        Assert.isTrue(expected.equals(outContent.toString()), "Parrot lives with dogs does't sound 'Woof, woof'");
    }

    @Test
    public void singTestWithCats() {
        new Parrot(Habitat.WITH_CATS).sing();
        String expected = "Meow" + System.lineSeparator();
        Assert.isTrue(expected.equals(outContent.toString()), "Parrot lives with cats does't sound 'Meow'");
    }

    @Test
    public void singTestWithRoosters() {
        new Parrot(Habitat.NEAR_ROOSTERS).sing();
        String expected = "Cock-a-doodle-doo" + System.lineSeparator();
        Assert.isTrue(expected.equals(outContent.toString()), "Parrot lives with roosters does't sound 'Cock-a-doodle-doo'");
    }
}
