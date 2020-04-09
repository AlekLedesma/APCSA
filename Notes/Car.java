
/**
 * Write a description of class carTest here.
 *
 * @author (Alek Ledesma)
 * @version (4.8.20)
 */
public class Car extends Vehicle
{
    private boolean hasWheels;
    
    public Car()
    {
        super(true);
        hasWheels = true;
    }
    public Car(boolean hasEngine)
    {
        super(hasEngine);
        hasWheels = true;
    }
}
