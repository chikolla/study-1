package ekkel.typeinfo;

import algs4.basic.StdOut;

import java.util.Arrays;
import java.util.List;

/**
 * Created by nugusbayevkk on 1/29/17.
 */
abstract class Shape{
    boolean isHighlighted = false;
    void draw() { System.out.println(this + "draw()");}
    abstract public String toString();
}
class Rhomboid extends Shape{

    public String toString(){ return "Rhomboid";}
}
class Circle extends Shape{
    public String toString(){ return  "Circle";}
}
class Square extends Shape{
    public String toString(){ return "Square";}
}
class Triangle extends Shape{
    public String toString(){ return "Triangle";}
}
public class Shapes {
    public static void main(String[] args){
        List<Shape> shapeList = Arrays.asList(new Rhomboid(),new Circle(), new Square(), new Triangle());
        for (Shape shape : shapeList) {
            shape.draw();
            rotate(shape);
        }
        Shape temp  = new Rhomboid();
        temp.draw();
        if (temp instanceof Rhomboid) {
            Rhomboid q = (Rhomboid) temp;
            q.draw();
        }

    }
    public static void rotate(Shape s){
        if (s instanceof Circle){
            StdOut.println("I am rotated");
        }
    }
}
