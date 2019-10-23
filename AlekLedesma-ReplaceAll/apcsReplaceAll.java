
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
        String str2 = str;
        while (locat >= 0)
        {
            String before = str2.substring(0, locat);
            String after = str2.substring(locat + oldStr.length());
            
            str2 = before + newStr + after;
            locat = str2.indexOf(oldStr, locat + 1);
        }
        return str2;
    }
}


