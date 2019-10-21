
/**
 * Write a description of class runner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
    public class apcsReplaceAllRunner
{
    public static void main(){
        System.out.println("This should say '2 be or not 2 be'");
        System.out.println((apcsReplaceAll.apcsReplaceAll("to be or not to be","to","2")));
        System.out.println();

        System.out.println("This should say 'advanced calculus'");
        System.out.println(apcsReplaceAll.apcsReplaceAll("advanced calculus","math","science"));
        System.out.println();

        System.out.println("This should say 'gonegonegone'");
        System.out.println(apcsReplaceAll.apcsReplaceAll("gogogo","go","gone"));
        System.out.println();

        System.out.println("This should say 'baa'");
        System.out.println(apcsReplaceAll.apcsReplaceAll("aaaaa","aaa","b"));
        System.out.println();
    }
}
