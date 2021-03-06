package src.java.main;
import java.util.Scanner;

public class DungeonGame {
    private DungeonMap map;
    private Player player;
    private Scanner scanner;

    private static String Up = "W";
    private static String Down = "S";
    private static String Left = "A";
    private static String Right = "D";
    private static String Quit = "Q";
    private static String Attack = "X";

    private int x = 10;
    private int y = 10;

    public void setX(int xV) {
        this.x = xV;
    }

    public void setY(int yV) {
        this.y = yV;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public DungeonGame() {
        scanner = new Scanner(System.in);
        System.out.println("Enter your class, Warrior or Thief: ");
        String pClass = scanner.nextLine();
        player = new Player(pClass);
        map = new DungeonMap(x, y, this.player);
    }
    public void play() {
        System.out.println("Welcome to our Dungeon!");

        while(true) {
            map.print();
            printPlayerStats();
            promtUser();
            String userChoice = scanner.next();
            if (userChoice.equalsIgnoreCase(Quit)) {
                System.out.println("You've Quit.");
                break;
            }

            handleUserChoice(userChoice);

            if(!(player.getHealth() > 0)) {
                break;
            }
            if(!(player.getGold() < 100)) {
                System.out.println("You've won!");
                break;
            }
        }
    }
    private void printPlayerStats() {
        System.out.println("Health: " + player.getHealth());
        System.out.println("Gold: " + player.getGold());
    }
    private void promtUser() {
        System.out.println("Choose one of the following: ");
        System.out.print(Up + " = up ");
        System.out.print(Down + " = down ");
        System.out.print(Left + " = left ");
        System.out.print(Right + " = right ");
        System.out.println(Quit + " = Quit ");
    }
    private void handleUserChoice(String userChoice) {
        Room currentPlayerRoom = null;
        if (userChoice.equalsIgnoreCase(Up)) {
            currentPlayerRoom = moveUp();
        }
        else if (userChoice.equalsIgnoreCase(Down)) {
            currentPlayerRoom = moveDown();
        }
        else if (userChoice.equalsIgnoreCase(Left)) {
            currentPlayerRoom = moveLeft();
        }
        else if (userChoice.equalsIgnoreCase(Right)) {
            currentPlayerRoom = moveRight();
        }
        else if(userChoice.equalsIgnoreCase(Attack)) {
            System.out.println("Attack");
        }
        else {
            System.out.println("Unknown user input");
        }

        if(currentPlayerRoom != null) {
            currentPlayerRoom.enter(player);
        }
    }
    private Room moveUp() {
        System.out.println("Moving up");
        Room currentPlayerRoom = map.movePlayer(new Point2d(0, -1));

        return currentPlayerRoom;
    }
    private Room moveDown() {
        System.out.println("Moving down");
        Room currentPlayerRoom = map.movePlayer(new Point2d(0, 1));

        return currentPlayerRoom;
    }
    private Room moveLeft() {
        System.out.println("Moving left");
        Room currentPlayerRoom = map.movePlayer(new Point2d(-1, 0));

        return currentPlayerRoom;
    }
    private Room moveRight() {
        System.out.println("Moving right");
        Room currentPlayerRoom = map.movePlayer(new Point2d(1, 0));

        return currentPlayerRoom;
    }
}

