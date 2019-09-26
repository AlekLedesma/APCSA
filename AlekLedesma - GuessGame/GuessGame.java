
/**
 * Write a description of class GuessGame here.
 *
 * @author (Alek Ledesma)
 * @version (8.30.19)
 */

import java.lang.Math;
import java.util.Scanner;
public class GuessGame
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double num = Math.random()*10 + 1;
        int newNum = (int) num;
        for (int chances = 5; chances > 5; chances--)
        {
            int inputScanner = scanner.nextInt();
            System.out.println("you have " + chances + "chances left");
            if (inputScanner == newNum)
            {
                System.out.println("You got guessed the right number");
            }else if (inputScanner > newNum)
            {
                 System.out.println("too high");
            }
            else if (inputScanner < newNum)
            {
                System.out.println("too low");
            }
        }
    }
}    

