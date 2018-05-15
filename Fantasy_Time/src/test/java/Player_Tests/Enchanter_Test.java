package Player_Tests;

import Enemies.Enemy;
import Enemies.Fighters.Orc;
import Enemies.Fighters.Weapons.IWeaponEnemy;
import Players.MagicalUsers.Defenders.Bahamut;
import Players.MagicalUsers.Defenders.IDefend;
import Players.MagicalUsers.Defenders.Leviathan;
import Players.MagicalUsers.Enchanter;
import Players.MagicalUsers.Sorcerer;
import Players.MagicalUsers.Spells.*;
import org.junit.Before;

public class Enchanter_Test {

    Enchanter enchanter;
    ISpell flame;
    ISpell lightning;
    IDefend leviathan;
    IDefend bahamut;
    Enemy enemy;
    IWeaponEnemy warhammer;

    @Before
    public void before() {
        enchanter = new Enchanter("Lyanna", 400, 10, 80, 30, 30, 45, false, flame, leviathan, 100 );
        enemy = new Orc("Uzul", 1000, 100, 100, warhammer);
        flame = new Flame();
        lightning = new Lightning();
        leviathan = new Leviathan();
        bahamut = new Bahamut();
    }

}
