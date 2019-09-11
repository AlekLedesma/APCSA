
/**
 * Write a description of class StaplerRunner here.
 *
 * @author (Alek Ledesma)
 * @version (9.5.19)
 */
public class StaplerRunner
{
    public static void main()
    {
        Stapler myStapler = new Stapler();
        Stapler stapler2 = new Stapler("PaperPro");
        //Stapler stapler3 = new Stapler(100);  //doesn't work since there's not constructor
        //System.out.println(myStapler.isJammed);        
        myStapler.stapleStuff();
        myStapler.stapleStuff();
        stapler2.stapleStuff();
    }
}
