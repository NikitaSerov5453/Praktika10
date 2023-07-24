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
        String string = String.valueOf(number);
        if (string.length() % 2 == 0) {
            int counter = 0;
            String s1 = string.substring(0, string.length() / 2);
            String s2 = string.substring(string.length() / 2);
            char[] chars1 = s1.toCharArray();
            char[] chars2 = s2.toCharArray();
            for (int i = 0; i < string.length()/2; i++) {
                counter += Integer.parseInt(String.valueOf(chars1[i]));
                counter -= Integer.parseInt(String.valueOf(chars2[i]));
            }
            if (counter == 0) {
                System.out.println("Число счастливое");
            } else {
                System.out.println("Число не счастливое");
            }
        } else {
            System.out.println("Введено не корректное заначение");
        }
    }

    public static Scanner scanner() {
        return new Scanner(System.in);
    }
}
