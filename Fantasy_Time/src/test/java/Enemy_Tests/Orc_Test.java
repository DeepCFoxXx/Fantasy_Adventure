package Enemy_Tests;

import Enemies.Fighters.Orc;
import Enemies.Fighters.Weapons.IWeaponEnemy;
import Enemies.Fighters.Weapons.OrcishSword;
import Enemies.Fighters.Weapons.WarHammer;
import Players.Player;
import Players.Warriors.Barbarian;
import Players.Warriors.Weapons.GreatSword;
import Players.Warriors.Weapons.IWeapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Orc_Test {

    Orc orc;
    IWeaponEnemy warhammer;
    IWeaponEnemy orcishSword;
    Player player;
    IWeapon greatSword;

    @Before
    public void before() {
        orc = new Orc("Uzul", 1000, warhammer, 100);
        orcishSword = new OrcishSword();
        player = new Barbarian("Conan", 600, 80, 10, 50, 60, 20, false, greatSword, 100);
        greatSword = new GreatSword();
        warhammer = new WarHammer();
    }

    @Test
    public void hasName() {
        assertEquals("Uzul", orc.getName());
    }

    @Test
    public void hasHealthValue() {
        assertEquals(1000, orc.getHealthValue());
    }

    @Test
    public void hasPhysicalResistance() {
        assertEquals(100, orc.getPhysicalResistance());
    }

    @Test
    public void canTakeDamage() {
        orc.takeDamage(250);
        assertEquals(750, orc.getHealthValue());
    }

    @Test
    public void canAttack() {
        orc.attack(player, warhammer);
        assertEquals(400, player.getHealthValue());
    }

    @Test
    public void canSwapWeapon() {
        orc.setWeapon(orcishSword);
        orc.attack(player);
        assertEquals(475, player.getHealthValue());
    }

    @Test
    public void EnemyHasName() {
        assertEquals("Conan", player.getName());
    }

    @Test
    public void EnemyHasHealthValue() {
        assertEquals(600, player.getHealthValue());
    }

    @Test
    public void canDamageStats() {
        orc.takeStatDamage(25);
        assertEquals(75, orc.getPhysicalResistance());
    }

}
