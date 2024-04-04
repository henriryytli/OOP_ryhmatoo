// Küsimus on abstraktne klass, millest tuletatakse trivia ja matemaatika küsimused
public abstract class Küsimus {
    protected String vastus; // Vastus küsimusele

    // Kontrollib, kas sisestatud vastus on õige
    public abstract boolean kontrolliVastust(String sisestatudVastus);

    // Tagastab õige vastuse
    public abstract String getÕigeVastus();

    // Küsib küsimuse
    public abstract String küsiKüsimus();
}