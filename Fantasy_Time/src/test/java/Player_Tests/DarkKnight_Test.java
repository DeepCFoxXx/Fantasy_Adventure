package Player_Tests;

import Enemies.Enemy;
import Enemies.Fighters.Orc;
import Enemies.Fighters.Weapons.IWeaponEnemy;
import Players.Warriors.Weapons.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DarkKnight_Test {

    DarkKnight darkKnight;
    Enemy enemy;
    IWeapon broadSword;
    IWeapon trident;
    IWeaponEnemy warhammer;

    @Before
    public void before() {
        darkKnight = new DarkKnight("Bruce", 500, broadSword, 250);
        enemy = new Orc("Uzul", 1000, warhammer);
        broadSword = new BroadSword();
        trident = new Trident();
    }

    @Test
    public void hasName() {
        assertEquals("Bruce", darkKnight.getName());
    }

}
