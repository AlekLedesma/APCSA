
/**
 * Write a description of class ControlStatement here.
 *
 * @author (Alek Ledesma)
 * @version (8.27.19)
 */

import java.lang.Math;
public class ControlStatement
{
    public static String grade(int percentage)
    {
        if (percentage >= 90)
        {
            return "A";
        }   
        else if (percentage >= 80 && percentage < 90)
        {
            return "B";
        }
        
        return "F";
        //Here is the OR operator:||
        //percentage < 90 || percentage > 90
    }
    public static void main()
    {
        String letter = grade(97);
        System.out.println(letter);
    }
}
