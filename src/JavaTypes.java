public class JavaTypes {
    public static void main(String[] args) {
        byte  varByte  = 120 ; //type byte   1байт от -128 до 127
        short varShort = 9000; //type short  2байт от -32.768   до   32.767
        int   varInt   = 9000; //type int    4байт от -2.147.483.648   до   2.147.483.647
        long  varLong  = 9000; //type long   8байт от                  до   9.223.372.036.854.775.807

        //Работа с типами int long
        //задача: определить расстояние для света за days = .... ;
        int days = 1000;
        int speed = 300000;
        long seconds = days * 24 * 60 * 60;
        long distance  = speed * seconds; //здесь тип long подходит, итоговое значение вмещается
//        int  distance2 = speed * seconds; //здесь тип int НЕ подходит,
        System.out.println(distance); //верное итоговое значение: 25920000000000
        // в выражениях значение итоговой переменной приводится к самому большому типу использвумых переменных

        //Если заменить в переменной seconds2 тип на int, то:
        int days2 = 1000;
        int speed2 = 300000;
        int seconds2 = days2 * 24 * 60 * 60;
        int distance22  = speed2 * seconds2;
        System.out.println(distance22); //НЕверное итоговое значение: -127631360 с типом int

        long distance23 = speed2 * seconds2;
        System.out.println(distance23); //НЕверное итоговое значение: -127631360 с типом long
        //общий результат приводится к самому большому типу используемых переменных, т.к. переменные speed2;seconds2 - int
        //то и итоговая distance23 будет приведено к типу int - это называется автоматическое приведение типов,
        //т.к тип int занимает меньше места

        byte b = 10; //тоже самое происходит с типом byte,этот тип без проблем приводится к int, т.к. заниммает меньше места
        int  c = b;
        System.out.println(c);

        int  d = 15;
//        byte e = d; //тут возникает ошибка, поскольку автоматически нельзя переводить в меньший тип
        byte e = (byte) d; //тут можно вручную приводить типы от большего к меньшему


        byte a = 127;
        a += 1; //увеличить на 1
        System.out.println(a); // значение -128; т.к. в byte не может быть значение больше 127,
                               // то ей будет присвоено минимальное значение -128
        a += 1; //еще увеличить на 1
        System.out.println(a); // значение -127....


    }
}
