package HomeTest.flowers_buket;

import HomeTest.flowers_buket.enums.FlowerCategory;
import HomeTest.flowers_buket.enums.FlowerColor;

class FlowerBuket {

    FlowerCategory flowerCategory;
    FlowerColor flowerColor;
    double price;
    int time;

    static double total;
    static double roseCount;

    public FlowerBuket(double price, int time, FlowerCategory flowerCategory, FlowerColor flowerColor) {
        this.price = price;
        this.time = time;
        this.flowerCategory = flowerCategory;
        this.flowerColor = flowerColor;
        total += price;
        roseCount++;
    }

    void printSomething() {
        System.out.println(flowerCategory + " " + flowerColor);

    }

    static void sendMessage(int... array) {
        for (int a : array) {
            System.out.print("Букет начнет вянуть через:  " + a + " час");
        }
    }

    public FlowerBuket() {
    }

}

