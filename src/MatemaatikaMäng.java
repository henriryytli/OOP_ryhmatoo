import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

// MatemaatikaMäng klass haldab mängu
public class MatemaatikaMäng {
    private List<TriviaKüsimus> algsedTriviaKüsimused; // Kõik trivia küsimused
    private List<TriviaKüsimus> triviaKüsimused; // Praegused ülejäänud trivia küsimused

    // MatemaatikaMäng konstruktor
    public MatemaatikaMäng() {
        // Lisame trivia küsimused
        algsedTriviaKüsimused = new ArrayList<>();
        algsedTriviaKüsimused.add(new TriviaKüsimus("Mis on Eesti pealinn?", "Tallinn"));
        algsedTriviaKüsimused.add(new TriviaKüsimus("Mis planeet on päikesesüsteemi suurim?", "Jupiter"));
        algsedTriviaKüsimused.add(new TriviaKüsimus("Mitu värvi on vikerkaarel?", "7"));
        algsedTriviaKüsimused.add(new TriviaKüsimus("Kas heli levib kiiremini õhus või vees?", "Vees"));
        algsedTriviaKüsimused.add(new TriviaKüsimus("Kas välk on kuumem kui päike?", "jah"));
        algsedTriviaKüsimused.add(new TriviaKüsimus("Mitu elementi on perioodilisustabelis?", "118"));
        algsedTriviaKüsimused.add(new TriviaKüsimus("Kust saavad taimed energiat?", "Päikeselt"));
        algsedTriviaKüsimused.add(new TriviaKüsimus("Mis planeet kaotas oma planeedistaatuse?", "Pluuto"));
        algsedTriviaKüsimused.add(new TriviaKüsimus("Millise bändi tunnuslugu on Dancing Queen?", "ABBA"));
        algsedTriviaKüsimused.add(new TriviaKüsimus("Kus asub maailma aktiivseim vulkaan?", "Hawaii"));
        algsedTriviaKüsimused.add(new TriviaKüsimus("Mis värv peegeldab valgust?", "Valge" ));
        algsedTriviaKüsimused.add(new TriviaKüsimus("Mis värv neelab valgust", "Must"));
        triviaKüsimused = new ArrayList<>(algsedTriviaKüsimused); // Koopia algsest listist
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
                    triviaKüsimused = new ArrayList<>(algsedTriviaKüsimused);
                }
            }
        }

        sc.close();
    }

    // Main meetod käivitab mängu
    public static void main(String[] args) {
        MatemaatikaMäng mäng = new MatemaatikaMäng();
        mäng.mängi();
    }
}
