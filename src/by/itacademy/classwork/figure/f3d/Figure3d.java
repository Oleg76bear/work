package by.itacademy.door.ClassWork.figure.f3d;

import by.itacademy.task.ClassWork.figure.Figure;

public abstract class Figure3d extends Figure {
    protected double v;

    public double getV() {
        return this.v;
    }
    protected abstract double calculateScuare();
}