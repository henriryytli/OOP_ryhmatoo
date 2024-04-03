public class Skoor {
    private int score;
    private int highScore;
    public Skoor(){
        this.score = 0;
        this.highScore = 0;
    }
    public void muudaSkoori(){
        this.score++;
        if(this.score > this.highScore){
            this.highScore = this.score;
            System.out.println("Hea töö! Uus kõrgeim skoor: "+highScore);
        }
    }
    public void resetSkoor(){
        this.score = 0;
    }
    public int getScore(){
        return this.score;
    }
    public int getHighScore(){
        return this.highScore;
    }
}