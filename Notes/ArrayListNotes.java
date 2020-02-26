
/**
 * Write a description of class ArrayListNotes here.
 *
 * @author (Alek Ledesma)
 * @version (2.24.20)
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ArrayListNotes
{
   private ArrayList shoppingCart;
    public ArrayListNotes()
   {
       shoppingCart = new ArrayList();
       shoppingCart.add("Milk");
       shoppingCart.add(new Integer(5));     
       shoppingCart.add(new Scanner(System.in));
       
       System.out.println(shoppingCart.get(0));      
   }
   public static void main()
   {
       ArrayList<String> words = new ArrayList<String>();
       words.add("Dog");
       words.add("Cat");
       words.add(0, "Cow");
       words.add("Red");
       words.add(words.size(), "Does this work?");
       System.out.println(words.get(0));
       for(String word : words)
       {
           System.out.println(word);
       }
       //for(int i = 0; i < words.size(); i++)
       //{
       //   System.out.println(words.get(i));
       //}
       //* Removing Stuff
       words.remove(4);
       
       //* Removing Specifics
       for (int i = 0; i < words.size(); i++)
       {
           if(words.get(i) .equals ("Dog"))
           {
               words.remove(i);
           }
       }
   }
   
   public static void testerMethod()
   {
       ArrayList<String> animals = new ArrayList<String>();
       animals.add("moose");
       animals.add("moose");
       animals.add("moose");
       animals.add("moose");
       animals.add("moose");       
       animals.add("moose");
       
       //Removes moose
       for (int i = animals.size()-1; i >= 0; i--)
       {
           if(animals.get(i) .equals ("moose"))
           {
               animals.remove(i);
           }
       }
       
       for (String animal : animals)
       {
           System.out.println(animal);
       }
       
       System.out.println("we have " + animals.size() + " animals left");
    }

}
