public class Bool {
    // < меньше
    // <= меньше либо равно
    // > больше
    // >= больше либо равно
    // == равно
    // != не равно
    public static void main(String[] args) {
        int temp = 40;
        boolean hot = temp > 25;
        int time = 24;
        boolean late = time >= 23;
        if (hot)
            System.out.println("Кондиционер включен");
        else if (!hot || late)
            System.out.println("Кондиционер выключен");
        }
}
