package application;

import boardgame.exceptions.BoardException;
import chess.ChessMatch;
import chess.exceptions.ChessException;

public class Sistema {

	public static void main(String[] args)  {

		try {
			ChessMatch chessMatch = new ChessMatch();
			UI.printBoard(chessMatch.getPieces());
		} catch (BoardException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (ChessException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}
}
