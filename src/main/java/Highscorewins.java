import java.util.Scanner;

public class Highscorewins {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Please enter game score in format: Home team:Visitor team | Home score(0):Vis Score(0): ");
        String input = scanner.nextLine();
        String[] parts = input.split("\\|");

        String[] teams = parts[0].split(":");
        String[] scores = parts[1].split(":");

        int score1 = Integer.parseInt(scores[0]);
        int score2 = Integer.parseInt(scores[1]);

        if (score1 > score2){
        System.out.println("Winner: "+ teams[0]);}
        else {
            System.out.println("Winner: " + teams[1]);
        }








    }

}
