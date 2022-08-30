package root.weekly_challenges;

public class ChessPiece {
	
	public static boolean canMove(String piece, String start, String end) {
//		Get Alpha position (X)
		char startX = start.charAt(0);	
		char endX = end.charAt(0);
		
//		Get Numeric Position (Y)
		int startY = Integer.parseInt(String.valueOf(start.charAt(1)));
		int endY = Integer.parseInt(String.valueOf(end.charAt(1)));
		
		boolean isTrue = false;
		
		if(endX <= 0 || endY <= 0) {
			return isTrue;
		}
		
		switch(piece) {
			case "Pawn":
				if(endX == startX) {
					isTrue = changeXY(startY, endY, 2);
				}
				break;
				
			case "Knight":
				if((startX + (endX - startX)) == (startX + 2) || (startX + (endX - startX)) == (startX - 2)) {
					isTrue = changeXY(startY, endY, 1);					
				} else if((startY + (endY - startY)) == (startY + 2) || (startY + (endY - startY)) == (startY - 2)) {	
					isTrue = changeXY((startX + 0), (endX + 0), 1);
				}				
				break;
				
			case "Bishop":				
				isTrue = checkBishop((endX - startX), (endY - startY));				
				break;
				
			case "Rook":				
				isTrue = checkRook(startX, endX, startY, endY);				
				break;
				
			case "Queen":
				if(checkBishop((endX - startX), (endY - startY))){
					isTrue = true;
				}else if(checkRook(startX, endX, startY, endY)){
					isTrue = true;
				}
				break;
				
			case "King":
				if(checkBishop((endX - startX), (endY - startY))){
					isTrue = changeXY(startY, endY, 1);
				}else if(checkRook(startX, endX, startY, endY)){
					if(startX == endX) {
						isTrue = changeXY(startY, endY, 1);
					}else {
						isTrue = changeXY(startX, endX, 1);						
					}
				}
				break;
		}		
		return isTrue;
	}
	
	
	private static boolean changeXY(int start, int end, int maxMoves) {		
		int moveNum = (end - start);		
		if(moveNum < 0) {
			moveNum = (moveNum - (moveNum + moveNum));
		}		
		if(moveNum > maxMoves || moveNum == 0) {
			return false;
		} else {
			return true;			
		}
	}	
	
	public static boolean checkRook(char startX, char endX, int startY, int endY) {
		if(startX == endX && startY != endY) {
			return true;
		} else if(startY == endY && startX != endX) {
			return true;
		}
		return false;
	}
	
	private static boolean checkBishop(int moveX, int moveY) {
		if(moveX < 0) {
			moveX = (moveX - (moveX + moveX));
		}
		if(moveY < 0) {
			moveY = (moveY - (moveY + moveY));
		}			
		if(moveX == moveY) {
			return true;
		}		
		return false;
	}
	
	
//	FOR TESTING PURPOSES---
	
//	CanMove Challenge 8-24-22		
//	PAWN
//	System.out.println(ChessPiece.canMove("Pawn", "A1", "A1"));
//	System.out.println(ChessPiece.canMove("Pawn", "A1", "A2"));
//	System.out.println(ChessPiece.canMove("Pawn", "A1", "A3"));
//	System.out.println(ChessPiece.canMove("Pawn", "A1", "A4"));
	
//	KNIGHT
//	System.out.println(ChessPiece.canMove("Knight", "D3", "C1"));
//	System.out.println(ChessPiece.canMove("Knight", "D3", "C5"));
//	System.out.println(ChessPiece.canMove("Knight", "D3", "C2"));
//	System.out.println(ChessPiece.canMove("Knight", "D3", "F2"));
//	System.out.println(ChessPiece.canMove("Knight", "D3", "F1"));
	
//	BISHOP
//	System.out.println(ChessPiece.canMove("Bishop", "D3", "G0"));
//	System.out.println(ChessPiece.canMove("Bishop", "D3", "G6"));
//	System.out.println(ChessPiece.canMove("Bishop", "D3", "B5"));
//	System.out.println(ChessPiece.canMove("Bishop", "D3", "B2"));
	
//	ROOKS
//	System.out.println(ChessPiece.canMove("Rook", "D3", "D6"));
//	System.out.println(ChessPiece.canMove("Rook", "D3", "G3"));
//	System.out.println(ChessPiece.canMove("Rook", "D3", "G4"));
//	System.out.println(ChessPiece.canMove("Rook", "D3", "D3"));
	
//	QUEEN
//	System.out.println(ChessPiece.canMove("Queen", "D3", "D6"));
//	System.out.println(ChessPiece.canMove("Queen", "D3", "E6"));
//	System.out.println(ChessPiece.canMove("Queen", "D3", "G6"));
//	System.out.println(ChessPiece.canMove("Queen", "D3", "G7"));
	
//	KING
//	System.out.println(ChessPiece.canMove("King", "D3", "C3"));
//	System.out.println(ChessPiece.canMove("King", "D3", "E4"));
//	System.out.println(ChessPiece.canMove("King", "D3", "B6"));
	
//	Examples
//	System.out.println(ChessPiece.canMove("Rook", "A8", "H8"));
//	System.out.println(ChessPiece.canMove("Bishop", "A7", "G1"));
//	System.out.println(ChessPiece.canMove("Queen", "C4", "D6"));

}
