
/**
 * Write a description of class Lucky7 here.
 *
 * @author (Alek Ledesma)
 * @version (9.12.19)
 */
import java.lang.Math;
public class Lucky7
{
    public static void main()
    {
        int x = 15;
        int rounds = 0;
        
        double dice1 = Math.random()*6 + 1;
        double dice2 = Math.random()*6 + 1;
        
        double roll = dice1 + dice2;
        
        while (x <= 0)
        {
            if (roll == 7)
            {
                x+=4;
            }
            else
            {
                x--;
            }
            System.out.println("You lasted " + rounds + " rounds");
        }
        

        rounds ++;
        System.out.println("you have " + x + " left");
        System.out.println("Round " + rounds);
        
            
            
        
    }
}
