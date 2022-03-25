package Lesson7;

public class Main {

    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Барсик", 10),
                new Cat("Марсик", 15),
                new Cat("Абрикос", 25),
                new Cat("Тузик", 5),
                new Cat("Жулик", 1)
        };

        Plate plate = new Plate(30);

        for (Cat cat : cats) {
            cat.eat(plate);
            cat.info();
        }

        plate.addFood(50);
        plate.info();
    }
}
