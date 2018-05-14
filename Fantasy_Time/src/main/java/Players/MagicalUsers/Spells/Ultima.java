package Players.MagicalUsers.Spells;

import Enemies.Enemy;

public class Ultima implements ISpell {

    public void cast(Enemy enemy){
        enemy.takeDamage(300);
        enemy.takeMagicalStatDamage(50);
    }

}
