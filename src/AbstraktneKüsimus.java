import java.util.Random;

abstract class AbstraktneKüsimus {
    protected int arv1;
    protected int arv2;
    protected int õigeVastus;
    protected String tehteMärk;
    public boolean kontrolliVastust(int sisetatudVastus){
        return sisetatudVastus == this.õigeVastus;
    }
    public int getÕigeVastus(){
        return this.õigeVastus;
    }
    public AbstraktneKüsimus(){
        Random suvaline = new Random();
        this.arv1 = suvaline.nextInt(10)+1;
        this.arv2 = suvaline.nextInt(10)+1;
    }
}
