
/**
 * Write a description of class Notes3 here.
 *
 * @author (Alek Ledesma)
 * @version (8.26.19)
 */
public class Notes3
{
    public static final double PI = 3.1459; //final means it can't be changed
    int guacomole = 17;
    
    
    public static void equality ()
    {
        int a = 5;
        int b = 5;
        System.out.println("That is true");
        System.out.println(a == b); // "==" is a questiopn "=" is a statement
        System.out.println();
        
        String c = "this";
        String d = "this";
        System.out.println(c == d); // this is WRONG
        System.out.println(c.equals(d));
        
    }
    public static void mystery()
    {
        int a = 5;
        int b = 0;
        System.out.println(a / b);
    }
    public static int round (double number)
    {
        return (int) (number + .5);
    }
}
/*List of operators

 *  +   addition 
 *  ++  increment
 *  -   subtraction
 *  --  decrement
 *  =   assignment
 *  ==  primitive equality
 * (/)  division
 *  %   modulus
 *  *   multiplication
 *  !   not
 *  ||  or
 *  &&  and
 *  ^   
 *  <   less than
 *  <=  less than or equal to
 *  >   greater than
 *  >=  greater than or equal to
 */



