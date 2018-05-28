package Enemy_Tests;

import Enemies.Boss_Enemies.Boss;
import Enemies.Boss_Enemies.Boss_Weapons.IBossWeapon;
import Enemies.Boss_Enemies.EbonyWarrior;
import Enemies.Boss_Enemies.MasterVampire;
import Enemies.Enemy;
import Enemies.Enemy_Magic_Users.BloodCultist;
import Enemies.Enemy_Magic_Users.Lich;
import Enemies.Enemy_Magic_Users.Spells.ISpellEnemy;
import Enemies.EnemyParty;
import Enemies.Fighters.CursedVampire;
import Enemies.Fighters.DarkElf;
import Enemies.Fighters.HellKnight;
import Enemies.Fighters.Orc;
import Enemies.Fighters.Weapons.IWeaponEnemy;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnemyParty_Test {

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

    @Test
    public void enemyPartyStartsEmpty() {
        assertEquals(0, enemyparty.getEnemyCount());
    }

    @Test
    public void canAddToEnemyParty() {
        enemyparty.addEnemy(bloodCultist);
        assertEquals(1, enemyparty.getEnemyCount());
    }

    @Test
    public void canRemoveEnemy() {
        enemyparty.addEnemy(bloodCultist);
        enemyparty.removeEnemy(bloodCultist);
        assertEquals(0, enemyparty.getEnemyCount());
    }

    @Test
    public void canAddAllEnemies() {
        enemyparty.addEnemy(bloodCultist);
        enemyparty.addEnemy(cursedVampire);
        enemyparty.addEnemy(darkElf);
        enemyparty.addEnemy(hellKnight);
        enemyparty.addEnemy(lich);
        enemyparty.addEnemy(orc);
        enemyparty.addEnemy(ebonyWarrior);
        enemyparty.addEnemy(masterVampire);
        assertEquals(8, enemyparty.getEnemyCount());
    }

    @Test
    public void canClearEnemyParty() {
        enemyparty.addEnemy(bloodCultist);
        enemyparty.addEnemy(cursedVampire);
        enemyparty.addEnemy(darkElf);
        enemyparty.addEnemy(hellKnight);
        enemyparty.addEnemy(lich);
        enemyparty.addEnemy(orc);
        enemyparty.clearParty();
        assertEquals(0, enemyparty.getEnemyCount());
    }

    @Test
    public void canGetTotalEnemyHealth() {
        enemyparty.addEnemy(bloodCultist);
        enemyparty.addEnemy(cursedVampire);
        enemyparty.addEnemy(darkElf);
        enemyparty.addEnemy(hellKnight);
        enemyparty.addEnemy(lich);
        enemyparty.addEnemy(orc);
        assertEquals(4500, enemyparty.getTotalHealth());
    }

}
