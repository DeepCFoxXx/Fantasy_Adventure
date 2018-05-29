package Room_Tests;

import Enemies.Enemy;
import Enemies.EnemyParty;
import Player_Treasure.ITreasure;
import Player_Treasure.Loot;
import Players.Party;
import Players.Player;
import Quest.Exit;
import Quest.Room;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class Room_Test {

   Room room1;
   Party memebers1;
   Player player;
   EnemyParty enemies1;
   Enemy enemy;
   Loot loot1;
   ITreasure loot;

   @Before
    public void before() {
       room1 = new Room(Exit.NORTH, memebers1, loot1, enemies1);
       memebers1 = new Party();
       enemies1 = new EnemyParty();
       loot1 = new Loot();
   }

   @Test
    public void room1HasExit() {
       assertEquals( Exit.NORTH, room1.getDirection());
   }

   @Test
   public void canAddPlayerToMembers() {
      memebers1.addMember(player);
      assertEquals(1, memebers1.getMembersCount());
   }

   @Test
   public void canRemovePlayerFromMembers() {
      memebers1.addMember(player);
      memebers1.removePlayer(player);
      assertEquals(0, memebers1.getMembersCount());
   }

   @Test
   public void canAddLootToLoot() {
      loot1.addTreasure(loot);
      assertEquals(1, loot1.getLootCount());
   }

   @Test
   public void canRemoveLootFromLoot() {
      loot1.addTreasure(loot);
      loot1.removeTreasure(loot);
      assertEquals(0, loot1.getLootCount());
   }

   @Test
   public void canAddEnemyToEnemies() {
      enemies1.addEnemy(enemy);
      assertEquals(1, enemies1.getEnemyCount());
   }

}
