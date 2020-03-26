public class Sauce extends Zutat{

    private double fettgehalt;
    private double zuckerpro100;

    public Sauce(String name, float price, double fettgehalt, double zuckerpro100) {
        super(name, price);
        this.fettgehalt = fettgehalt;
        this.zuckerpro100 = zuckerpro100;
    }
}
