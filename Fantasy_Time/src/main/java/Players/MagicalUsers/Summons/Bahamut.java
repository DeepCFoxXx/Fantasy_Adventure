package Players.MagicalUsers.Summons;

import Enemies.Enemy;

public class Bahamut implements ISummon {

    public void summon(Enemy enemy){
        enemy.takeDamage(500);
        enemy.takeMagicalStatDamage(50);
        enemy.takePhysicalStatDamage(50);
    }

}
