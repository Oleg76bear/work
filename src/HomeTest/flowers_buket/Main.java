package HomeTest.flowers_buket;

import HomeTest.flowers_buket.enums.FlowerCategory;
import HomeTest.flowers_buket.enums.FlowerColor;

public class Main {
        public static void main(String[] args) {

            FlowerBuket flow1 = new FlowerBuket(36.5,1, FlowerCategory.TULIP, FlowerColor.RED);
            FlowerBuket flow2 = new FlowerBuket(20, 2, FlowerCategory.ASTRA, FlowerColor.YELLOW);
            FlowerBuket flow3 = new FlowerBuket(14,4, FlowerCategory.FIALKA, FlowerColor.WHITE);
            FlowerBuket flow4 = new FlowerBuket(44, 1, FlowerCategory.ROSE, FlowerColor.RED);
            FlowerBuket flow = new FlowerBuket();
            System.out.println("Стоимость букета составляет: " + FlowerBuket.total);
            System.out.println("Количество цветов в букете: " + FlowerBuket.roseCount);
            flow1.printSomething();
            flow2.printSomething();
            flow3.printSomething();
            flow4.printSomething();
            flow.sendMessage(Math.min(flow3.time, flow4.time, flow1.time);
            System.out.println();
        }
    }

