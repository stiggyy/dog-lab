// ****************************************************************
// DogTest.java
//
// A simple test class that creates a Dog and makes it speak.
//          
// ****************************************************************


public class DogTest
{
    public static void main(String[] args)
    {
    Dog dog = new Dog("Spike");
    System.out.println(dog.getName() + " says " + dog.bark());
    
    Labrador lab = new Labrador("yass", "light pink");
    System.out.println(lab.getName());
    
    Yorkshire york = new Yorkshire("slay",5);
    york.waddle();
    
    lab.waddle();
    //this doesnt work because the waddle method doesnt exist yet
    }
}
