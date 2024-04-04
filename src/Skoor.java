// Skoor klass hoiab mängija skoori
public class Skoor {
    private int skoor; // Mängija praegune skoor
    private int kõrgeimSkoor; // Mängija kõrgeim skoor

    // Skoor konstruktor
    public Skoor(){
        this.skoor = 0;
        this.kõrgeimSkoor = 0;
    }

    // Muudab mängija skoori
    public void muudaSkoori(){
        this.skoor++;
        if(this.skoor > this.kõrgeimSkoor){
            this.kõrgeimSkoor = this.skoor;
            System.out.println("Hea töö! Uus kõrgeim skoor: "+ kõrgeimSkoor);
        }
        else {
            System.out.println("Sinu skoor on " + this.skoor);
        }
    }

    // Nullib mängija skoori
    public void resetSkoor(){
        this.skoor = 0;
    }

    // Tagastab mängija praeguse skoori
    public int getSkoor(){
        return this.skoor;
    }

    // Tagastab mängija kõrgeima skoori
    public int getKõrgeimSkoor(){
        return this.kõrgeimSkoor;
    }
}
