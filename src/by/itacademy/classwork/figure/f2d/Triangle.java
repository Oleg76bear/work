package by.itacademy.door.ClassWork.figure.f2d;

public class Triangle extends Figure2d {
    private int x;
    private int y;
    private int z;

    public Triangle(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;

    }

    protected double calculateScuare() {

        if (s == 0) {
            s = x + y + z;
        }
        return s;
    }
}
