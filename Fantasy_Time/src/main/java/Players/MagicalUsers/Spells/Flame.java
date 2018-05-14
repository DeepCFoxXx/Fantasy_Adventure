package Players.MagicalUsers.Spells;

import Enemies.Enemy;

public class Flame implements ISpell {

    public void cast(Enemy enemy){
        enemy.takeDamage(150);
        enemy.takeMagicalStatDamage(30);
    }
}
