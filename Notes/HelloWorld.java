
/**
 * Write a description of class HelloWorld here.
 *
 * @author (Alek Ledesma)
 * @version (8.19.19)
 */
public class HelloWorld{
    public static void main(String[] args){
        System.out.println("Hello World!");
    }

    public static void main2(){
        // This is a single line comment
        
        
        int x;  // Variable Declaration
        x = 7;  //Variable Instatntiation
    }
    public static void intergers(){
        int x;
        x = 14;
        x = 13;
        x = Integer.MAX_VALUE;
        x= x + 1;
        
        System.out.println(x);
    }
    public static void dataTypes(){
    // This both declares and initializes
    int x = 15;
    long y = 250000000; //NT up to 2^63-1
    short z = 1500; //NT up to 2^15-1
    byte w = 127; //NT up to 127 (2^7-1)
    
    float a = 5.5f; // NT 32-bit precision
    double b = 5.54; // 64-bit precision
    
    boolean q = true;
    
    char r = 'q'; //NT  Single letters only
    
    //Not a primitive Data Type
    String t = "Edison"; 
    }
    public static void math(){
    int a = 15;
    int b = 10;
    System.out.println(a + b);
    System.out.println(a - b);
    System.out.println(a * b);
    System.out.println(a / b);
    System.out.println(19 / 10); //doesn't show the decimal
    
    
    //Here is how to fix it
    System.out.println(19/(double)10);
    
    
    //how not to fix it
    System.out.println((double)(19 / 10));
    }
    
    
    
    
    
}