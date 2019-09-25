
/**
 * Write a description of class Player here.
 *
 * @author (Alek Ledesma)
 * @version (9.24.19)
 */
import java.util.Scanner;
public class Game

{
    
    public static void main ()
    {
        Hand dealerHand = new Hand();
        Hand playerHand = new Hand();
        Scanner scanner = new Scanner (System.in);
        System.out.println("player drew " + playerHand.Card1() + " & "  + playerHand.Card2());
        boolean stay = false;
        //boolean bust = false;
        //boolean compare = false;

        while (playerHand.Total() < 21 && !stay)
        {
            String hitScanner = scanner.nextLine();
            if(hitScanner.equals("hit"))
            {
                playerHand.hit();
                System.out.println("player got a " + playerHand.hit());
                System.out.println("new player total: " + playerHand.Total());
            }else
            {
                stay = true;
                System.out.println("player stays");
            }
        }
        if (playerHand.Total() > 21)
        {
            System.out.println("Player busted");
        }
        while (dealerHand.Total() <= 17 && !stay )
        {
            dealerHand.hit();
            System.out.println("dealer total: " + dealerHand.Total());
        }
        if (dealerHand.Total() >= 17)
        {
            stay = true;
        }
        }
    }


