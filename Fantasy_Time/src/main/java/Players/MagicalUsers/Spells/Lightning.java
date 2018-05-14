package Players.MagicalUsers.Spells;

import Enemies.Enemy;

public class Lightning implements ISpell {

    public void cast(Enemy enemy){
        enemy.takeDamage(180);
        enemy.takeMagicalStatDamage(40);
    }
}
