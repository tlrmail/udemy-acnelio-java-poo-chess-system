package application;

import java.util.Scanner;

import boardgame.exceptions.BoardException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Sistema {

	private static final String ChessPosition  = null;

	public static void main(String[] args)  {

		Scanner sc = new Scanner(System.in);
		try {
			ChessMatch chessMatch = new ChessMatch();
			while(true) {
				UI.printBoard(chessMatch.getPieces());
				System.out.println();
				System.out.print("Source: ");
				ChessPosition source = UI.readChessPosition(sc);

				System.out.println();
				System.out.print("Target: ");
				ChessPosition target = UI.readChessPosition(sc);
				
				ChessPiece capturedPiece = chessMatch.performChessMove(source, target);

			}
		} catch (BoardException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}finally {
			sc.close();
		}

	}
}
