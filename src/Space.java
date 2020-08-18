import javax.sound.midi.Soundbank;

public class Space {
    public static void main(String[] args) {
        int[] nums1 = new int[12]; //массив
        nums1[0] = 10;

        int[] nums2 = {1, 2, 3, 4, 5, 6, 7, 8};

        int[] dayOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i : dayOfMonth) {
            System.out.println(i);
        }
        String s = "Hello, world!";
        System.out.println(s);

        String name = "Иван";
        int age = 33;
        String result = "Привет, \"" + name + "\"! \nТебе " + age + " года.";
        System.out.println(result);

        String[] months = {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь",
                "Октябрь", "Ноябрь", "Декабрь"};
        String result2 = months[0] + ", " + months[1] + ", " + months[2] + ", " + months[3] + ", " + months[4] + ", "
                + months[5] + ", " + months[6] + ", " + months[7] + ", " + months[8] + ", " + months[9] + ", "
                + months[10] + ", " + months[11] + ". ";
        System.out.println(result2);

        int numberOfMonth = 13;
        if (numberOfMonth == 1) {
            System.out.println("Январь");
        } else if (numberOfMonth == 2) {
            System.out.println("Февраль");
        } else if (numberOfMonth == 3) {
            System.out.println("Март");
        } else if (numberOfMonth == 4) {
            System.out.println("Апрель");
        } else if (numberOfMonth == 5) {
            System.out.println("Май");
        } else if (numberOfMonth == 6) {
            System.out.println("Июнь");
        } else if (numberOfMonth == 7) {
            System.out.println("Июль");
        } else if (numberOfMonth == 8) {
            System.out.println("Август");
        } else if (numberOfMonth == 9) {
            System.out.println("Сентябрь");
        } else if (numberOfMonth == 10) {
            System.out.println("Октябрь");
        } else if (numberOfMonth == 11) {
            System.out.println("Ноябрь");
        } else if (numberOfMonth == 12) {
            System.out.println("Декабрь");
        }
        ///
        switch (numberOfMonth) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("Месяц не существует");
        }
        String firs = "Hello";
        String second = "Hello";
        if (firs.equals(second)) {     //использовать метод equals для сравнеия строк обязательно
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}

