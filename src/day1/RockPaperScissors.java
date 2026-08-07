import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int totalRounds = 5;

        int rock = 1;
        int paper = 2;
        int scissors = 3;

        int playerWins = 0;
        int machineWins = 0;
        int draws = 0;

        System.out.println("Rock Paper Scissors Game");

        for (int i = 0; i < totalRounds; i++) {
            System.out.println("\nRound " + (i + 1));
            System.out.print("Enter move (1 for Rock, 2 for Paper, 3 for Scissors): ");
            int playerTurn = scanner.nextInt();

            int machineTurn = random.nextInt(3) + 1;

            System.out.print("You played: ");
            switch (playerTurn) {
                case 1:
                    System.out.println("Rock");
                    break;
                case 2:
                    System.out.println("Paper");
                    break;
                case 3:
                    System.out.println("Scissors");
                    break;
                default:
                    System.out.println("Invalid move");
                    break;
            }

            System.out.print("Machine played: ");
            switch (machineTurn) {
                case 1:
                    System.out.println("Rock");
                    break;
                case 2:
                    System.out.println("Paper");
                    break;
                case 3:
                    System.out.println("Scissors");
                    break;
            }

            if (playerTurn == machineTurn) {
                System.out.println("Result: Draw");
                draws++;
            } else if (playerTurn == rock && machineTurn == scissors) {
                System.out.println("Result: You Win!");
                playerWins++;
            } else if (playerTurn == paper && machineTurn == rock) {
                System.out.println("Result: You Win!");
                playerWins++;
            } else if (playerTurn == scissors && machineTurn == paper) {
                System.out.println("Result: You Win!");
                playerWins++;
            } else if (machineTurn == rock && playerTurn == scissors) {
                System.out.println("Result: Machine Wins!");
                machineWins++;
            } else if (machineTurn == paper && playerTurn == rock) {
                System.out.println("Result: Machine Wins!");
                machineWins++;
            } else if (machineTurn == scissors && playerTurn == paper) {
                System.out.println("Result: Machine Wins!");
                machineWins++;
            }
        }

        double winPercentage = ((double) playerWins / totalRounds) * 100;

        System.out.println("\n--- Final Results ---");
        System.out.println("Wins: " + playerWins);
        System.out.println("Losses: " + machineWins);
        System.out.println("Draws: " + draws);
        System.out.println("Win Percentage: " + winPercentage + "%");

        scanner.close();
    }
}