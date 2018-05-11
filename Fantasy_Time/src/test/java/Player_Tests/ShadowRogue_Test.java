package Player_Tests;

import Enemies.Enemy;
import Enemies.Fighters.Orc;
import Enemies.Fighters.Weapons.IWeaponEnemy;
import Players.Warriors.Paladin;
import Players.Warriors.ShadowRogue;
import Players.Warriors.Weapons.BroadSword;
import Players.Warriors.Weapons.IWeapon;
import Players.Warriors.Weapons.WarAxe;
import org.junit.Before;

public class ShadowRogue_Test {

    ShadowRogue shadowRogue;
    Enemy enemy;
    IWeapon broadSword;
    IWeapon warAxe;
    IWeaponEnemy warhammer;

    @Before
    public void before() {
        shadowRogue = new ShadowRogue("Kara", 400, broadSword, 200);
        enemy = new Orc("Uzul", 1000, warhammer);
        broadSword = new BroadSword();
        warAxe = new WarAxe();
    }

}
