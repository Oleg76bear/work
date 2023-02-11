package by.itacademy.door.ClassWork.figure.f2d;

public class Circle extends Figure2d {
    private int r;

    public Circle(int r) {
        this.r = r;
    }

    protected double calculateScuare() {

        if (s == 0) {
            s = Math.PI * r * r;
        }
        return s;
    }
}