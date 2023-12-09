import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] denominations = new int[4];
        int[] numberOfNotes = new int[4];
        int totalBalance = 0;

        for (int i = 0; i < 4; i++) {
            System.out.print("Enter the " + (i + 1) + " Denomination: ");
            denominations[i] = s.nextInt();

            System.out.print("Enter the " + (i + 1) + " Denomination number of notes: ");
            numberOfNotes[i] = s.nextInt();

            totalBalance += denominations[i] * numberOfNotes[i];
        }

        System.out.println("Total Available Balance in ATM: " + totalBalance);

    }
}
