import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

// MatemaatikaMäng klass haldab mängu
public class MatemaatikaMäng {
    private List<TriviaKüsimus> TriviaKüsimusedNimekiri; // Kõik trivia küsimused
    private List<TriviaKüsimus> triviaKüsimused; // Praegused ülejäänud trivia küsimused

    // MatemaatikaMäng konstruktor
    public MatemaatikaMäng() throws FileNotFoundException {
        // Lisame trivia küsimused
        TriviaKüsimusedNimekiri = new ArrayList<>();
        Scanner lugeja = new Scanner(new File("trivia.txt"), "UTF-8");
        while (lugeja.hasNextLine()){
            String rida = lugeja.nextLine();
            String[] osa = rida.split(";");
            String küsimus = osa[0];
            String vastus = osa[1];
            TriviaKüsimusedNimekiri.add(new TriviaKüsimus(küsimus, vastus));
        }
        triviaKüsimused = new ArrayList<>(TriviaKüsimusedNimekiri); // Koopia algsest listist
    }

    // Mängi meetod käivitab mängu
    public void mängi() {
        Skoor skoor = new Skoor();
        Scanner sc = new Scanner(System.in);

        while(true) {
            Küsimus küsimus;
            // Vali suvaliselt, kas küsida matemaatika küsimus või trivia küsimus
            if (new Random().nextInt(2) == 0 || triviaKüsimused.isEmpty()) {
                küsimus = new MatemaatikaKüsimus();
            } else {
                // Eemaldab triviaküsimuste listist, et uuesti küsimuseks ei tuleks
                int indeks = new Random().nextInt(triviaKüsimused.size());
                küsimus = triviaKüsimused.get(indeks);
                triviaKüsimused.remove(indeks);
            }
            System.out.println(küsimus.küsiKüsimus());
            String sisestatudVastus = sc.next();
            if(küsimus.kontrolliVastust(sisestatudVastus)) {
                System.out.println("Õige vastus!");
                skoor.muudaSkoori();
            } else {
                System.out.println("Vale vastus. Õige vastus oli " + küsimus.getÕigeVastus() + ".");
                System.out.println("Sinu skoor on " + skoor.getSkoor() + " ja sinu kõrgeim skoor on " + skoor.getKõrgeimSkoor() + ".");
                skoor.resetSkoor();

                System.out.println("Kas soovid jätkata? (jah/ei)");
                String kasJätkata = sc.next();
                if(kasJätkata.equalsIgnoreCase("ei")) {
                    System.out.println("Mäng lõpetatud. Aitäh mängimast!");
                    break;
                }
                else {
                    triviaKüsimused = new ArrayList<>(TriviaKüsimusedNimekiri);
                }
            }
        }

        sc.close();
    }

    // Main meetod käivitab mängu
    public static void main(String[] args) throws FileNotFoundException {
        MatemaatikaMäng mäng = new MatemaatikaMäng();
        mäng.mängi();
    }
}
