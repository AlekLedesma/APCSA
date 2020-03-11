
/**
 * Write a description of class modArray here.
 *
 * @author (Alek Ledesma)
 * @version (3.9.20)
 */
public class modArray
{    

    public static int[] repNum(int newArray[], int index, int num)
    {
        int heldNum = 0;
        int nudgeNum = newArray[index];
        for (int i = index ; i < newArray.length; i++)
        {
            if (i == index)
            {
                newArray[i] = num;
            }
            if (i > index)
            {
                heldNum = nudgeNum;
                nudgeNum = newArray[i];
                newArray[i] = heldNum;
            }
        }
        return newArray;
    }
}
