import java.util.Scanner;

public class Lesson7 {
    /**
     * Напишите метод, который проверяет является ли
     * шестизначное число «счастливым». Число передаётся
     * в качестве параметра. Если число счастливое нужно вернуть из метода true, иначе false.
     * «Счастливое шестизначное число» — это число у которого сумма первых трёх цифр равна сумме трёх вторых
     * цифр. Например, 123420 — счастливое 1+2+3 = 4+2+0, а 723422 – несчастливое 7 + 2 + 3 != 4 + 2 + 2
     */

    public static void main(String[] args) {
        luckyNumber(scanner().nextInt());
    }

    public static void luckyNumber(int number) {
        char[] chars = ("" + number).toCharArray();
        int a = Integer.parseInt(String.valueOf(chars[0])) +
                Integer.parseInt(String.valueOf(chars[1])) +
                Integer.parseInt(String.valueOf(chars[2]));

        int b = Integer.parseInt(String.valueOf(chars[3])) +
                Integer.parseInt(String.valueOf(chars[4])) +
                Integer.parseInt(String.valueOf(chars[5]));
        if (a == b) {
            System.out.println("Число счасливое");
        } else {
            System.out.println("Число не счастливое");
        }
    }

    public static Scanner scanner() {
        return new Scanner(System.in);
    }
}
