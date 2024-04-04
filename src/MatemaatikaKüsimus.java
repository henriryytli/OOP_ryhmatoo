import java.util.Random;

// MatemaatikaKüsimus on tuletatud Küsimus klassist
public class MatemaatikaKüsimus extends Küsimus {
    private int arv1; // Esimene arv matemaatika tehtes
    private int arv2; // Teine arv matemaatika tehtes
    private String tehteMärk; // Tehte märk matemaatika tehtes

    // MatemaatikaKüsimus konstruktor
    public MatemaatikaKüsimus() {
        Random suvaline = new Random();
        this.arv1 = suvaline.nextInt(10)+1;
        this.arv2 = suvaline.nextInt(10)+1;
        switch (suvaline.nextInt(4)){
            case 0:
                this.tehteMärk = "+";
                vastus = String.valueOf(arv1 + arv2);
                break;
            case 1:
                tehteMärk = "-";
                vastus = String.valueOf(arv1 - arv2);
                break;
            case 2:
                tehteMärk = "*";
                vastus = String.valueOf(arv1 * arv2);
                break;
            case 3:
                tehteMärk = "/";
                arv1 = arv1*arv2; // et jaguks täpselt 2-ga
                vastus = String.valueOf(arv1 / arv2);
                break;
        }
    }

    // Kontrollib, kas sisestatud vastus on õige
    public boolean kontrolliVastust(String sisestatudVastus){
        return sisestatudVastus.equals(this.vastus);
    }

    // Tagastab õige vastuse
    public String getÕigeVastus(){
        return this.vastus;
    }

    // Küsib küsimuse
    public String küsiKüsimus(){
        return "Mis on "+arv1+" "+tehteMärk+" "+arv2+"?";
    }
}