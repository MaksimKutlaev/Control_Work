package OOP_Java.Toy;

public class Doll extends Toy{
    private String hairColor; 
    
    public Doll(int id, String name, int quantity, int weight, String hairColor){
        super(id, name, quantity, weight);
        this.hairColor=hairColor;
    }
    
    public String getHair(){
        return hairColor;
    }

    public String getDescription(){
        return "Doll\""+getName()+"\"с"+hairColor+"hair";
    }
}
