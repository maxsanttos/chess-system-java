package application;

import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Programa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();
        while(true){
            UI.printBoard(chessMatch.getPieces());
            System.out.println();
            System.out.print("Source:");
            ChessPosition source = UI.redChessPosition(sc);

            System.out.println();
            System.out.print("Target:");
            ChessPosition target = UI.redChessPosition(sc);

            ChessPiece capturChessPiece = chessMatch.performChessMove(source, target);

        }
    }
}
