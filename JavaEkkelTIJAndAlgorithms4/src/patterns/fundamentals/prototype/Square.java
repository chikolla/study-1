package patterns.fundamentals.prototype;

/**
 * Created by nugusbayevkk on 2/6/17.
 */
public class Square extends Shape {
    public Square(){
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Inside square::draw() method");
    }
}
