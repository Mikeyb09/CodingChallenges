package challenges;

public class AnimalLegs {
	
	private int total;
	
	AnimalLegs(){
		this.total = 0;
	}
	
	public int getAnimalLegs(int chic, int cow, int pig) {
	
		if (chic >= 0 && cow >= 0 && pig >= 0) {
			total = ((chic * 2) + (cow * 4) + (pig  * 4));			
		}
		
		return total;
		
	}

}
