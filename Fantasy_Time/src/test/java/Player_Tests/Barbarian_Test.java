package Player_Tests;

import Players.Warriors.Barbarian;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Barbarian_Test {

    Barbarian barbarian;

    @Before
    public void before() {
        barbarian = new Barbarian("Conan", 600);
    }

    @Test
    public void hasName() {
        assertEquals("Conan", barbarian.getName());
    }

}
