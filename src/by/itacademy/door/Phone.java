package by.itacademy.task;

class Phone {
    private String namber;
    private String model;
    private int weight;


    public Phone(String namber, String model, int weight) {
        this.namber = namber;
        this.model = model;
        this.weight = weight;
    }

    public void print() {
        System.out.println(namber + " " + model + " " + weight);
    }


    public static void main(String[] args) {
        Phone iPhone = new Phone("3454343", "14 Pro Max", 565);
        Phone samsung = new Phone("5655464", "S 22", 557);
        Phone nokia = new Phone("7688864", "Max", 547);

        iPhone.print();
        samsung.print();
        nokia.print();
    }
}