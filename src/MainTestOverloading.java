public class MainTestOverloading {
    public static void main(String[] args) {
        TestOverloading testOverloading = new TestOverloading();
        double result = testOverloading.multiple(5);
        System.out.println(result);

        int result2 = TestOverloading.multiple(5);  //Вызов статического метода без создания объекта
        System.out.println(result2);

        double sqrt = Math.sqrt(25); // Такой же вызов статического меода класса Math
        System.out.println(sqrt);
    }
}
