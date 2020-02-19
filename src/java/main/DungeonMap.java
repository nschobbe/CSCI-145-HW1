package src.java.main;

public class DungeonMap {
    private Room[][] map;
    private Player player;
    private final String WALL_MAP_POSITION = "*";
    private final String EMPTY_MAP_POSITION = " ";
    private final String PLAYER_MAP_POSITION = "P";

    public DungeonMap(int x, int y, Player player) {
        map = new Room[x][y];
        this.player = player;
        initMap();
    }
    private void initMap(){
        for(int i = 0; i < map.length; i++){
            for(int j = 0; j < map[i].length; j++) {
                map[i][j] = new Room();
            }
        }
    }
    public void print() {
        printFirstLastBorder();
        for(int i = 0; i < map.length; i++){
            System.out.print(WALL_MAP_POSITION);
            for(int j = 0; j < map[i].length; j++) {
                if((i == player.getPosition().getY()) && (j==player.getPosition().getX())) {
                    System.out.print(PLAYER_MAP_POSITION);
                }
                else {
                    System.out.print(EMPTY_MAP_POSITION);
                }
            }
            System.out.println(WALL_MAP_POSITION);
        }
        printFirstLastBorder();
    }
    private void printFirstLastBorder(){
        for(int i = 0; i <= map[0].length+1; i++) {
            System.out.print(WALL_MAP_POSITION);
        }
        System.out.println();
    }
    public Room movePlayer(Point2d distance) {
        Point2d newPosition = player.getPosition().add(distance);
        Room currentPlayerRoom = null;
        if(isNewPositionValid(newPosition)) {
            player.setPosition(newPosition);
            currentPlayerRoom = map[player.getPosition().getY()]
[player.getPosition().getX()];
        }
        else {
            System.out.println("Invalid move.");
        }
        return currentPlayerRoom;
    }
    private boolean isNewPositionValid(Point2d newPosition) {
        if(newPosition.getX() < 0){
            return false;
        }
        if(newPosition.getY() < 0){
            return false;
        }
        if(newPosition.getX() >= map[0].length) {
            return false;
        }
        if(newPosition.getY() >= map.length){
            return false;
        }
        return true;
    }
}