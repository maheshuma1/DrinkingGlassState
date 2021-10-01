package state;

public class HalfFillState implements State {
	Glass glass;
	public HalfFillState(Glass glass) {
		this.glass = glass;
	}

	@Override
	public void emptyGlass() {
		System.out.println("Glass empty");
		glass.setState(glass.getEmptyState());
	}

	@Override
	public void halfFill() {
		System.out.println("Glass half full");

	}

	@Override
	public void fullFill() {
		System.out.println("Glass full");
		glass.setState(glass.getFullState());
	}

	@Override
	public void breakGlass() {
		System.out.println("Glass broken");
		glass.setState(glass.getBreakState());

	}
	public String toString() {
		return " half full";
	}
}
