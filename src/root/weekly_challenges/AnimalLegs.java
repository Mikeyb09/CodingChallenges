package root.weekly_challenges;

public class AnimalLegs {
	
	private int total;
	
	public AnimalLegs(){
		this.total = 0;
	}
	
	public int getAnimalLegs(int chic, int cow, int pig) {
	
		if (chic >= 0 && cow >= 0 && pig >= 0) {
			total = ((chic * 2) + (cow * 4) + (pig  * 4));			
		}
		
		return total;
		
	}
	
	
//	FOR TESTING PURPOSES --- 
	
//	AnimalLegs Coding Challenge 7-25-22 
//	AnimalLegs animalLegs = new AnimalLegs();
//	System.out.println("Total number of legs: " + animalLegs.getAnimalLegs(1, 2, 3));
//	System.out.println("Total number of legs: " + animalLegs.getAnimalLegs(2, 3, 5));
//	System.out.println("Total number of legs: " + animalLegs.getAnimalLegs(5, 2, 8));

}
