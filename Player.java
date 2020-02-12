
public class Player {
    private int health;
    private int gold;
    private int damage;
    private String playerClass;
    private double lootModifier;

    public Player(String playerClass, double lootModifier) {
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
            System.out.println("Please enter a valid starting class.");
            System.out.println("Either \"Warrior\" or \"Thief\" is considered valid input");
        }
    }
    public void attack(Monster target) {
        
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
}
