import java.util.Scanner;

public class TheaterKiosk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Check if the user is 21 or older
        if (age >= 21) {
            System.out.println("You get a wrist band.");
        }

        scanner.close();
    }
}
