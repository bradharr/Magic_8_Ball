import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        String[] eightBallArray = {"It is certain", "It is decidedly so", "Without a doubt", "Yes definitely",
        "You may rely on it", "As I see it, yes", "Most likely", "Outlook good", "Yes", "Signs point to yes",
        "Ask again later", "Better not tell you now", "Cannot predict now", "Concentrate and ask again",
        "My reply is no", "My sources say no", "Outlook not so good", "Very doubtful", "Ask Google", "Ask Siri",
        "Ask Alexa"};

        Scanner myEightBall = new Scanner(System.in);
        System.out.println("Ask the Magic 8 Ball your question now!!!");
        String question = myEightBall.nextLine();
        int rand_int = rand.nextInt(eightBallArray.length - 1);

        System.out.println("Question asked: " + question);
        System.out.println("8 Ball Answer: " + eightBallArray[rand_int]);



    }
}