public class Loop {
    public static void main(String[] args) {
        int a = 10;
        a = a + 1;
        a += 1;
        a++;

        a = a - 1;
        a -= 1;
        a--;
        int i = 1;
        while (i < 1000) {
//            System.out.println(i);
            i++;
            if (i == 5) {
                break;
            }
        }
        //Задача: вывести все четные числа с 1000 до 0
        int var1 = 1000;
        while (var1 >= 0) {
            if (var1 % 2 == 0) {
//                System.out.println(var1);
            }
            var1--;
        }
        int c = 0;
        double d = 0;
        while (c < 100) {
            c++;
            d = d + c;
        }
        d = d / 100;
        System.out.println(d);

        /////////
        int e = 0;
        do {
            System.out.println("Привет");
        } while (e > 0);
        ///
        for (int count = 0; count < 100; count++) {
            System.out.println(count);
        }
        for (int f = 1000; f > 0; f--) {
            if (f % 3 == 0) {
                System.out.println(f);
            }
        }
    }
}
