package OOP_Java;

import OOP_Java.Toy.Ball;
import OOP_Java.Toy.Car;
import OOP_Java.Toy.Toy;
import OOP_Java.Toy.ToyLottery;

public class ToyShop {
    public static void main(String[] args) {
        // Создаем розыгрыш
        ToyLottery lottery = new ToyLottery();
        // Добавляем игрушки
        lottery.addOrEditToy(new Ball(1, "Футбольный мяч", 10, 20, "Кожа"));
        lottery.addOrEditToy(new Ball(2, "Баскетбольный мяч", 8, 15, "Резина"));
        lottery.addOrEditToy(new Car(3, "Машинка с пультом", 5, 10, "Lego"));
        lottery.addOrEditToy(new Car(4, "Машинка-трансформер", 3, 5, "Hasbro"));
        // Розыгрыш призовой игрушки
        Toy prize = lottery.drawPrize();
        if (prize != null) {
        System.out.println("Поздравляем! Вы выиграли " + prize.getDescription());
        } else {
        System.out.println("К сожалению, призовых игрушек больше нет");
        }
        // Получение призовой игрушки
        Toy claimedPrize = lottery.getPrize();
        if (claimedPrize != null) {
        System.out.println("Вы получили свою призовую игрушку: " + claimedPrize.getDescription());
        } else {
        System.out.println("Призовых игрушек больше нет");
        }
    }
}
