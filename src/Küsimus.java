// Küsimus on abstraktne klass, millest tuletatakse trivia ja matemaatika küsimused
public abstract class Küsimus {
    protected String vastus;
    public abstract boolean kontrolliVastust(String sisestatudVastus);

    public abstract String getÕigeVastus();

    public abstract String küsiKüsimus();
}