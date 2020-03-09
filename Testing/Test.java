
/**
 * Write a description of class Testing here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.List;
import java.util.ArrayList;

public class Test
{
    public static void main(String[] args)
    {
        ArrayList<Integer> values = new ArrayList<Integer>();
        int[] nums = {1, 44, 7, 9, -16, 3};
        
        for (int i : nums)
        //i = 0; i < nums.length; i ++)
        {
            values.add(i); 
        }
        System.out.println("Expected Result:\t [1, 44, 7, 9, -16, 3]");
        System.out.println("Your Result:\t\t " + values);
    }
}


