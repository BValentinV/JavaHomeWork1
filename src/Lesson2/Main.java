package Lesson2;

public class Main {

    public static void main(String[] args) {

        System.out.println(within10and20(15,14));
        System.out.println(isPositiveOrNegative(0));
        System.out.println(isNegative(-5));
        printWordNTimes("Java",5);
        System.out.println(isALeapYer(2000));

    }

    public static boolean within10and20(int x1, int x2) {
        boolean result = x1 + x2 >= 10 && x1 + x2 <= 20;
        return result;
    }

    public static int isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("Положительное");
        }
        else if (x < 0) {
            System.out.println("Отрицательное");
        }
        return x;
    }

    public static boolean isNegative(int x) {
        if (x < 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void printWordNTimes (String word, int times) {
        for (int i = 1; i <= times; i++) {
            System.out.println(i + "." + " " + word);
        }
    }

    public static boolean isALeapYer(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        }
        else {
            return false;
        }

    }
}





