package src.java.main;

import src.java.main.Exceptions.InvalidPlayerTypeException;

public class Player {
    private int health;
    private int gold;
    private int damage;
    private String playerClass;
    private double lootModifier;
    private Point2d position;

    public Player(String playerClass) throws InvalidPlayerTypeException {
        this.position.setX(0);
        this.position.setY(0);

        if (playerClass.equals("Warrior")) {
            this.playerClass = "Warrior";
            this.gold = 0;
            this.damage = 15;
            this.health = 100;
            this.lootModifier = 1.0;
        }
        if (playerClass.equals("Thief"))  {
            this.playerClass = "Thief";
            this.gold = 0;
            this.damage = 10;
            this.health = 70;
            this.lootModifier = 1.2;
        }
        else {
            throw new InvalidPlayerTypeException("Please enter a valid Player type");
        }
    }
    public void attack(Monster target) {
        target.onHit(this.damage);
        System.out.println("Player hits " + target.getMonsterType() + " for " + damage + " damage");
    }

    public void onHit(int damage) {
        this.health -= damage;
    }

    public void onHeal(int health) {
        this.health += health;
    }

    public void onLoot(int gold) {
        this.gold += gold * this.lootModifier;
    }

    public int getGold() {
        return this.gold;
    }

    public int getHealth() {
        return this.health;
    }
    public String getPlayerClass() {
        return this.playerClass;
    }

    public Point2d getPosition() {
        return this.position;
    }
    
    public void setPosition(Point2d position) {
        this.position = position;
    }
}
