package Quest_Tests;

import Enemies.Boss_Enemies.Boss;
import Enemies.Boss_Enemies.Boss_Weapons.IBossWeapon;
import Enemies.Boss_Enemies.EbonyWarrior;
import Enemies.Boss_Enemies.MasterVampire;
import Enemies.Enemy;
import Enemies.EnemyParty;
import Enemies.Enemy_Magic_Users.BloodCultist;
import Enemies.Enemy_Magic_Users.Lich;
import Enemies.Enemy_Magic_Users.Spells.ISpellEnemy;
import Enemies.Fighters.CursedVampire;
import Enemies.Fighters.DarkElf;
import Enemies.Fighters.HellKnight;
import Enemies.Fighters.Orc;
import Enemies.Fighters.Weapons.IWeaponEnemy;
import Player_Treasure.*;
import Players.MagicalUsers.Defenders.IDefend;
import Players.MagicalUsers.Enchantress;
import Players.MagicalUsers.Healing_Spells.IHeal;
import Players.MagicalUsers.Sorcerer;
import Players.MagicalUsers.Spells.ISpell;
import Players.MagicalUsers.WhiteMage;
import Players.Party;
import Players.Player;
import Players.Warriors.Barbarian;
import Players.Warriors.DarkKnight;
import Players.Warriors.Paladin;
import Players.Warriors.ShadowRogue;
import Players.Warriors.Weapons.IWeapon;
import Quest.Room;
import org.junit.Before;

public class Quest_Test {

    Room room1;
    Party party1;
    Player barbarian;
    IWeapon greatSword;
    Player darkKnight;
    IWeapon broadSword;
    Player enchantress;
    ISpell flame;
    IDefend leviathan;
    Player paladin;
    Player shadowRogue;
    IWeapon katana;
    Player sorcerer;
    ISpell frost;
    IDefend bahamut;
    Player whiteMage;
    ISpell lightning;
    IHeal cure;
    Loot loot;
    ITreasure diamond;
    ITreasure goldCoins;
    ITreasure ruby;
    ITreasure silverCoins;
    EnemyParty enemyparty;
    Enemy bloodCultist;
    ISpellEnemy poison;
    Enemy cursedVampire;
    IWeaponEnemy bloodDagger;
    Enemy darkElf;
    IWeaponEnemy warMace;
    Enemy hellKnight;
    IWeaponEnemy battleAxe;
    Enemy lich;
    ISpellEnemy drain;
    Enemy orc;
    IWeaponEnemy warhammer;
    Boss ebonyWarrior;
    IBossWeapon deathScythe;
    Boss masterVampire;
    IBossWeapon abyssalSpear;

    @Before
    public void before() {
        party1 = new Party();
        barbarian = new Barbarian("Conan", 600, 80, 10, 50, 60, 20, false, greatSword, 100);
        darkKnight = new DarkKnight("Bruce", 500, 60, 30, 70, 40, 25, false, broadSword, 100);
        enchantress = new Enchantress("Sabrina", 550, 25, 70, 40, 20, 25, false, flame, leviathan, 100 );
        paladin = new Paladin("Duncan", 550, 40, 40, 50, 60, 40,  false, broadSword, 100);
        shadowRogue = new ShadowRogue("Kara", 500, 30, 30, 40, 60, 70,  false, katana, 100);
        sorcerer = new Sorcerer("Lyanna", 400, 10, 80, 30, 30, 45, false, frost, bahamut, 100 );
        whiteMage = new WhiteMage("Goro", 350, 15, 100, 20, 20, 80, false, lightning, leviathan, 100, cure);
        loot = new Loot();
        diamond = new Diamond();
        goldCoins = new GoldCoins();
        ruby = new Ruby();
        silverCoins = new SilverCoins();
        enemyparty = new EnemyParty();
        bloodCultist = new BloodCultist("Serana", 450, 100, 100, poison);
        cursedVampire = new CursedVampire("Bella", 500, 100, 100, bloodDagger);
        darkElf = new DarkElf("Llarayna", 700, 100, 100, warMace);
        hellKnight = new HellKnight("Dante", 1200, 100, 100, battleAxe);
        lich = new Lich("Zhengyi", 650, 100, 100, drain);
        orc = new Orc("Uzul", 1000, 100, 100, warhammer);
        ebonyWarrior = new EbonyWarrior("Reymon", 2000, 200, 200, deathScythe);
        masterVampire = new MasterVampire("Constantia", 1200, 200, 500, abyssalSpear);
    }

}
