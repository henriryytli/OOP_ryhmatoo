import java.util.Random;
import java.util.Scanner;

class Question {
    private int num1;
    private int num2;
    private int correctAnswer;
    private String operator;

    public Question() {
        Random rand = new Random();
        this.num1 = rand.nextInt(10) + 1; // vahemikus 1-10
        this.num2 = rand.nextInt(10) + 1; // vahemikus 1-10

        switch(rand.nextInt(4)) {
            case 0:
                this.operator = "+";
                this.correctAnswer = this.num1 + this.num2;
                break;
            case 1:
                this.operator = "-";
                this.correctAnswer = this.num1 - this.num2;
                break;
            case 2:
                this.operator = "*";
                this.correctAnswer = this.num1 * this.num2;
                break;
            case 3:
                this.operator = "/";
                this.correctAnswer = this.num1 / this.num2;
                break;
        }
    }

    public boolean checkAnswer(int userAnswer) {
        return userAnswer == this.correctAnswer;
    }

    public String getQuestion() {
        return "Mis on " + this.num1 + " " + this.operator + " " + this.num2 + "?";
    }

    public int getCorrectAnswer() {
        return this.correctAnswer;
    }
}

class Scoreboard {
    private int score;
    private int highScore;

    public Scoreboard() {
        this.score = 0;
        this.highScore = 0;
    }

    public void incrementScore() {
        this.score++;
        if(this.score > this.highScore) {
            this.highScore = this.score;
            System.out.println("Uus kõrgeim skoor: " + this.highScore);
        }
    }

    public void resetScore() {
        this.score = 0;
    }

    public int getScore() {
        return this.score;
    }

    public int getHighScore() {
        return this.highScore;
    }
}

public class MathGame {
    public static void main(String[] args) {
        Scoreboard scoreboard = new Scoreboard();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            Question question = new Question();
            System.out.println(question.getQuestion());
            int userAnswer = scanner.nextInt();

            if(question.checkAnswer(userAnswer)) {
                System.out.println("Õige vastus!");
                scoreboard.incrementScore();
            } else {
                System.out.println("Vale vastus. Õige vastus oli " + question.getCorrectAnswer() + ".");
                System.out.println("Sinu skoor on " + scoreboard.getScore() + " ja sinu kõrgeim skoor on " + scoreboard.getHighScore() + ".");
                scoreboard.resetScore();

                System.out.println("Kas soovid jätkata? (jah/ei)");
                String continueGame = scanner.next();
                if(continueGame.equalsIgnoreCase("ei")) {
                    System.out.println("Mäng lõpetatud. Aitäh mängimast!");
                    break;
                }
            }
        }

        scanner.close();
    }
}
