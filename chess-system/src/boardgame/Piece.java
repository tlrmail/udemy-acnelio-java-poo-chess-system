package boardgame;

public abstract class Piece {
	
	protected Position position;
	private Board board;

	public Piece(Board board) {
		this.board = board;
		this.position = null;
	}

	public abstract boolean[][] possibleMoves(); 
	
	public boolean possibleMove() {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	protected Board getBoard() {
		return board;
	}
	
	public boolean isThereAnyPossibleMove() {
		boolean mat[][] = possibleMoves();
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat.length; j++) {
				if(mat[i][j]) {
					return true;
				}
			}
		}
		return false;
		
	}
}
