
/**
 * Write a description of class Notes4 here.
 *
 * @author (Alek Ledesma)
 * @version (8.29.19)
 */

import java.lang.Math;
public class randomNumbers
{
    public static void main(String[] args)
    {
        double num = Math.random()*10 + 1;
        int newNum = (int) num;
        System.out.println(newNum);
    }
    public static void main2(String[] args)
    {
        double num = Math.random()* 44 + 27;
        int newNum = (int) num;
        System.out.println(newNum);
    }
}
