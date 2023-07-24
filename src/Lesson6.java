import java.util.Scanner;

public class Lesson6 {
    /**
     * Напишите метод, который проверяет является ли число
     * простым. Число передаётся в качестве параметра. Если
     * число простое нужно вернуть из метода true, иначе false
     */

    public static void main(String[] args) {
        primeNumber(scanner().nextInt());
    }

    public static void primeNumber(int number) {
        int counter = 0;
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                counter++;
            }
        }
        System.out.println(counter == 1);
    }

    public static Scanner scanner() {
        return new Scanner(System.in);
    }
}
