package by.itacademy.door.ClassWork.figure.f3d;

import by.itacademy.door.ClassWork.figure.Corner;

public class Sphere extends Figure3d  implements Corner {
    private  final int countOfCorner = 3;
    private  int r;
    public Sphere (int r) {
        this.r = r;
    }

    @Override
    protected int calculateScuare() {
        if (v == 0) {
            v = 4 / 3 * (Math.pow(r,3));
        }
        return 0;
    }

    @Override
    public int countOfCorner() {
        return countOfCorner;
    }
}
