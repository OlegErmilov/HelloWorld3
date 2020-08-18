public class MainHuman {
    public static void main(String[] args) {
        Human Human1 = new Human();
        Human Human2 = new Human();
        Human Human3 = new Human();
        Human Human4 = new Human();
        Human Human5 = new Human();

        Human1.name = "Ivan";
        Human1.age = 30;
        Human1.weight = 78;

        Human2.name = "Fedor";
        Human2.age = 24;
        Human1.weight = 65;

        Human3.name = "Max";
        Human3.age = 45;
        Human3.weight = 100;

        Human4.name = "Roman";
        Human4.age = 41;
        Human4.weight = 90;

        Human5.name = "Maria";
        Human5.age = 21;
        Human5.weight = 55;

        double midAge = (Human1.age + Human2.age + Human3.age + Human4.age + Human5.age) / 5;
        System.out.println(midAge);
    }
}
