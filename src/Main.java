public class Main {
    public static void main(String[] args) {
//        Box varBox1 = new Box();
//        varBox1.height = 10.2;
//        varBox1.width = 15;
//        varBox1.lenght = 11.3;
//        double volume = varBox1.height * varBox1.lenght * varBox1.width;
//        System.out.println(volume);
//
//        Box varBox2 = new Box();
//        varBox2.height = 5;
//        varBox2.width = 5;
//        varBox2.lenght = 5;
//        double volume2 = varBox2.height * varBox2.lenght * varBox2.width;
//        System.out.println(volume2);
//
//        Box varBox3 = new Box();
//        varBox3.height = 12;
//        varBox3.width = 12;
//        varBox3.lenght = 12;
//
//        Box varBox4 = varBox3;
//        varBox4.height = 19;
//        double volume3 = varBox3.height * varBox3.lenght * varBox3.width;

//        System.out.println(volume3);

        Test test = new Test();
        int square = test.square(80);
        System.out.println(square);

//        Box box = new Box();
//        box.setDimens(15, 15, 15);
//        System.out.println(box.volume());

        Rect rect1 = new Rect();

        rect1.methRect(6, 14);
        rect1.perimRect();
        rect1.squareRect();

        Box box2 = new Box( 12,15,18 );
        System.out.println(box2.volume());

    }
}
