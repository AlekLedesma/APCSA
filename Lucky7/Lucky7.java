
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

        while (x > 0)
        {
            double dice1 = Math.random()*7;
            int roll1 = (int) dice1;
            double dice2 = Math.random()*7;
            int roll2 = (int) dice2;
            int roll = roll1 + roll2;
            x--;
            if (roll == 7)
            {
                x+=5;
                System.out.println("rolled a 7!");
            }
            if (x == 0)
            {
               System.out.println("You lasted " + rounds + " rounds"); 
            }
            rounds ++;
            System.out.println("you have " + x + " left");
            System.out.println("Round " + rounds);
        }



    }
}
