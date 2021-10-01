package state;

public class Glass {
	State breakState;
	State emptyState;
	State halfState;
	State fullState;
	
	State state;
	public Glass() {
		breakState = new BreakState(this);
		emptyState = new EmptyState(this);
		halfState = new HalfFillState(this);
		fullState = new FullFillState(this);
		
		state = emptyState;
	}
	public void breakGlass() {
		state.breakGlass();
	}
	public void emptyGlass() {
		state.emptyGlass();
	}
	public void halfFillGlass() {
		state.halfFill();
	}
	public void fullFillGlass() {
		state.fullFill();
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public State getEmptyState() {
		return emptyState;
	}
	public State getBreakState() {
		return breakState;
	}
	public State getHalfState() {
		return halfState;
	}
	public State getFullState() {
		return fullState;
	}
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("\n-------- Monroe Bar ---------\n");
		result.append("Glass " + state + "\n");
		return result.toString();
	}

}
