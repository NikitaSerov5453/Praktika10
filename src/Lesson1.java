public class Lesson1 {
    /**
     * Напишите метод, который отображает на экран форматированный текст, указанный ниже
     * “Someone’s sitting in the shade today
     * because someone planted a tree a long time ago.”
     * Warren Buffet
     */
    public static void main(String[] args) {
        addTab();
    }

    public static String string = new String("""
            “Someone’s sitting in the shade today
            because someone planted a tree a long time ago.”
            Warren Buffet""");

    public static void addTab() {
        System.out.println(string);
    }
}
