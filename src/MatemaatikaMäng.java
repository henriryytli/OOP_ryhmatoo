import java.util.Scanner;

public class MatemaatikaMäng {
    public void mängi() {
        Skoor skoor = new Skoor();
        Scanner sc = new Scanner(System.in);

        while(true) {
            Küsimus küsimus = new Küsimus();
            System.out.println(küsimus.küsiKüsimus());
            int sisestatudVastus = sc.nextInt();
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
            }
        }

        sc.close();
    }

    public static void main(String[] args) {
        MatemaatikaMäng mäng = new MatemaatikaMäng();
        mäng.mängi();
    }
}