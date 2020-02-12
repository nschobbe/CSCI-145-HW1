
public class Monster {
    private int health;
    private int damage;
    private String monsterType;

    public Monster(String monsterType) {
        
    }
    public void attack(Player target) {

    }

    public void onHit(int damage) {
        this.health -= damage;
    }
}
