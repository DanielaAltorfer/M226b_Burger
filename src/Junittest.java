import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Junittest {
    @Test
    void isNumericTest(){
        //isNumeric testen (damit wird der Test der askForIngredient unnötig)
        assertTrue(Starter.isNumeric("1"));
        assertTrue(Starter.isNumeric("0"));
        assertTrue(Starter.isNumeric("-12"));
        assertTrue(Starter.isNumeric("1000"));
        assertTrue(Starter.isNumeric("982201"));

        assertFalse(Starter.isNumeric("aab"));
        assertFalse(Starter.isNumeric(" "));
    }
    @Test
    void takeOrderTest(){
        // Methode takeOrder testen
        Starter st = new Starter();
        st.sc = new Scanner("1\n4\n7\n10\n13\n");

        assertTrue(st.takeOrder()==(13));
    }
    @Test
    void mainTest(){
        // MainMethode testen
        Starter.sc = new Scanner("1\n4\n7\n10\n13\nja");

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        PrintStream old = System.out;
        System.setOut(ps);

        Starter.main(null);

        System.out.flush();
        System.setOut(old);
        System.out.println("Here: " + baos.toString());

        assertTrue(baos.toString().contains("13.0 Stutz."));
    }
}
