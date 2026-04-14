import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" What is your full name?");
        String fullName = scanner.nextLine().trim();
        String[] parts = fullName.split(" ");

        if (parts.length==3){
           String firstName= parts[0];
           String midName= parts[1];
           String lastName= parts[2];
            System.out.println("First Name: "+ firstName);
            System.out.println("Middle Name: " + midName);
            System.out.println("Last Name: "+ lastName);

        } else if (parts.length==2) {
            String firstName= parts[0];
            String lastName= parts[1];
            System.out.println("First Name: "+ firstName);
            System.out.println("Last Name: "+ lastName);
        }










    }

}
