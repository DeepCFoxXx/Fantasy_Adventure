package Enemy_Tests;

import Enemies.Fighters.HellKnight;
import Enemies.Fighters.Weapons.BattleAxe;
import Enemies.Fighters.Weapons.IWeaponEnemy;
import Enemies.Fighters.Weapons.OrcishSword;
import Players.Player;
import Players.Warriors.Barbarian;
import Players.Warriors.Weapons.GreatSword;
import Players.Warriors.Weapons.IWeapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HellKnight_Test {

    HellKnight hellKnight;
    IWeaponEnemy battleAxe;
    IWeaponEnemy orcishSword;
    Player player;
    IWeapon greatsword;

    @Before
    public void before() {
        hellKnight = new HellKnight("Dante", 1200, battleAxe, 20);
        battleAxe = new BattleAxe();
        orcishSword = new OrcishSword();
        player = new Barbarian("Conan", 600, greatsword, 80);
        greatsword = new GreatSword();
    }

    @Test
    public void hasName() {
        assertEquals("Dante", hellKnight.getName());
    }

}
