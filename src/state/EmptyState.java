package state;

public class EmptyState implements State {
	Glass glass;
	public EmptyState(Glass glass) {
		this.glass = glass;
	}

	@Override
	public void emptyGlass() {
		System.out.println("Glass is emptyy");

	}

	@Override
	public void halfFill() {
		System.out.println("Glass half full");
		glass.setState(glass.getHalfState());

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
		return " empty";
	}

}
