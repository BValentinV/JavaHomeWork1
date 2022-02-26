package Lesson3;

public class Main {

    public static void main(String[] args) {

        int[] arr1 = {1, 0, 1, 0, 0, 1, 0, 0, 1, 1};
        int[] arr3 = {4, 2, 8, 5, 16, 3, 6, 4, 1, 10, 3, 2};
        int[] arr6 = {9, 6, 4, 3, 18, 1, 7, 3, 9, 5, 4, 2};
        int[] arr7 = {1, 1, 2, 2};

        System.out.println("Point 1: ");
        invertArray(arr1);
        System.out.println("\nPoint 2: ");
        fillArray(100);
        System.out.println("\nPoint 3: ");
        changeArray(arr3);
        System.out.println("\nPoint 4: ");
        fillDiagonal();
        System.out.println("\nPoint 5: ");
        returningArray(5, 1);
        System.out.println("\nPoint 6: ");
        minMaxElements(arr6);
        System.out.println("\nPoint 7: ");
        System.out.println(comparisonArray(arr7));

    }

    public static void invertArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }
    }

    public static void fillArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
    }

    public static void changeArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.print(arr[i] + " ");
        }
    }

    public static void fillDiagonal() {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void returningArray(int len, int initialValue){
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print("[" + i + "]" + arr[i] + " ");
        }
    }

    public static void minMaxElements( int[] arr){
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }

    public static boolean comparisonArray( int[] arr){
        int rightSum = 0;
        int leftSum = 0;

        for (int i = 0; i < arr.length; i++) {
            rightSum += arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            leftSum += arr[i];
            if (leftSum == rightSum - leftSum) {
                return true;
            }
        }
        return false;
    }

}
