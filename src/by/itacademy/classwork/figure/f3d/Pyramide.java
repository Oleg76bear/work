package by.itacademy.door.ClassWork.figure.f3d;

import by.itacademy.door.ClassWork.figure.Corner;

public class Pyramide extends Figure3d implements Ribred, Corner {
   private  final  int countOfCorner = 4;
    private final int countOfRib = 6;

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

    @Override
    protected double calculateScuare() {
        if (v == 0 ){
            v = a + b + c + h; //TODO исправить
        }
        return v;
    }

    @Override
    public int getCountOfRib() {
        return countOfRib;
    }

    @Override
    public int countOfCorner() {
        return countOfCorner;
    }
}
