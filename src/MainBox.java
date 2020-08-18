public class MainBox {
    //тип имяМетода (список параметров) {
    //тело метода;
    //...
    //return тип;
    //}
    //void не возвращает данные
    //пустые круглые скобки - метод не принимает параметры
    //если метод возвращает данные, то используется кл. слово return, тип возвращаемых данных должен совпадать с типом,
    //указанным при объявлении метода
    //
    //имяПеременной.метод(); - вызов метода
    //
    public static void main(String[] args) {
        Box box1 = new Box(5, 5, 5);
        Box box2 = new Box(6, 6, 6);

        box1.lenght = 5;
        box1.height = 5;
        box1.width = 5;

        box2.lenght = 10;
        box2.height = 10;
        box2.width = 10;

//        box1.showVolume();
//        box2.showVolume();

        double volume1 = box1.volume();
        double volume2 = box2.volume();

        System.out.println(volume1);
        System.out.println(volume2);

        Box box3 = new Box(10);
        Box box4 = new Box(15, 20, 25);
        box3.showVolume();
        box4.showVolume();
        Box box5 = new Box();
    }
}
