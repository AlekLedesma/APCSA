
/**
 * Write a description of class ExeptionalNotes here.
 *
 * @author (Alek Ledesma)
 * @version (11.13.19)
 */
public class ExceptionalNotes
{
    public static boolean test(int y) throws Exception
    {
        if (y < 0) 
        {
            throw new Exception("Y is negative");
        }
        return true;
    }
}
