package state;

public class BreakState implements State {
	Glass glass;
	public BreakState(Glass glass) {
		this.glass = glass;
	}

	@Override
	public void emptyGlass() {
		System.out.println("Cannot empty the glass as its broken");

	}

	@Override
	public void halfFill() {
		System.out.println("Cannot half fill as glass is broken");

	}

	@Override
	public void fullFill() {
		System.out.println("Cannot full Fill glass as it is broken");

	}

	@Override
	public void breakGlass() {
		System.out.println("Glass broken");

	}
	public String toString() {
		return " is broken";
	}

}
