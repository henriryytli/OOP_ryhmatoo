public class Skoor {
    private int skoor;
    private int kõrgeimSkoor;
    public Skoor(){
        this.skoor = 0;
        this.kõrgeimSkoor = 0;
    }
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
    public void resetSkoor(){
        this.skoor = 0;
    }
    public int getSkoor(){
        return this.skoor;
    }
    public int getKõrgeimSkoor(){
        return this.kõrgeimSkoor;
    }
}