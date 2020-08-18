public class Box {
    double width;
    double height;
    double lenght;

    void showVolume() {
        double volume = width * height * lenght;
        System.out.println(volume);
    }

    double volume() {
        return width * height * lenght;
    }

    void setDimens(double width, double height, double lenght) {
        this.width = width;
        this.height = height;
        this.lenght = lenght;
    }

    //Конструктор:
    // ИмяКласса(список параметров) {
    //      тело конструктора;
    //      ...
    // }

    public Box(double width, double height, double lenght) {
        this.width = width;
        this.height = height;
        this.lenght = lenght;
    }

    Box(double size) {
        width = size;
        height = size;
        lenght = size;
    }

    Box() {
        width = 0;
        height = 0;
        lenght = 0;
    }
}
