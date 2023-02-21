package shcool;

import java.util.ArrayList;
import java.util.List;


abstract class Flower {
    private String name;
    private double price;
    private int stemLength;
    private int freshness;

    public Flower(String name, double price, int stemLength, int freshness) {
        this.name = name;
        this.price = price;
        this.stemLength = stemLength;
        this.freshness = freshness;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStemLength() {
        return stemLength;
    }

    public int getFreshness() {
        return freshness;
    }

    public abstract String getColour();

    public abstract int getTimeToWilt();
}

class Rose extends Flower {
    private String colour;

    public Rose(String colour, double price, int stemLength, int freshness) {
        super("Rose", price, stemLength, freshness);
        this.colour = colour;
    }

    @Override
    public String getColour() {
        return colour;
    }

    @Override
    public int getTimeToWilt() {
        return 4;
    }
}

class Tulip extends Flower {
    private String colour;

    public Tulip(String colour, double price, int stemLength, int freshness) {
        super("Tulip", price, stemLength, freshness);
        this.colour = colour;
    }

    @Override
    public String getColour() {
        return colour;
    }

    @Override
    public int getTimeToWilt() {
        return 5;
    }
}

class Carnation extends Flower {
    private String colour;

    public Carnation(String colour, double price, int stemLength, int freshness) {
        super("Carnation", price, stemLength, freshness);
        this.colour = colour;
    }

    @Override
    public String getColour() {
        return colour;
    }

    @Override
    public int getTimeToWilt() {
        return 3;
    }
}

class Bouquet {
    private List<Flower> flowers = new ArrayList<>();

    public void addFlower(Flower flower) {
        flowers.add(flower);
    }
    public void removeFlower(Flower flower) {flowers.remove(flower); }
    public double getTotalPrice() {
        double totalPrice = 0.0;
        for (Flower flower : flowers) {
            totalPrice += flower.getPrice();
        }
        return totalPrice;
    }

    public List<String> getAllColours() {
        List<String> colours = new ArrayList<>();
        for (Flower flower : flowers) {
            String colour = flower.getColour();
            if (!colours.contains(colour)) {
                colours.add(colour);
            }
        }
        return colours;
    }

    public int getTimeToWilt() {
        int timeToWilt = Integer.MAX_VALUE;
        for (Flower flower : flowers) {
            int flowerTimeToWilt = flower.getTimeToWilt();
            if (flowerTimeToWilt < timeToWilt) {
                timeToWilt = flowerTimeToWilt;
            }
        }
        return timeToWilt;
    }
}

public class Cvetok {

    public static void main(String[] args) {
        Rose redRose = new Rose("red", 2.5, 30, 6);
        Tulip yellowTulip = new Tulip("yellow", 1.5, 20, 5);
        Carnation greenCarnation = new Carnation("green", 3.4,30,0);
        Carnation greenCarnation2 = new Carnation("green", 3.4,30,1);
        Rose redRose2 = new Rose("red", 2.5, 30, 2);
        Bouquet bouquet = new Bouquet();
        bouquet.addFlower(redRose);
        bouquet.addFlower(yellowTulip);
        bouquet.addFlower(greenCarnation);
        bouquet.addFlower(greenCarnation);
        System.out.println(bouquet.getTotalPrice());
        bouquet.removeFlower(redRose);

        bouquet.getTimeToWilt();
        bouquet.getAllColours();
        System.out.println(bouquet.getAllColours());
        System.out.println(bouquet.getTimeToWilt());


    }
}