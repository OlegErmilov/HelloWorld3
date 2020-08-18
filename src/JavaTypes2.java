public class JavaTypes2 {
    public static void main(String[] args) {
        float  var1; //4байта . небольшая точность
        double var2; //8байт  . бОльшая точность

        //задача: посчитать площадь круга
        double r = 10.8;
        double pi = 3.14;
        double s  = pi * r * r;
        System.out.println("Площадь круга равна " + s);

        float r2  = 10.8f;
        float pi2 = 3.14f;
        float s2  = pi2 * r2 * r2; //f указывать не надо, т.к. все переменные float
        System.out.println("Площадь круга равна " + s2);

        //задача:
        //Найти гипотенузу С прямоугольного треугольника по т. Пифагора с катетами a;b.
        double a = 10.6; //катет a
        double b = 15.3; //катет b
        double power = 0.5;
        double c = Math.pow((a * a + b * b),power);
        System.out.println("Гипотенуза: " + c);
    }
}
