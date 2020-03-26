
import java.util.ArrayList;
import java.util.Scanner;

public class Starter {

        public static void main(String[] args) {
            String alsodenn = "nei";
            Starter sw = new Starter();

            while (alsodenn.equals("nei")) {

                sw.takeOrder();

                System.out.println("Lengt das oder möchtsch no eine? \n 'nei' für no eine, 'ja' für ga Esse.");
                alsodenn = sc.nextLine();
            }
            System.out.println(" E Guete !");

        }

        static Scanner sc = new Scanner(System.in);

        ArrayList<Zutat> zutaten = new ArrayList<>();

        public Starter() {
            zutaten.add(new Brot("Pizzabrot", 2.5f,true,false));
            zutaten.add(new Brot("Plain", 2.0f,true,false));
            zutaten.add(new Brot("Vollkorn", 1.5f,true,true));
            zutaten.add(new Fleisch("Rind", 5f,"Italie",true));
            zutaten.add(new Fleisch("Poulet", 4.5f,"Holland",true));
            zutaten.add(new Fleisch("Hackfleisch", 4f,"Schwiiz",false));
            zutaten.add(new Kaese("Cheddar", 0.5f,"England","Weichchäs"));
            zutaten.add(new Kaese("Emmentaler", 1f,"Schwiiz","Hertchäs"));
            zutaten.add(new Kaese("Raclette", 1f,"Schwiiz","Chuehmiuchchäs"));
            zutaten.add(new Gemuese("Salat", 0.7f,"Schwiiz"));
            zutaten.add(new Gemuese("Gürkli", 5f,"Schwiiz"));
            zutaten.add(new Gemuese("Coleslaw", 1f,"Schwiiz"));
            zutaten.add(new Sauce("Mayo", 0.5f,50.0,0.5));
            zutaten.add(new Sauce("Ketchup", 0.5f,2.0,5.0));
            zutaten.add(new Sauce("Curry", 0.5f,2.0,6.4));
        }

        public void takeOrder() {
            System.out.println("Welcome to MyBurger. ");
            float gesamtprice = 0;
            gesamtprice += askforIngredient("Wäu dis broot us:", Brot.class);
            gesamtprice += askforIngredient("Wäu dis fleisch us:", Fleisch.class);
            gesamtprice += askforIngredient("Wäu di chäs us:", Kaese.class);
            gesamtprice += askforIngredient("Wäu dis gmües us:", Gemuese.class);
            gesamtprice += askforIngredient("Wäu dis sösseli us:", Sauce.class);

            System.out.println("Grossartig! Di Burger chostet " +  gesamtprice + " Stutz. \n Enjoy!");
        }

        public static boolean isNumeric(String value) {
            try {
                int number = Integer.parseInt(value);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }

        public float askforIngredient( String display, Class<?> art){

            String auswahl;
            do {
                System.out.println(display);
                for (int i = 0; i < zutaten.size(); i++) {
                    if(art == zutaten.get(i).getClass()) {
                        System.out.println(i + " " + zutaten.get(i));
                    }
                }
                auswahl = sc.nextLine();
            } while (!isNumeric(auswahl));

            int auswahlint = Integer.parseInt(auswahl);
            return zutaten.get(auswahlint).getPrice();

        }
    }




