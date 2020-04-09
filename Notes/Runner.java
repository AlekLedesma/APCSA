
/**
 * Write a description of class Runner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Runner
{
    public static void main()
    {
        ArrayList<Vehicle> garage = new ArrayList<Vehicle>();
        Vehicle weibeMobile = new Boat(true, 10);
        Vehicle wiebeMobile = new Car();
        weibeMobile.turnOnEngine();
        weibeMobile.turnOnEngine();

    }
}
