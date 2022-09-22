package root;

import root.weekly_challenges.SecondMax;
import root.weekly_challenges.SumOfDigits;

public class MainRoot {
	
	public static void main(String[] args) {
		
		System.out.println(SecondMax.getSecondMax(3, 1, 2));
		System.out.println(SecondMax.getSecondMax(10, 15, 5));
		System.out.println(SecondMax.getSecondMax(100, 999, 500));
		
		System.out.println(SumOfDigits.getSumOfDigits("ab1231da"));
		
		
	}

}
