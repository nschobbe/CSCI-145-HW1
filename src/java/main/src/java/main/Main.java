package src.java.main;

public class Main {
    public static void main(String[] args) {
        int y = Integer.parseInt(args[1]);
        int x = Integer.parseInt(args[0]);

        DungeonGame dungeonGame = new DungeonGame();
        dungeonGame.setX(x);
        dungeonGame.setY(y);
        dungeonGame.play();

    }
}