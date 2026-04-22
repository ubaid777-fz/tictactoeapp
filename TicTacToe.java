import java.util.Scanner;

public class TicTacToe {

    // Method to convert slot to row and column
    public static int[] convertSlotToPosition(int slot) {
        int row = (slot - 1) / 3;
        int col = (slot - 1) % 3;
        return new int[]{row, col};
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter slot (1-9): ");
        int slot = scanner.nextInt();

        int[] position = convertSlotToPosition(slot);

        System.out.println("Row: " + position[0]);
        System.out.println("Column: " + position[1]);
    }
}