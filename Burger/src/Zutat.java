import java.util.Scanner;

public abstract class Zutat {

    public Zutat(String name, float price) {
            this.name = name;
            this.price = price;
    }

    private String name;

    @Override
    public String toString() {
        return  name + " " + price +
                " Franken";
    }

    private float price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}

