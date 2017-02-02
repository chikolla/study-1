package patterns.fundamentals.immutable;

/**
 * this is immutable class, because we can set X,Y with setter methods
 *
 * Created by nugusbayevkk on 2/2/17.
 */
public class Point2D {
    private int x;
    private int y;
    public Point2D(int x, int y) { this.x = x; this.y = y; }

    public int getX() { return this.x; }
    public int getY() { return this.y; }

    public void setX(int newX) { this.x = newX; }
    public void setY(int newY) { this.y = newY; }
}
