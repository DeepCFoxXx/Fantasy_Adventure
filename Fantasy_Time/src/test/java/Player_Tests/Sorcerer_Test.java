package Player_Tests;

import Enemies.Enemy;
import Enemies.Fighters.Orc;
import Enemies.Fighters.Weapons.IWeaponEnemy;
import Players.MagicalUsers.Sorcerer;
import Players.MagicalUsers.Spells.Frost;
import Players.MagicalUsers.Spells.ISpell;
import Players.MagicalUsers.Spells.Ultima;
import Players.MagicalUsers.Summons.Bahamut;
import Players.MagicalUsers.Summons.ISummon;
import Players.MagicalUsers.Summons.Leviathan;
import org.junit.Before;

public class Sorcerer_Test {

    Sorcerer sorcerer;
    ISpell frost;
    ISpell ultima;
    ISummon bahamut;
    ISummon leviathan;
    Enemy enemy;
    IWeaponEnemy warhammer;

    @Before
    public void before() {
        sorcerer = new Sorcerer("Bruce", 500, 60, 30, 70, 40, 25, false, frost, 100);
        enemy = new Orc("Uzul", 1000, 100, 100, warhammer);
        frost = new Frost();
        ultima = new Ultima();
        bahamut = new Bahamut();
        leviathan = new Leviathan();
    }

}
