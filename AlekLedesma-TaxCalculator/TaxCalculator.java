
/**
 * Write a description of class TaxCalculator here.
 *
 * @author (Alek Ledesma)
 * @version (8.26.19)
 */
import java.util.Scanner;
public class TaxCalculator{
    public static void tax(String[] args){
    
    Scanner scanner = new Scanner(System.in);

    System.out.println("gross income?");
    int line1 = scanner.nextInt();
    System.out.println("number of dependants?");
    int line2 = scanner.nextInt();
    
    double line3 = line1 - 10000 - 2000 * line2;
    double line4 = line3 *.20;

    
    System.out.println("your income tax is: ");
    System.out.println(line4);
   }
}