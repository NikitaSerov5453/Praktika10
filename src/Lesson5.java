public class Lesson5 {
    /**
     * Напишите метод, который возвращает сумму чисел
     * в указанном диапазоне. Границы диапазона передаются
     * в качестве параметров.
     */

    public static void main(String[] args) {
        System.out.println(sumNumbers(8, 9));
    }

    public static int sumNumbers(int a, int b) {
        int minValue;
        int maxValue;
        int counter = 0;
        if (a > b) {
            minValue = b;
            maxValue = a;
        } else {
            minValue = a;
            maxValue = b;
        }

        for (int i = minValue; i <= maxValue; i++) {
            counter+=i;
        }
        return counter;
    }


}
