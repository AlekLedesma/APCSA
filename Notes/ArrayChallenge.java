
/**
 * Write a description of class ArrayChallenge here.
 *
 * @author (Alek Ledesma)
 * @version (10.29.19)
 */
public class ArrayChallenge
{
    public static void main()
    {
        double[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

    }
    
    public static void addArray(double[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
    }
    
    public static void averageArray(double[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            i = i / 20;
            System.out.println(i);
        }
    }
}
