// ****************************************************************
// Labrador.java
//
// A class derived from Dog that holds information about
// a labrador retriever.  Overrides Dog speak method and includes
// information about avg weight for this breed.
//          
// ****************************************************************


public class Labrador extends Dog
{
    private String color; //black, yellow, or chocolate?
    

    public Labrador(String name,  String color)
    {
        // must make lab also a dog by super()
    super(name);
    this.color = color;
    }

    
    public String bark()
    {
    return "Labrador barking";
    }
    
    
    public void waddle(){
        System.out.println(name + ": Lab waddling!");
        //now it does
    }



}
