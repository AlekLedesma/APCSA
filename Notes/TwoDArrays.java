
/**
 * Write a description of class TwoDArrays here.
 *
 * @author (Alek Ledesma)
 * @version (1.7.19)
 */
public class TwoDArrays
{
    int[] array = new int[10];
    int[][] tdArray = new int[10][10];
    int[][] otherArr = new int[5][10];
    int[][][][][][][][][][] tenD;
    //    r  c 
    //int[a][b] ROW-MAJOR-FORMAT
    //starts at row 0, column 0
    //  r = y axis   c = x axis

    public TwoDArrays()
    {
        tdArray[0][0] = 1;
        tdArray[1][3] = 4;
    }
    public void numberAllCells(){
        int num = 1;
        for(int r = 0; r < tdArray.length; r++)
        {
            for(int c = 0; c < tdArray[0].length; c++)
            {
                tdArray[r][c] = num;
                num++;
            }
        }
        }
    public int addAllNumbers()
    {
        int total = 0;
        for(int r = 0; r < tdArray.length; r++)
        {
            for(int c = 0; c < tdArray[0].length; c++)
            {
               total += tdArray[r][c]; 
            }
        }
        return total;
    }
    public int addAllNumbers2()
    {
        //this has an Enhanced loop
        //Enhanced loops can't be used to change values in an array
        int total = 0;
        for(int[] oneArr : tdArray)
        {
            for(int num : oneArr)
            {
               total += num; 
            }
        }
        return total;
    }
}

