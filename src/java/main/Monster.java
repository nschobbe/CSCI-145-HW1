package src.java.main;

import src.java.main.Exceptions.InvalidMonsterTypeException;

public class Monster {
    private int health;
    private int damage;
    private String monsterType;

    public Monster(String monsterType) throws InvalidMonsterTypeException {
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
        else {
            throw new InvalidMonsterTypeException("Please enter a valid monster type");
        }
    }
    public void attack(Player target) {
        target.onHit(damage);
        System.out.println(this.monsterType + " hits Player for " + this.damage + " damage");
    }

    public void onHit(int damage) {
        this.health -= damage;
    }
    
    public String getMonsterType() {
        return this.monsterType;
    }
}
