package Players.MagicalUsers.Summons;

import Enemies.Enemy;

public class Leviathan implements ISummon {

    public void summon(Enemy enemy){
        enemy.takeDamage(450);
        enemy.takeMagicalStatDamage(40);
        enemy.takePhysicalStatDamage(70);
    }
}
