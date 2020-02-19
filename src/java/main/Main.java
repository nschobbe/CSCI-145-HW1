package src.java.main;

public class Main {
    public static void main(String[] args) {
        DungeonGame dungeonGame = new DungeonGame();
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        dungeonGame.setX(x);
        dungeonGame.setY(y);

    }
}