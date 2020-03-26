import java.util.ArrayList;

public class Brot extends Zutat{

    private boolean gluten;
    private boolean gesund;

    public Brot(String name, float price, boolean gluten, boolean gesund) {
       super(name, price);
       this.gluten = gluten;
       this.gesund = gesund;
    }

}
