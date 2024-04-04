public class TriviaKüsimus extends Küsimus {
    private String küsimus;

    public TriviaKüsimus(String küsimus, String vastus) {
        this.küsimus = küsimus;
        this.vastus = vastus;
    }

    public boolean kontrolliVastust(String sisestatudVastus){
        return sisestatudVastus.equalsIgnoreCase(this.vastus);
    }

    public String getÕigeVastus(){
        return this.vastus;
    }

    public String küsiKüsimus(){
        return küsimus;
    }
}
