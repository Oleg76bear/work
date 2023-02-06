// Задача 2:
//Задача с классом Box(x,y,z)
//Необходимо добавить в класс возможность определить какого типа коробка у нас создана.
//1) Куб (Все стороны равны).
//2) Обычная коробка.
//3) Конверт (Есть только длинна и ширина).
package HomeTest;

public class Work2_W2 {

    static class Box extends Throwable {
        double width;
        double height;
        double depth;

        public Box(double w, double h) {
            width = w;
            height = h;
        }

        public Box(double w, double h, double d) {
            this.width = w;
            this.height = h;
            this.depth = d;
        }

        // конструктор, используемый, когда ни один из размеров не указан
        public Box() {
            width = -1; // значение -1 используется для указания
            height = -1; // неинициализированного
            depth = -1; // параллелепипеда
        }

        // конструктор, используемый при создании куба
        Box(double len) {
            width = height = depth = len;
        }

        public void print() {
            System.out.println(width + " " + height + " " + depth);
        }
    }


    public void main(String[] args) throws Box {
        Box envelope = new Box(12, 4);
        Box zerobox = new Box();
        Box mybox = new Box(12, 34, 43);
        Box mycube = new Box(7);

      //  if (this.depth == 0) {
            System.out.println("envelope" + envelope);
        }
    }



