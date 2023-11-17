import java.util.Scanner;

public class EvilNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();

        if (isEvilNumber(number)) {
            System.out.println(number + " is an evil number.");
        } else {
            System.out.println(number + " is not an evil number.");
        }
    }

    public static boolean isEvilNumber(int number) {
        if (number < 0) {
            return false; // Negative numbers cannot be evil numbers
        }

        // Count the number of 1s in the binary representation
        int count = 0;
        while (number > 0) {
            if (number % 2 == 1) {
                count++;
            }
            number = number / 2;
        }

        // Check if the count of 1s is even
        return count % 2 == 0;
    }
}
