package application;

import boardgame.Board;
import boardgame.Position;
import chess.ChessMatch;

public class Sistema {

	public static void main(String[] args) {

		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());
	
	}
}
