
/**
 * Write a description of class Loops here.
 *
 * @author (Alek Ledesma)
 * @version (9.1.19)
 */
public class Loops
{
    public static void main()
    {
        for (int i = 0; i < 100; i++)
        {
          System.out.println("Lo hicimos, we did it");
        }
    }
    public static void main2()
    {
        for (int i = 0; i < 100; i+=2)
        {
          System.out.println("Lo hicimos, we did it");
        }
    }
    public static void main3()
    {
        for (int i = 0; i < 10; i+=2)
        {
          System.out.println(i);
        }
    }
    public static void main4()
    {
        for (int i = 0; i < 10;)
        {
          System.out.println(i);
          i++;
        }
    }
    public static void main5()
    {
        for (int i = 0; i > 0; i--)
        {
          System.out.println(i);
        }
    }
    public static void main6()
    {
        for (int i = 0; i < 6; i++)
        {
          for (int j = 0; j < 6; j++)
          {
              System.out.println(j + " ");
          }
          System.out.println();
        }
    }
    
    
    
}
