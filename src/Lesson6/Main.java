package Lesson6;

public class Main {

    public static void main(String[] args) {
        System.out.println("Кошка: ");
        Animal vaska = new Cat(200,10);
        vaska.run(200);
        vaska.swim(0);

        System.out.println("Собака: ");
        Animal elka = new Dog(500,10);
        elka.run(500);
        elka.swim(10);
    }

}
