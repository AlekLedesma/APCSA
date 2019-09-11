
/**
 * Write a description of class Stapler here.
 *
 * @author (Alek Ledesma)
 * @version (9.4.19)
 */
public class Stapler
{
    private int staplesLeft;
    private String color;
    private String brand;
    private String size;
    private boolean isElectric;
    private boolean isJammed;
    private String name;
    
    public Stapler( String name,int numofStaples, String color, String brandName, String size, boolean isElectric)
    {
        isJammed = false;
        staplesLeft = numofStaples;
        this.color = color;
        brand = brandName;
        this.size = size;
        this.isElectric = isElectric;
        this.name = name;
    }
    public Stapler()
    {
        name = "Jonathan Joestar";
        isJammed = false;
        staplesLeft = 100;
        color = "Red";
        brand = "SwingLine";
        isElectric = false;
        size = "Regular";
    }
    public Stapler(String brandName)
    {
        this("Stapler", 100, "red", brandName, "Regular", false);
    }
    public void stapleStuff()
    {
        System.out.println("you stapled the papers" + color + "stapler.");
        staplesLeft--;
        System.out.println("you have " + staplesLeft + " staples left");
        
    }
    public void toss(String name)
    {
     System.out.println("You throw the stapler at " + name + "."); 
     isJammed = true;
     System.out.println("The stapler is now broken");
     
    }
    
    //Acces Methods
     public String getName()
     {
         return name;
     }
     public int numOfStaplesLeft()
     {
         return staplesLeft;
     }
     public String getBrand()
     {
         return brand;
     }
     public String getcolor()
     {
        return color;
     }
     public String getsize()
     {
         return size;
     }
     
     //Mutator Methods
     public void changeName(String newName)
     {
        name = newName;
     }
     public void changeBrand(String newBrand)
     {
        brand = newBrand;
     }
     public void changeColor(String newColor)
     {
        color = newColor;
     }
     
}
