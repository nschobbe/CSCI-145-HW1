package src.java.main;

import src.java.main.Exceptions.InvalidPlayerTypeException;

public class Main {
    public static void main(String[] args) throws InvalidPlayerTypeException {
        DungeonGame dungeonGame = new DungeonGame();
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        dungeonGame.setX(x);
        dungeonGame.setY(y);

    }
}