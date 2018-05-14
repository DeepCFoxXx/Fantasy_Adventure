package Players.MagicalUsers.Defenders;

import Enemies.Enemy;

public class Leviathan implements IDefend {

    public void summon(Enemy enemy){
        enemy.takeDamage(450);
        enemy.takeMagicalStatDamage(40);
        enemy.takePhysicalStatDamage(70);
    }
}
