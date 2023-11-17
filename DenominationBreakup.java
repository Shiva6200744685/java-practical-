import java.util.Scanner;

public class DenominationBreakup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount (up to 5 digits): ");
        int amount = scanner.nextInt();

        if (amount < 1 || amount > 99999) {
            System.out.println("Invalid input. Please enter an amount between 1 and 99999.");
        } else {
            calculateDenominations(amount);
        }
    }

    public static void calculateDenominations(int amount) {
        int[] denominations = {1000, 500, 100, 50, 20, 10, 5, 2, 1};
        int[] count = new int[denominations.length];

        System.out.println("Denomination Breakdown:");

        for (int i = 0; i < denominations.length; i++) {
            if (amount >= denominations[i]) {
                count[i] = amount / denominations[i];
                amount = amount % denominations[i];
                System.out.println(denominations[i] + " Rupees notes: " + count[i]);
            }
        }

        int totalNotes = 0;
        for (int i : count) {
            totalNotes += i;
        }

        System.out.println("Total number of notes: " + totalNotes);
    }
}
