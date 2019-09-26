
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
        boolean bust = false;

        while (playerHand.Total() < 21 && !stay)
        {
            String hitScanner = scanner.nextLine();
            if(hitScanner.equals("hit"))
            {
                System.out.println("player got a " + playerHand.hit());
                System.out.println("new player total: " + playerHand.Total());
            }else
            {
                stay = true;
                System.out.println("player stays");
            }
        }
        while (dealerHand.Total() <= 17 && !bust )
        {
            dealerHand.hit();
            System.out.println("dealer total: " + dealerHand.Total());
        }
        if(playerHand.Total() > dealerHand.Total() && !bust)
        {
            System.out.println("You won");
        }
        if(playerHand.Total() < dealerHand.Total())
        {
            System.out.println("You lose");
        }
        if (playerHand.Total() > 21)
        {
            System.out.println("You busted");
        }
        if(dealerHand.Total() > 21)
        {
            System.out.println("Dealer busted");
        }
        if(playerHand.Total() == dealerHand.Total())
        {
            System.out.println("Draw...");
        }
        }
    }


