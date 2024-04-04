public class TriviaKüsimus extends Küsimus {
    private String küsimus; // Trivia küsimus

    // TriviaKüsimus konstruktor
    public TriviaKüsimus(String küsimus, String vastus) {
        this.küsimus = küsimus;
        this.vastus = vastus;
    }

    // Kontrollib, kas sisestatud vastus on õige
    public boolean kontrolliVastust(String sisestatudVastus){
        return sisestatudVastus.equalsIgnoreCase(this.vastus);
    }

    // Tagastab õige vastuse
    public String getÕigeVastus(){
        return this.vastus;
    }

    // Küsib küsimuse
    public String küsiKüsimus(){
        return küsimus;
    }
}
