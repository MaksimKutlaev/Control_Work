package OOP_Java.Toy;

public class Ball extends Toy{
    private String material;
    
    public Ball(int id, String name, int quantity, int weight, String material){
        super(id, name, quantity, weight);
        this.material=material;
    }
    
    public String getMaterial(){
        return material;
    }

    public String getDescription(){
        return "Мяч \""+getName()+"\" из материала "+material;
    }
}
