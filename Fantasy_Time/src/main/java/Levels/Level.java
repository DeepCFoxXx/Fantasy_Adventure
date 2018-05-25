package Levels;

import Enemies.Enemy;
import Player_Treasure.ITreasure;
import Players.Player;

import java.util.ArrayList;

public abstract class Level {

    ArrayList<Player> members;
    ArrayList<Enemy>enemies;
    ArrayList<ITreasure>treasures;

    public Level() {
        this.members = new ArrayList<>();
        this.enemies = new ArrayList<>();
        this.treasures = new ArrayList<>();
    }

}
