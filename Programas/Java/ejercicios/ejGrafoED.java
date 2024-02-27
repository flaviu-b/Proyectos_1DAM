package ejercicios;

public class ejGrafoED {
    public static void main(String[] args) {
        
    }
    
    boolean isValidMove( ChessPosition p, ChessMove move )
	{
		if ( bThinking )
			return false;

		boolean player = (p.board[move.from] < 0) ? BLACK : WHITE;

		boolean bOK = false;

		// is it en-passant?
		if ( p.enPassantSquare > 0 &&
			 p.board[ move.from ] == (player?ChessPosition.PAWN:-ChessPosition.PAWN) )
		{
			int offset = move.to - move.from;
			if ( offset < 0 )
				offset = -offset;
			if ( offset == 11 || offset == 9 )
			{
				if ( p.board[ move.from - 1 ] == (player?-ChessPosition.PAWN:ChessPosition.PAWN) ||
					 p.board[ move.from + 1 ] == (player?-ChessPosition.PAWN:ChessPosition.PAWN) )
				{
					bOK = true;
				}
			}
		}
	/*		if ( p.board[ move.to
			 p.board[ move.to ] == 0 &&
			 p.board[ )
		{
			if ( p.board[ move.to ] == 0 &&
			if ( p.board[ move.from ] == player ? PAWN : -PAWN )
			{
						// En-passant for black
						if ( piece < 0 && (b[move_offset-1] == 1) && move_offset >= 30 && move_offset < 40 )
						{
							piece_moves[count++] = move_offset;
						} else
						// En-passant for white
						if ( move_offset >= 40 && move_offset < 48 ) // fifth row
						{
						}
			}*/

		int nMoves = calcPieceMoves( p, move.from );

		for ( int i = 0; i < nMoves && !bOK ; i++ )
		{
			if ( move.to == piece_moves[i] )
			{
				bOK = true;
			}
		}
		if ( !bOK )
			return false;

		ChessPosition np = new ChessPosition( p );
		np.makeMove( move );

		calcPossibleMoves(np,!player);

		if ( player ? np.bWhiteChecked : np.bBlackChecked )
		{
			return false;
		}
		return true;
	}
}
