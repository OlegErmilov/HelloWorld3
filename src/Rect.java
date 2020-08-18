public class Rect {
    double width;
    double lenght;

    void methRect(double width, double lenght) {
        this.width = width;
        this.lenght = lenght;
    }

    double perimRect() {
        return width * 2 + lenght * 2;
    }

    double squareRect() {
        return width * lenght;
    }
}
