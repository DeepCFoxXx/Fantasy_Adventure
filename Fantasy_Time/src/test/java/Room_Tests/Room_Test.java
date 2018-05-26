package Room_Tests;

import Rooms.Exit;
import Rooms.Room;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Room_Test {

   Room room1;
   Room room2;
   Room room3;
   Room room4;

   @Before
    public void before() {
       room1 = new Room(Exit.NORTH);
       room2 = new Room(Exit.EAST);
       room3 = new Room(Exit.SOUTH);
       room4 = new Room(Exit.WEST);
   }

   @Test
    public void room1HasExit() {
       assertEquals( Exit.NORTH, room1.getDirection());
   }

   @Test
   public void room2HasExit() {
      assertEquals( Exit.EAST, room2.getDirection());
   }

   @Test
   public void room3HasExit() {
      assertEquals( Exit.SOUTH, room3.getDirection());
   }

   @Test
   public void room4HasExit() {
      assertEquals( Exit.WEST, room4.getDirection());
   }

}
