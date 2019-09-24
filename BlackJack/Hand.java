
/**
 * Write a description of class TheHand here.
 *
 * @author (Alek Ledesma)
 * @version (9.17.19)
 */
import java.lang.Math;
public class Hand
{
    private int card1;
    private int card2;
    private int total;

        public Hand()
    {    
        card1 = hit();
        card2 = hit();
        total = card1 + card2;
    }
    
    public int hit()
    {
        double newNum = Math.random()*10 + 1;
        int card = (int) newNum;
        total += card;
        return card;      
    }
    
    public int Card1()
    {
        return card1;
    }
    public int Card2()
    {
        return card2;
    }
    public int Total()
    {
        return total;
    }

}
