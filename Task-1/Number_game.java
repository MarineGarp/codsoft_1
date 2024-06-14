import java.util.Random;
import java.util.Scanner;

public class Number_game {
    public void Generate()
    {
         int number,guess;
        boolean playAgain=true;
        int totalScore=0,rounds=0;
        Scanner res=new Scanner(System.in);
        Random in=new Random();
        while(playAgain)
        {
            number=in.nextInt(100)+1;
            int attempt=0,MaxAttempt=10;
            boolean correctGuess=false;
            System.out.println("Guess the random number between 1-100:\nYou have "+MaxAttempt+" times to try :");
            while(attempt<MaxAttempt && !correctGuess)
            {
                System.out.println("Enter your guess : ");
                guess=res.nextInt();
                attempt++;
                if(guess==number)
                {
                    System.out.println("Congratulations!, you guessed the correct number.");
                    correctGuess=true;
                }
                else if(guess<number)
                {
                System.out.println("Your guess is too low.");
                }
                else
                {
                    System.out.println("Your guess is too high.");
                }

                if(correctGuess)
                {
                    totalScore+=MaxAttempt-attempt+1;

                }
                else if(attempt==MaxAttempt)
                {
                    System.out.println("Sorry, You lose. You have used all your attempts. The correct number was "+number);
                }
            }rounds++;
            System.out.println("Your current score : "+totalScore);
            System.out.println("Do you want to play again?(yes/no)");
            res.nextLine();
            String respond=res.nextLine().toLowerCase();
            playAgain=respond.equals("yes");
        }
        System.out.println("Game over!");
        System.out.println("Total rounds played : "+rounds);
        System.out.println("Total score : "+totalScore);
        res.close();
    }
    public static void main(String args[])
    {
        Number_game obj=new Number_game();
        obj.Generate();
        
    }
}
        
