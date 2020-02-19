package src.java.main;
import java.util.Random;
import java.util.Scanner;

public class Room {
    private boolean visited;

    public void enter(Player player) { // either nothing, monster, gold, pots
        Random rando = new Random();
        Scanner scanny = new Scanner(System.in);
        if (!visited) {
            System.out.println("You open a door and move through ...");
            if (rando.nextInt(4) == 0) { // health potion condition
                int elixirHeal = (int)(Math.random() * 60) + 30;
                System.out.println("You found a healing elixir and are healed by " + elixirHeal + " hp");
                if (player.getPlayerClass().equals("Warrior")) {
                    if (player.getHealth() + elixirHeal > 100) {
                        player.onHeal(100 - player.getHealth());
                    }
                    else {
                        player.onHeal(elixirHeal);
                    }
                }
                if (player.getPlayerClass().equals("Thief")) {
                    if (player.getHealth() + elixirHeal > 70) {
                        player.onHeal(70 - player.getHealth());
                    }
                    else {
                        player.onHeal(elixirHeal);
                    }
                }
            }
            if (rando.nextInt(4) == 1) { //loot condition
            int loot = (int)(Math.random() * 70) + 20;
            System.out.println("You find " + loot + " gold pieces!");
            player.onLoot(loot);
            }

            if (rando.nextInt(4) == 2) {
                if (rando.nextInt(4) == 0) {
                    Monster gobby = new Monster("Goblin");
                    while (gobby.getHealth() > 0) {
                        System.out.println("A Goblin appears!!");
                        gobby.attack(player);
                        System.out.println("The Goblin hits you");
                        System.out.println("Do you want to run or fight? (type \"x\" to attack, or WASD to flee)");
                        if (scanny.next().equals("z")) {
                            System.out.println("You run away!");
                        }
                        if (scanny.next().equals("x")) {
                            player.attack(gobby);
                        }
                    }
                    System.out.println("You defeated the Goblin!!");
                }

                if (rando.nextInt(4) == 1) {
                    Monster zobby = new Monster("Zombie");
                    while (zobby.getHealth() > 0) {
                        System.out.println("A Zombie appears!!");
                        zobby.attack(player);
                        System.out.println("The Zombie hits you");
                        System.out.println("Do you want to run or fight? (type \"x\" to attack, or WASD to flee)");
                        if (scanny.next().equals("z")) {
                            System.out.println("You run away!");
                        }
                        if (scanny.next().equals("x")) {
                            player.attack(zobby);
                        }
                    }
                    System.out.println("You defeated the Zombie!!");
                }

                if (rando.nextInt(4) == 2) {
                    Monster occy = new Monster("Orc");
                    while (occy.getHealth() > 0) {
                        System.out.println("A Orc appears!!");
                        occy.attack(player);
                        System.out.println("The Orc hits you");
                        System.out.println("Do you want to run or fight? (type \"x\" to attack, or WASD to flee)");
                        if (scanny.next().equals("z")) {
                            System.out.println("You run away!");
                        }
                        if (scanny.next().equals("x")) {
                            player.attack(occy);
                        }
                    }
                    System.out.println("You defeated the Orc!!");
                }

                if (rando.nextInt(4) == 3) {
                    Monster deneky = new Monster("Deneke");
                    while (deneky.getHealth() > 0) {
                        System.out.println("A Deneke appears!!");
                        deneky.attack(player);
                        System.out.println("The Deneke hits you");
                        System.out.println("Do you want to run or fight? (type \"x\" to attack, or WASD to flee");
                        if (scanny.next().equals("z")) {
                            System.out.println("You run away!");
                        }
                        if (scanny.next().equals("x")) {
                            player.attack(deneky);
                        }
                    }
                    System.out.println("You defeated the Deneke!!");
                }
            }

            if (rando.nextInt(4) == 3) {
                System.out.println("There is an empty room");
            }
        this.visited = true;
        }
        else {
            System.out.println("You have already visited this room");
        }
    }

    public boolean hasVisited() {
        return this.visited;
    }
}
