package by.itacademy.task.ClassWork.figure.f3d;

public class Pyramide extends Figure3d {
    private int a;
    private int b;
    private int c;
    private int h;

    public Pyramide(int a, int b, int c, int h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int getH() {
        return h;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void setH(int h) {
        this.h = h;
    }
}
