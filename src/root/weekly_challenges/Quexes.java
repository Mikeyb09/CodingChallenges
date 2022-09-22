package root.weekly_challenges;

public class Quexes {
	
	public static char getTransformations(char[] quexes) {
		
//		create 2 array objects
		
		char[] oldArr = quexes;
		char[] newArr;
		char newQuexe;
		
//		get size of array
//		loop through size of array until array size = 1	
		
		while(oldArr.length > 1) {
			
			int index = 0;
			newArr = new char[oldArr.length - 1];
//			System.out.println(oldArr.length);
			
			for(int i = 0; i < newArr.length; i++) {
				System.out.println(i);
				System.out.println(index);
				if(index > oldArr.length) {
					break;
				} else if((index + 1) > oldArr.length) {
					newArr[i] = oldArr[index];
				} else {
					newArr[i] = transform(oldArr[index], oldArr[index + 1]);					
				}
				index += 2;
			}
			
			oldArr = newArr;
			System.out.println(oldArr);
			
			
					
//		during loop iteration pass two elements to transform method			
//		add returned value to new array
			
		}
		
		return '0';
	}
	
	private static char transform(char quexeOne, char quexeTwo) {
		
		System.out.println("1: " + quexeOne + " 2: " + quexeTwo);
		
		if((quexeOne == 'R' && quexeTwo == 'G') || (quexeOne == 'G' && quexeTwo == 'R')) {
			return 'B';
		}else if((quexeOne == 'B' && quexeTwo == 'G') || (quexeOne == 'G' && quexeTwo == 'B')) {
			return 'R';
		} else if((quexeOne == 'R' && quexeTwo == 'B') || (quexeOne == 'B' && quexeTwo == 'R')) {
			return 'G';
		} else {
			return 0;
		}
	}

}
