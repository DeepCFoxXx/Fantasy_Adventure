package Player_Treasure_Tests;

import Player_Treasure.Ruby;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Ruby_Test {

    Ruby ruby;

    @Before
    public void before() {
        ruby = new Ruby();
    }

    @Test
    public void canGetValue() {
        assertEquals(10000, ruby.getValue());
    }
}
