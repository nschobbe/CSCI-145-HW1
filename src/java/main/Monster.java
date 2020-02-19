package src.java.main;

import java.util.Random;

public class Monster {
    private int health;
    private int damage;
    private String monsterType;

    public Monster(String monsterType) {
        if (monsterType.equals("Goblin")) {
            this.monsterType = "Goblin";
            this.health = 6;
            this.damage = 10;
        }
        if (monsterType.equals("Zombie")) {
            this.monsterType = "Zombie";
            this.health = 12;
            this.damage = 15;
        }
        if (monsterType.equals("Orc")) {
            this.monsterType = "Orc";
            this.health = 18;
            this.damage = 20;
        }
        if (monsterType.equals("Deneke")) {
            this.monsterType = "Deneke";
            this.health = 55;
            this.damage = 5;
        }
    }
    public void attack(Player target) {
        Random rando = new Random();
        target.onHit(rando.nextInt(damage));
        System.out.println(this.monsterType + " hits Player for " + this.damage + " damage");
    }

    public void onHit(int damage) {
        this.health -= damage;
    }
    
    public String getMonsterType() {
        return this.monsterType;
    }
    
    public int getHealth() {
        return this.health;
    }
}
