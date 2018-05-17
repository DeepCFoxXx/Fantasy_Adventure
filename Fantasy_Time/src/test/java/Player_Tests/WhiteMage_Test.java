package Player_Tests;

import Enemies.Enemy;
import Enemies.Fighters.Orc;
import Enemies.Fighters.Weapons.IWeaponEnemy;
import Players.MagicalUsers.Defenders.IDefend;
import Players.MagicalUsers.Defenders.Leviathan;
import Players.MagicalUsers.Healing_Spells.Cure;
import Players.MagicalUsers.Healing_Spells.FullCure;
import Players.MagicalUsers.Healing_Spells.IHeal;
import Players.MagicalUsers.Spells.ISpell;
import Players.MagicalUsers.Spells.Lightning;
import Players.MagicalUsers.Spells.Ultima;
import Players.MagicalUsers.WhiteMage;
import Players.Player;
import Players.Warriors.Barbarian;
import Players.Warriors.Weapons.GreatSword;
import Players.Warriors.Weapons.IWeapon;
import org.junit.Before;

public class WhiteMage_Test {

    WhiteMage whiteMage;
    ISpell lightning;
    ISpell ultima;
    IDefend leviathan;
    IHeal cure;
    IHeal fullCure;
    Player barbarian;
    IWeapon greatSword;
    Enemy enemy;
    IWeaponEnemy warhammer;

    @Before
    public void before() {
        whiteMage = new WhiteMage("Lyanna", 350, 15, 100, 20, 20, 80, false, lightning, leviathan, 100 );
        enemy = new Orc("Uzul", 1000, 100, 100, warhammer);
        lightning= new Lightning();
        ultima = new Ultima();
        leviathan = new Leviathan();
        cure = new Cure();
        fullCure = new FullCure();
        barbarian = new Barbarian("Conan", 600, 80, 10, 50, 60, 20, false, greatSword, 100);
        greatSword = new GreatSword();
    }

}
