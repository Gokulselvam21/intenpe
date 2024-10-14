import java.util.*;
import java.util.Random;

public class Main{
    public static void main(String[]args){
        Scanner reader = new Scanner(System.in);
        System.out.println(" if you want to Start a game , Enter Yes : ");
        String plays = reader.nextLine();
        
        while(plays.equals("Yes")){
            Random rand = new Random();
            int randNum = rand.nextInt(100);
            int guess=-1;
            int tries =0 ;
            
            while(guess!= randNum){
                System.out.print("Guess a number betwen 1 and 100 : ");
                guess = reader.nextInt();
                tries++;
                
                if(guess==randNum){
                    System.out.println("Awesome! You guessed the number!");
                    System.out.println("It only took you " + tries +" guesses !");
                    System.out.print("Would you like to play again? Yes or No: ");
                    plays = reader.next().toLowerCase();
                }
                else if(guess>randNum){
                    System.out.println("Your guess is too high,try again.");
                }
                else{
                    System.out.println("Your guess is too low ,try again");
                }
            }
        }
        
    }
}
