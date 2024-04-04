import java.util.Random;
public class Küsimus extends AbstraktneKüsimus{

    public Küsimus() {
        super();
        Random suvaline = new Random();
        switch (suvaline.nextInt(4)){
            case 0:
                this.tehteMärk = "+";
                õigeVastus = arv1 + arv2;
                break;
            case 1:
                tehteMärk = "-";
                õigeVastus = arv1 - arv2;
                break;
            case 2:
                tehteMärk = "*";
                õigeVastus = arv1 * arv2;
                break;
            case 3:
                tehteMärk = "/";
                arv1 = arv1*arv2; // et jaguks täpselt 2-ga
                õigeVastus = arv1 / arv2;
                break;
        }
    }
    public String küsiKüsimus(){
        return "Mis on "+arv1+" "+tehteMärk+" "+arv2+"?";
    }
}