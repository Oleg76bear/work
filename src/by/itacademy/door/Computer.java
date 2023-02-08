package by.itacademy.task;

public class Computer {
    String procesor;
    int ramSize;
    int hdd;
    int displayCountry;

    public Computer(String procesor, int ramSize, int hdd, int displayCountry) {
        this.procesor = procesor;
        this.ramSize = ramSize;
        this.hdd = hdd;
        this.displayCountry = displayCountry;

    }

    public void print() {
        System.out.println(procesor + " " + ramSize + " " + hdd + " " + displayCountry);
    }

    public static void main(String[] args) {

            Computer hp = new Computer("i7", 16, 4000, 21);
            Computer sony = new Computer("Amd", 4, 128, 15);
            Computer lg = new Computer("i5", 8, 256, 23);


            hp.print();
            sony.print();
            lg.print();

        }
    }
