package OOP_Java;

import OOP_Java.Toy.*;

public class game{
    public static void main(String[] args) {
        
        ToyStore store=new ToyStore();

        Toy toys1 = new Toy(1, "Teddy Bear", 5, 20);
        Toy toys2 = new Toy(2, "Toy Car", 10, 50);
        Toy toys3 = new Toy(3, "Doll", 3, 25);
        Toy toys4 = new Toy(4, "Board Game", 12, 25)

        store.addToy(toys1);
        store.addToy(toys2);
        store.addToy(toys3);

        store.updateWeight(1,50);

        for (int i=0; i<3; i++){
            store.drawPrize();
        }
        
        store.savePrizeToFile();
    }
}