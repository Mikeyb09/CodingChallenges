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

}
