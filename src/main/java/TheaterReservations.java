import java.util.Scanner;


public class TheaterReservations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter Your Name: First name,Last Name");
        String name = scanner.nextLine();

        String[] fullName = name.split(" ");
        System.out.println("What day is your show? dd/mm/yyyy");

        String day = scanner.nextLine();
        System.out.println("How many tickets would you like?");
        int tickets = scanner.nextInt();

        System.out.println( tickets+ " tickets reserved under " + fullName[1] +","+ fullName[0] + " on " +day);

        System.out.println();





    }
}
