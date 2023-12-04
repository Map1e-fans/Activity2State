public class test_diagram {

    // Enum for States
    public enum State {
        act1, 
        act2, 
        act3, 
        act4, 
        act5, 
        act6, 
        start, 
        end, 
        dec1, 
        merge1, 
        fork1, 
        join1
    }

    // Current State
    private State currentState;

    // Constructor
    public test_diagram() {
        // Set initial state if exists
        this.currentState = State.start;
    }

    // Method to process transitions based on guard conditions
    public void processEvent(String event) {
        switch (currentState) {
            case start:
				currentState = State.act1;
				break;
            case act1:
				currentState = State.act2;
				break;
            case act2:
				currentState = State.dec1;
				break;
            case dec1:
				if ("cond2".equals(event)) {
	                currentState = State.act3;
	                // Transition logic for dec1 -> act3
					break;
                }
            case dec1:
				if ("cond1".equals(event)) {
	                currentState = State.act4;
	                // Transition logic for dec1 -> act4
					break;
                }
            case act3:
				currentState = State.fork1;
				break;
            case act4:
				currentState = State.merge1;
				break;
            case merge1:
				currentState = State.end;
				break;
            case fork1:
				currentState = State.act5;
				break;
            case fork1:
				currentState = State.act6;
				break;
            case act5:
				currentState = State.join1;
				break;
            case act6:
				currentState = State.join1;
				break;
            case join1:
				currentState = State.merge1;
				break;
        }
    }
}
