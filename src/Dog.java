import static java.awt.SystemColor.info;

public class Dog {
    String name;
    String breed;
    int speed = 30;

    void run() {
        int count = 0;
        while (count <= speed) {
            System.out.println("Бегу!!!");
            count++;
        }
    }

//    String info() {
//        return info;
//    }
}
