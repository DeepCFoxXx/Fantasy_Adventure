package Players.MagicalUsers.Spells;

import Enemies.Enemy;

public class Frost implements ISpell {

    public void cast(Enemy enemy){
        enemy.takeDamage(130);
        enemy.takeMagicalStatDamage(20);
    }
}
