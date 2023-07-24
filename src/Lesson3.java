import java.util.Scanner;

public class Lesson3 {
    /**
     * Напишите метод, который отображает горизонтальную или вертикальную линию из некоторого символа.
     * Метод принимает в качестве параметра: длину линии,
     * направление, символ.
     */

    public static void main(String[] args) {
        printLine(10, 0, scanner().next());
    }

    public static int horizontal = 0;
    public static int vertical = 1;

    public static void printLine(int length, int horizontalOrVertical, String value) {
        for (int i = 0; i < length; i++) {
            if (horizontalOrVertical == horizontal) {
                System.out.print(value);
            } else if (horizontalOrVertical == vertical) {
                System.out.println(value);
            } else {
                System.out.println("Ошибка");
            }
        }
    }

    public static Scanner scanner() {
        return new Scanner(System.in);
    }
}
