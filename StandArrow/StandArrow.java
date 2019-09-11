
/**
 * Write a description of class StandArrow here.
 *
 * @author (Alek Ledesma)
 * @version (9.6.19)
 */
public class StandArrow
{
    private String color;                                             
    private int numofDesire;
    private boolean isWorthy;
    private boolean hasStand;
    private String standName;
    
    public StandArrow (String color, int numofDesire, String standName,boolean isWorthy, boolean hasStand)
    {
        this.isWorthy = isWorthy;
        this.hasStand = hasStand;
        this.numofDesire = numofDesire;
        this.color = color;
        this.standName = standName;
        
    }
}
