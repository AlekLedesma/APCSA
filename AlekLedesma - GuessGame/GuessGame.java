
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
        int tries = 5;
        String guess = scanner.next();
        
        
        
        tries --;
        System.out.println("you have " + tries + " left");
        
        

    }
}    

