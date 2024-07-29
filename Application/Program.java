package Application;

import boardgame.Board;
import chess.ChessMatch;

// Just to remember: When I finish the project,
// I'll comment like this in each situation,
// to study and remember all the codes

public class Program {
    public static void main(String[] args) {
        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
    }
}