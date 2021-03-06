package Boss_Tests;

import Enemies.Boss_Enemies.Boss_Weapons.AbyssalSpear;
import Enemies.Boss_Enemies.Boss_Weapons.DeathScythe;
import Enemies.Boss_Enemies.Boss_Weapons.IBossWeapon;
import Enemies.Boss_Enemies.EbonyWarrior;
import Players.Player;
import Players.Warriors.Barbarian;
import Players.Warriors.Weapons.GreatSword;
import Players.Warriors.Weapons.IWeapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EbonyWarrior_Test {

    EbonyWarrior ebonyWarrior;
    IBossWeapon deathScythe;
    IBossWeapon abyssalSpear;
    Player player;
    IWeapon greatSword;

    @Before
    public void before() {
        ebonyWarrior = new EbonyWarrior("Reymon", 2000, 200, 200, deathScythe);
        deathScythe = new DeathScythe();
        abyssalSpear = new AbyssalSpear();
        player = new Barbarian("Conan", 600, 80, 10, 50, 60, 20, false, greatSword, 100);
        greatSword = new GreatSword();
    }

    //Enemy Stat Tests
    @Test
    public void hasName() {
        assertEquals("Reymon", ebonyWarrior.getName());
    }

    @Test
    public void hasHealthValue() {
        assertEquals(2000, ebonyWarrior.getHealthValue());
    }

    @Test
    public void hasPhysicalResistance() {
        assertEquals(200, ebonyWarrior.getPhysicalResistance());
    }

    @Test
    public void hasMagicalResistance() {
        assertEquals(200, ebonyWarrior.getMagicalResistance());
    }

    @Test
    public void canReducePhysicalResistance() {
        ebonyWarrior.takePhysicalStatDamage(50);
        assertEquals(150, ebonyWarrior.getPhysicalResistance());
    }

    @Test
    public void canReduceMagicalResistance() {
        ebonyWarrior.takeMagicalStatDamage(50);
        assertEquals(150, ebonyWarrior.getMagicalResistance());
    }

    @Test
    public void canTakeDamage() {
        ebonyWarrior.takeDamage(1000);
        assertEquals(1000, ebonyWarrior.getHealthValue());
    }

    //Boss Tests
    @Test
    public void canAttack() {
        ebonyWarrior.setWeapon(deathScythe);
        ebonyWarrior.attack(player);
        assertEquals(200, player.getHealthValue());
    }

    @Test
    public void canReducePlayerStrength() {
        ebonyWarrior.setWeapon(deathScythe);
        ebonyWarrior.attack(player);
        assertEquals(50, player.getStrength());
    }

    @Test
    public void canReducePlayerMagic() {
        ebonyWarrior.setWeapon(deathScythe);
        ebonyWarrior.attack(player);
        assertEquals(-20, player.getMagic());
    }

    @Test
    public void canReducePlayerDefence() {
        ebonyWarrior.setWeapon(deathScythe);
        ebonyWarrior.attack(player);
        assertEquals(20, player.getDefence());
    }

    @Test
    public void canReducePlayerVitality() {
        ebonyWarrior.setWeapon(deathScythe);
        ebonyWarrior.attack(player);
        assertEquals(30, player.getVitality());
    }

    @Test
    public void canReducePlayerLuck() {
        ebonyWarrior.setWeapon(deathScythe);
        ebonyWarrior.attack(player);
        assertEquals(0, player.getLuck());
    }

    @Test
    public void canPoisonPlayer() {
        ebonyWarrior.setWeapon(deathScythe);
        ebonyWarrior.attack(player);
        assertEquals(true, player.getPoisonStatus());
    }

    @Test
    public void canSwapWeapons() {
        ebonyWarrior.setWeapon(abyssalSpear);
        ebonyWarrior.attack(player);
        assertEquals(300, player.getHealthValue());
    }

    //Player Tests
    @Test
    public void playerHasName() {
        assertEquals("Conan", player.getName());
    }

    @Test
    public void playerHasHealthValue() {
        assertEquals(600, player.getHealthValue());
    }


}
