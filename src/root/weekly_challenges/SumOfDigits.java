package root.weekly_challenges;

//Given an alphanumeric string made up of digits and lower case Latin characters only,
//find the sum of all the digit characters in the string.

//Input
//The first line of the input contains an integer T denoting the number of test cases. 
//Then T test cases follow.
//Each test case is described with a single line containing a string S, the alphanumeric string.

//Output
//For each test case, output a single line containing the sum of all the digit characters in that string.

//Example
//Input:
//1
//ab1231da
//Output:
//7
//
//Explanation
//The digits in this string are 1, 2, 3 and 1. Hence, the sum of all of them is 7

public class SumOfDigits {
	
	public static int getSumOfDigits(String str) {
		
		int sum = 0;
		
		for(int i = 0; i < str.length(); i++) {
			if(Character.isDigit(str.charAt(i))) {				
				sum += Integer.parseInt(String.valueOf(str.charAt(i)));
			}
		}
		
		
		return sum;
	}

}


//EXAMPLES TEST DATA
//
//System.out.println(SumOfDigits.getSumOfDigits("ab1231da"));