package Games;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsBySimeon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] choices = {"Rock","Paper","Scissors"};
        Random random = new Random();
        int randomIndex = random.nextInt(choices.length);
        String randomChoice = choices[randomIndex];
        System.out.print("Choose [r]ock, [p]paper, [s]scissors: ");
        String playerInput = scanner.nextLine();

        if (playerInput.equals("r") || playerInput.equals("rock")){
            playerInput = "Rock";
        } else if (playerInput.equals("p") || playerInput.equals("paper")) {
            playerInput = "Paper";
        } else if (playerInput.equals("s") || playerInput.equals("scissors")) {
            playerInput = "Scissors";
        } else  {
            System.out.println("Invalid Input. Try Again");
            return;
        }
        System.out.println(randomChoice);

        if(playerInput.equals("Rock") && randomChoice.equals("Scissors") || playerInput.equals("Paper") && randomChoice.equals("Rock") || playerInput.equals("Scissors") && randomChoice.equals("Paper")){
            System.out.println("You win.");
        } else if (playerInput.equals("Rock") && randomChoice.equals("Paper") || playerInput.equals("Paper") && randomChoice.equals("Scissors") || playerInput.equals("Scissors") && randomChoice.equals("Rock")) {
            System.out.println("You lose.");
        } else  {
            System.out.println("This game was a draw");
        }
    }
}
