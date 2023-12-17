package Assignments.TemplateMethod;

public class Main {
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.initializeGame();
        game.makePlay(0);
        game.makePlay(1);
        game.makePlay(3);
        game.makePlay(4);
        game.makePlay(6);
        game.endOfGame();
        game.printWinner();
    }
}
