package root.weekly_challenges;

/*
 * 
 * We say a number is sparse if there are no adjacent ones in its binary representation. 
 * 
 * For example, 21 (10101) is sparse, but 22 (10110) is not. 
 * 
 * For a given input N, find the smallest sparse number greater than or equal to N.
 * 
 */

public class FindSparse {
	
	public static int findSmallestSparse(int num) {
		
		int smallestNum = num;
		
		while(!checkIsSparse(Integer.toBinaryString(smallestNum))) {
			smallestNum++;			
		};
		
		return smallestNum;
	}
	
	
	private static boolean checkIsSparse(String num) {
		
		for(int i = 0; i < num.length(); i++) {
			if(i == 0) {
				continue;
			}
			if(num.charAt(i) == num.charAt(i - 1)) {
				return false;
			}
		}
		
		return true;
	}

}
