import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
     public static void numberGuessGame()
     {
         Random random = new Random();
         int random_number = random.nextInt(100);
         int K=5;
         boolean correct = false;

         Scanner sc = new Scanner(System.in);
         System.out.println("Guess the number between 1 to 100 , You have 5 turns!");

         while(K>0)
         {
             System.out.println("Guess the Number: ");
             int guess_user = sc.nextInt();

         if(random_number==guess_user)
         {
             System.out.println("Congrates!  You guess the right number");

             break;
         }
         else if(random_number>guess_user)
         {
             System.out.println("The number is greater than " + guess_user + " you have "+ (K-1) + " tries left");
             K--;



         }
         else if (random_number< guess_user)
         {
             System.out.println("The number is less than " + guess_user + " you have "+ (K-1) + " tries left");
             K--;

         }


     }
         if(correct == false)
         {
             System.out.println("Oops! Game over");
             System.out.println("You have executed "+ (K-1)+ " trails. Try again!");
             System.out.println("The number was "+ random_number);
         }

     }
    public static void main(String[] args)
    {
    numberGuessGame();
    }
}
