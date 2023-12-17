package Assignments.TemplateMethod;

public class TicTacToe extends Game {

    private char[] board;
    private char currentPlayer;

    void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = '-';
        }
        currentPlayer = 'X';
    }

    void makePlay(int player) {
        board[player] = currentPlayer;
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    boolean endOfGame() {
        // Check for a winning line - diagonals first
        if ((board[0] == board[4] && board[0] == board[8] && (board[0] == 'X' || board[0] == 'O')) ||
                (board[2] == board[4] && board[2] == board[6] && (board[2] == 'X' || board[2] == 'O'))) {
            return false;
        }

        for (int i = 0; i <= 6; i += 3) {
            if ((board[i] == board[i + 1] && board[i] == board[i + 2] && (board[i] == 'X' || board[i] == 'O')) ||
                    (board[i / 3] == board[i / 3 + 3] && board[i / 3] == board[i / 3 + 6] && (board[i / 3] == 'X' || board[i / 3] == 'O'))) {
                return false;
            }
        }
        return false;
    }

    void printWinner() {
        if (currentPlayer == 'X') {
            System.out.println("O is the winner!");
        } else {
            System.out.println("X is the winner!");
        }
    }
}
