import java.util.Scanner;

public class Lesson2 {
    /**
     * Напишите метод, который принимает два числа в качетсве параметра и отображает все четные числа между ними.
     */
    public static void main(String[] args) {
        evenNumbers(scanner().nextInt(),scanner().nextInt());
    }

    public static void evenNumbers(int a, int b) {
        int minValue;
        int maxValue;
        if (a > b) {
            minValue = b;
            maxValue = a;
        } else {
            minValue = a;
            maxValue = b;
        }
        for (int i = minValue;i < maxValue ; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static Scanner scanner() {
        return new Scanner(System.in);
    }
}
