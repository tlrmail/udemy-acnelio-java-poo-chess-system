package chess;

import boardgame.Position;
import chess.exceptions.ChessException;

public class ChessPosition {

	private char column;
	private int row;

	public ChessPosition(char column, int row) throws ChessException {
		if (column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new ChessException("Error instantiating ChessPosition. Valid values are from a1 to h8.");
		}

		this.column = column;
		this.row = row;
	}

	protected Position toPosition() {
		return new Position(8 - this.row, this.column - 'a');
	}
	
	protected static ChessPosition fromPosition(Position position) throws ChessException {
		return new ChessPosition((char)('a' - position.getColumn()), 8 - position.getRow() );
	}

	public char getColumn() {
		return column;
	}

	public int getRow() {
		return row;
	}

	@Override
	public String toString() {
		return "" + this.column + this.row;
	}
}
