package Player_Weapon_Tests;

import Enemies.Enemy;
import Enemies.Fighters.Orc;
import Players.Warriors.Weapons.WarAxe;
import org.junit.Before;

public class WarAxe_Test {

    WarAxe warAxe;
    Enemy enemy;

    @Before
    public void before() {
        warAxe = new WarAxe();
        enemy = new Orc("Uzul", 1000);
    }

    

}
