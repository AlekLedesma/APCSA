
/**
 * Write a description of class inheritanceNotes here.
 *
 * @author (Alek Ledesma)
 * @version (4.8.20)
 */
public class Vehicle
{
    boolean hasEngine;
    boolean engineOn = false;
    public Vehicle(boolean engine)
    {
        hasEngine = engine;
    }
    public void turnOnEngine()
    {
        System.out.println("you turn the engine on");
        engineOn= true;
    }
    public void turnOffEngine()
    {
        System.out.println("you turn the engine off");
        engineOn= false;
    }
}
