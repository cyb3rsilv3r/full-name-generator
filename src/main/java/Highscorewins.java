import java.util.Scanner;

public class Highscorewins {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Please enter game score in format: Home team:Visitor team | Home score(0):Vis Score(0): ");
        String input = scanner.nextLine();
        String[] parts = input.split("\\|");

        String[] teams = parts[0].split(":");
        String[] scores = parts[1].split(":");

        System.out.println(teams[0]);
        System.out.println(teams[1]);
        System.out.println(scores[0]);
        System.out.println(scores[1]);





    }

}
