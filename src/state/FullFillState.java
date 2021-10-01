package state;

public class FullFillState implements State {
	Glass glass;
	public FullFillState(Glass glass) {
		this.glass = glass;
	}

	@Override
	public void emptyGlass() {
		System.out.println("Glass empty");
		glass.setState(glass.getEmptyState());
	}

	@Override
	public void halfFill() {
		System.out.println("Glass half Full ");
		glass.setState(glass.getHalfState());
		
	}

	@Override
	public void fullFill() {
		System.out.println("Glass full");
		
	}

	@Override
	public void breakGlass() {
		System.out.println("Glass broken");
		glass.setState(glass.getBreakState());
	}
	public String toString() {
		return " full";
	}

}
