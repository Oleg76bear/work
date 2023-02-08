package by.itacademy.task;

public class Adress {
    private String city;
    private String country;
    private String street;
    private String house;

    public Adress(String city, String country, String street, String house) {
        this.city = city;
        this.country = country;
        this.street = street;
        this.house = house;

    }

    public void print() {
        System.out.println(city + " " + country + " " + street + " " + house);
    }

    public static void main(String[] args) {
        Adress oleg = new Adress("Minsk", "Rusland", "Plehanova", "23 K");
        Adress zina = new Adress("Vilnus", "Litvin", "Piles", "33 ");
        Adress vitia = new Adress("Moskow", "Rusland", "Nemiga", "14");


        oleg.print();
        zina.print();
        vitia.print();


    }

}