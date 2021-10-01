package state;

public class DrinkingGlassState {

	public static void main(String[] args) {
		Glass glass = new Glass();
		
		
		System.out.println(glass);
		
		//empty state
		
		glass.halfFillGlass();
		glass.emptyGlass();
		glass.fullFillGlass();
		glass.breakGlass();
		System.out.println(glass);
		//break state
		glass.halfFillGlass();
		glass.fullFillGlass();
		glass.emptyGlass();
		glass.breakGlass();
		

	}

}
