
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
        
        //Challenge 1
        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }

        //Challenge 2
        double total = 0;
        for (int i = 0; i < array.length; i++)
        {
            total += array[i];
        }
        System.out.println(total);

        //Challenge 3
        double average = total / array.length;
        System.out.println(average);
        
        

        double arrayMax = 0;
        //Challenge 4
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] <= arrayMax)
            {
                arrayMax = array[i];
            }
        }
        System.out.println(arrayMax);
        
        //Challenge 5
        double arrayMin = 0;
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] >= arrayMin)
            {
                arrayMin = array[i];
            }
        }
        System.out.println(arrayMin);
    }
}
