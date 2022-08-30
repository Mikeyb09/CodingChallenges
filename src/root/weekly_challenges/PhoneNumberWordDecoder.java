package root.weekly_challenges;

/*
	Phone Number Word Decoder - 8/29/22
	
	Create a program that converts a phone number with letters to one with only numbers.
	
	Number    Letter
	0    none
	1    none
	2    ABC
	3    DEF
	4    GHI
	5    JKL
	6    MNO
	7    PQRS
	8    TUV
	9    WXYZ
	
	Examples
	textToNum("123-647-EYES") ➞ "123-647-3937"	
	textToNum("(325)444-TEST") ➞ "(325)444-8378"	
	textToNum("653-TRY-THIS") ➞ "653-879-8447"	
	textToNum("435-224-7613") ➞ "435-224-7613"
	
	Notes:
	All inputs will be formatted as a string representing a proper phone number in 
	the format XXX-XXX-XXXX or (XXX)XXX-XXXX, using numbers and capital letters.
*/

public class PhoneNumberWordDecoder {
	
	public static String textToNum(String textNum) {
		
		String phoneNum = "";
		
		for(int i = 0; i < textNum.length(); i++) {
			phoneNum += convertText(textNum.charAt(i));
		}
		
		return phoneNum;
		
	}
	
	private static char convertText(char letter) {
		char number = letter;
		switch(letter) {		
			case 'A': case 'B': case 'C':
				number = '2';
				break;
			case 'D': case 'E': case 'F':
				number = '3';
				break;
			case 'G': case 'H': case 'I':
				number = '4';
				break;
			case 'J': case 'K': case 'L':
				number = '5';
				break;
			case 'M': case 'N': case 'O':
				number = '6';
				break;
			case 'P': case 'Q': case 'R': case 'S':
				number = '7';
				break;
			case 'T': case 'U': case 'V':
				number = '8';
				break;
			case 'W': case 'X': case 'Y': case 'Z':
				number = '9';
				break;			
		}
		return number;
	}

}




