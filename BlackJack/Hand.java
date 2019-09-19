
/**
 * Write a description of class TheHand here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.lang.Math;
public class Hand
{
    private int card1;
    private int card2;
    public Hand()
    {
        double num1 = Math.random()*10 + 1;
        card1 = (int) num1;
        double num2 = Math.random()*10 + 1;
        card2 = (int) num2;
        
    }
    
    public void hit()
    {
        int card3;
        double num3 = Math.random()*10 + 1;
        card3 = (int) num3;
        int hitt = (int) card1 + card2 + card3;
        if (hitt < 21)
        {
            System.out.println("bust");
        }
    }
    public void stay()
    {
        int stayy = (int) card1 + card2;
    }
    //if (hand > 21){System.out.println("you went over the limit")}
}
