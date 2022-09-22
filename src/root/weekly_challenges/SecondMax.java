package root.weekly_challenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Write a program that accepts sets of three numbers and prints the second-maximum number among the three.
//
//Input
//First line contains the number of triples, N.	
//The next N lines which follow each have three space separated integers.
//
//Output
//For each of the N triples, output one new line which contains the second-maximum integer among the three.
//Constraints	
//1 ≤ N ≤ 6
//1 ≤ every integer ≤ 10000
//The three integers in a single triplet are all distinct. That is, no two of them are equal.
//
//Sample Input
//3
//1 2 3
//10 15 5
//100 999 500
//Sample Output
//2
//10
//500

public class SecondMax {
	
	public static int getSecondMax(int num1, int num2, int num3) {
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(num1);
		numbers.add(num2);
		numbers.add(num3);
		
		Collections.sort(numbers);
		
		return numbers.get(1);
		
	}

}  


// FOR TESTING PURPOSES

//System.out.println(SecondMax.getSecondMax(3, 1, 2));
//System.out.println(SecondMax.getSecondMax(10, 15, 5));
//System.out.println(SecondMax.getSecondMax(100, 999, 500));
