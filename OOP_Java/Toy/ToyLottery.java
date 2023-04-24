package OOP_Java.Toy;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ToyLottery {
    private List<Toy> toys = new ArrayList<>();
    private List<Toy> prizes = new ArrayList<>();
    private Random rand = new Random();

    public void addOrEditToy(Toy toy) {
        for (Toy t : toys) {
            if (t.getId() == toy.getId()) {
                t.setWeight(toy.getWeight());
                return;
            }
        }
        toys.add(toy);
    }

    public Toy drawPrize() {
        double totalWeight = 0;
        for (Toy t : toys) {
            totalWeight += t.getWeight();
        }
        double randomWeight = rand.nextDouble() * totalWeight;
        for (Toy t : toys) {
            randomWeight -= t.getWeight();
            if (randomWeight <= 0) {
                Toy prize = null;
                try {
                    FileWriter writer = new FileWriter("prizes.txt", true);
                    writer.write(t.getDescription() + "\n");
                    writer.close();
                    t.decrementQuantity();
                    if (t.getQuantity() == 0) {
                        toys.remove(t);
                        }
                        prizes.add(t);
                        prize = t;
                } catch (IOException e) {
                    System.out.println("Ошибка записи в файл: " + e.getMessage());
                }
                return prize;
            }
        }
        return null;
    }

    public Toy getPrize() {
    if (prizes.isEmpty()) {
        return null;
    }
    Toy prize = prizes.get(0);
    prizes.remove(0);
    return prize;
    }
}

