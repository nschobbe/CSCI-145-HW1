package src.java.main;

public class Point2d {
    private int x;
    private int y;

    public Point2d(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public Point2d add(Point2d other) {
        int sumX = this.x + other.x;
        int sumY = this.y + other.y;
        Point2d result = new Point2d(sumX, sumY);

        return result;
    }

    public Point2d distance(Point2d other) {
        int deltaX = Math.abs(this.x - other.getX());
        int deltaY = Math.abs(this.y - other.getY());
        Point2d distance = new Point2d(deltaX, deltaY);

        return distance;
    }
}