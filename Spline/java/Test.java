import java.io.File;
import java.io.PrintWriter;

public class Test {
    public static void main(String[] args) throws Exception {
        Point[] test = {
            new Point(0, 0),
            new Point(1, 3),
            new Point(5, 6),
            new Point(7, 10.5),
            new Point(8, 11),
            new Point(9, 12.9),
            new Point(11, 15.6),
            new Point(15, 16.8),
            new Point(17, 17.0),
            new Point(18, 19.1)
        };
        Velocity vel = new Velocity(test, 5, 10, .1);
    }
}