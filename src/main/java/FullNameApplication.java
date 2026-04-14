import java.util.Scanner;


public class FullNameApplication {
    public static void main(String[] args) {
//add scanner
        Scanner scanner = new Scanner(System.in);
// ask for name in separate parts
        System.out.println(" Please enter your name ");
        System.out.println("First Name:");
        // printed 2 lines at once to get them out the way
        String firstName = scanner.nextLine().trim();

        System.out.println("Middle Name (If Applicable):");
        String middleName = scanner.nextLine().trim();
// added if applicable so user knows they can skip

        System.out.println("Last Name:");
        String lastName = scanner.nextLine().trim();

        System.out.println("Suffix (If Applicable):");
        String suffix = scanner.nextLine().trim();

        String fullName = firstName + " " + lastName;

        // creating an if statement to tell the program to ignore middle name if its empty
        if (!middleName.equals("")) {
            fullName = firstName + " " + middleName + " " + lastName;
        }

// made an if statement to say what to do if there is/isnt a suffix
        if (!suffix.equals(" ")) {
            fullName = fullName + "," + suffix;
        }

        System.out.println("Full Name: "+ fullName);








    }
}
