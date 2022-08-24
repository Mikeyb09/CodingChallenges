package root.weekly_challenges;

public class PerfectNumber {
	
	
	public static int quadraticEquation(int num1, int num2, int num3){
		
		int x = 0;
		
		x = (-num2 + (squareRoot(((num2 * num2) - (4 * (num1 * num3))))));
		
		x = x / (num2 * num1);
		
		return x;
	}
	
	
	private static int squareRoot(int num) {
		int x;
		int sqrt = num / 2;
		
		do {
			x = sqrt;
			sqrt = (x + (num / x)) / 2;
		} while((x - sqrt) != 0);
		
		
		return sqrt;
	}
	
	

}
