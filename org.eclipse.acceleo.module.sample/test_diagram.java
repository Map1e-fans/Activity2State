
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
                if (.equals(event)) {
                    currentState = State.act1;
                    // Transition logic for start -> act1
                }
                break;
            case act1:
                if (.equals(event)) {
                    currentState = State.act2;
                    // Transition logic for act1 -> act2
                }
                break;
            case act2:
                if (.equals(event)) {
                    currentState = State.dec1;
                    // Transition logic for act2 -> dec1
                }
                break;
            case dec1:
                if (cond2.equals(event)) {
                    currentState = State.act3;
                    // Transition logic for dec1 -> act3
                }
                break;
            case dec1:
                if (cond1.equals(event)) {
                    currentState = State.act4;
                    // Transition logic for dec1 -> act4
                }
                break;
            case act3:
                if (.equals(event)) {
                    currentState = State.fork1;
                    // Transition logic for act3 -> fork1
                }
                break;
            case act4:
                if (.equals(event)) {
                    currentState = State.merge1;
                    // Transition logic for act4 -> merge1
                }
                break;
            case merge1:
                if (.equals(event)) {
                    currentState = State.end;
                    // Transition logic for merge1 -> end
                }
                break;
            case fork1:
                if (.equals(event)) {
                    currentState = State.act5;
                    // Transition logic for fork1 -> act5
                }
                break;
            case fork1:
                if (.equals(event)) {
                    currentState = State.act6;
                    // Transition logic for fork1 -> act6
                }
                break;
            case act5:
                if (.equals(event)) {
                    currentState = State.join1;
                    // Transition logic for act5 -> join1
                }
                break;
            case act6:
                if (.equals(event)) {
                    currentState = State.join1;
                    // Transition logic for act6 -> join1
                }
                break;
            case join1:
                if (.equals(event)) {
                    currentState = State.merge1;
                    // Transition logic for join1 -> merge1
                }
                break;
        }
    }
}
