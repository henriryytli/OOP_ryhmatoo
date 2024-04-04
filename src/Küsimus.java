import java.util.Random;
public class Küsimus {
        private int arv1;
        private int arv2;
        private int õigeVastus;
        private String tehteMärk;
        public boolean kontrolliVastust(int sisetatudVastus){
            return sisetatudVastus == this.õigeVastus;
        }
        public int getÕigeVastus(){
            return this.õigeVastus;
        }
    public Küsimus(){
            Random suvaline = new Random();
            this.arv1 = suvaline.nextInt(10)+1;
            this.arv2 = suvaline.nextInt(10)+1;
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