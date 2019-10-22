
/**
 * Write a description of class ReplaceAll here.
 *
 * @author (Alek Ledesma)
 * @version (10.21.19)
 */
public class apcsReplaceAll
{
    public static String apcsReplaceAll(String str, String oldStr, String newStr)
    {
        int locat = str.indexOf(oldStr);
        while (locat >= 0)
        {
            String before = str.substring(0, locat);
            String after = str.substring(locat + oldStr.length());
            
            return before + newStr + after;
        }
        return "";
    }
}


