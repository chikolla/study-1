package patterns.fundamentals.prototype;

/**
 * Created by nugusbayevkk on 2/6/17.
 */
public class Circle extends Shape {

    public String getType(){
        return "Circle";
    }

    @Override
    void draw() {
        System.out.println("Inside method Circle.draw()");
    }
}
