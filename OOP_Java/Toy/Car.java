package OOP_Java.Toy;

public class Car extends Toy {
    private String brand;

    public Car(int id, String name, int quantity, int weight, String brand){
        super(id, name, quantity, weight);
        this.brand=brand;
    }
    
    public String getBrand(){
        return brand;
    }

    public String getDescription(){
        return "Машинка \""+getName()+"\" бренда "+brand;
    }
    
}
