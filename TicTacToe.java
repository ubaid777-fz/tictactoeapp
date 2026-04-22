import java.util.Random;

public class TicTacToe {

    public static void main(String[] args) {

        Random random = new Random();
        int toss = random.nextInt(2);

        char player1Symbol, player2Symbol;
        int currentPlayer;

        if (toss == 0) {
            currentPlayer = 1;
            player1Symbol = 'X';
            player2Symbol = 'O';
        } else {
            currentPlayer = 2;
            player2Symbol = 'X';
            player1Symbol = 'O';
        }

        System.out.println("Toss Result:");
        System.out.println("Player " + currentPlayer + " starts");
        System.out.println("Player 1: " + player1Symbol);
        System.out.println("Player 2: " + player2Symbol);
    }
}