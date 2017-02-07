package patterns.fundamentals.prototype;

/**
 * Created by nugusbayevkk on 2/6/17.
 */
public class Rectangle extends Shape {
    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle():: draw() method.");
    }
}
