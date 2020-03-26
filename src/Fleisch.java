public class Fleisch extends Zutat{

    private String land;
    private boolean koscher;

    public Fleisch(String name, float price, String land, boolean koscher) {
        super(name, price);
        this.land = land;
        this.koscher = koscher;
    }
}
