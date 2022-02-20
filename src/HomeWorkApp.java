public class HomeWorkApp {

    public static void main(String[] args) {

        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

    }

    public static void printThreeWords() {

        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {

        int a = 13;
        int b = -16;
        int sum = a + b;
        System.out.println(sum);

        if (sum >= 0)
            System.out.println("Сумма положительная");
        if (sum < 0)
            System.out.println("Сумма отрицательная");
    }

    public static void printColor() {

        int value = 10;
        if (value <= 0)
            System.out.println("Красный");

        else if (value > 0 && value <= 100)
            System.out.println("Желтый");

        else if (value > 100)
            System.out.println("Зеленый");
    }

    public static void compareNumbers() {

        int a = 4;
        int b = 5;
        if (a >= b)
            System.out.println("a>=b");

        else if (a < b)
            System.out.println("a<b");
    }


}
