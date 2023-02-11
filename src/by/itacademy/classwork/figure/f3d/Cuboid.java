package by.itacademy.door.ClassWork.figure.f3d;

import by.itacademy.door.ClassWork.figure.Corner;

public class Cuboid extends Figure3d implements Ribred, Corner {
  private final  int   countOfCorner = 8;

    private  final int countOfRib = 12;
    private int a;
    private int b;
    private int c;

    public Cuboid (int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    protected double calculateScuare() {
        if (v == 0) {
            v = a * b * c;
        }
        return 0;
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

