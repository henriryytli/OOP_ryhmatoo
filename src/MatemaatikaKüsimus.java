import java.util.Random;

// MatemaatikaKüsimus on tuletatud Küsimuse klassist
public class MatemaatikaKüsimus extends Küsimus {
    private int arv1;
    private int arv2;
    private String tehteMärk;

    public MatemaatikaKüsimus() {
        Random suvaline = new Random();
        this.arv1 = suvaline.nextInt(10)+1;
        this.arv2 = suvaline.nextInt(10)+1;
        switch (suvaline.nextInt(4)){
            // Valib suvaliselt tehte märgi
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
                arv1 = arv1*arv2; // et jaguks täpselt arv2-ga
                vastus = String.valueOf(arv1 / arv2);
                break;
        }
    }

    public boolean kontrolliVastust(String sisestatudVastus){
        return sisestatudVastus.equals(this.vastus);
    }

    public String getÕigeVastus(){
        return this.vastus;
    }

    public String küsiKüsimus(){
        return "Mis on "+arv1+" "+tehteMärk+" "+arv2+"?";
    }
}