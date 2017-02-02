package patterns.fundamentals.immutable;

/**
 * Created by nugusbayevkk on 2/2/17.
 */
public class Test {
    public static void main(String[] args){
        ImmutablePoint2D point = (ImmutablePoint2D) new Point2D(0,0);
        int x = point.getX();
//        point.setX(); compile error, method setX() not exists in ImmutablPoint2D
    }
    public void mutate(ImmutablePoint2D point){
        ((Point2D)point).setX(42);// this call is legal, sine the type
        // has been converted to the mitable Point2D class
    }
}
