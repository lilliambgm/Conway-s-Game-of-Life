public class Cell {
    private String state;

    //Constructor, setting the state to a random state determined by DetermineStarterState()
    public Cell() {
        DetermineStarterState();
    }

    //Function using Java.Math, to determine a random cell state, either "-" or "0"
    private void DetermineStarterState() {
        // Generating a random number between 0 and 1.
        double random = Math.random();
        if (random < 0.5) {
            // Setting state to dead (-) if random number is smaller than .5
            this.state = "-";
        } else {
            // Setting the state to live (0) if random number is .5 or greater.
            this.state = "0";
        }
    }

    // Determining the new cell state, by considering the neighbour of the current cell, which will be given in the function call.
    // ToDo Make sure that the updated cells are not taken into consideration for cells later on in the game grid.
    private void DetermineNewState(String[] neighbours) {
        // Declaring variable to keep count of the neighbours that are alive.
        int aliveNeighbours = 0;
        // Initiating an enhanced for loop to loop over the neighbour array passed into the function.
        for (String neighbourState : neighbours) {
            //Checking neighbour state, and adding to the alive count if state is 0 (which is the alive state)
            if (neighbourState.equals("0")) {
                aliveNeighbours += 1;
            }
        }
        // Applying the rules of the Game of Life for live cells, as per stated in Main.java
        if (this.state.equals("0")) {
            if (aliveNeighbours == 2 || aliveNeighbours == 3) {
                // Keeping the cell alive with 2 or 3 live cells
                this.state = "0";
            } else {
                // Killing the cell in all other situations.
                this.state = "-";
            }
        }
        // Checking if the cell is dead, and has exactly 3 live cells, reviving this cell.
        if (this.state.equals("-") && aliveNeighbours == 3) {
            this.state = "0";
        }
    }

    //<editor-fold desc="Updater">
    // Updating cell state based on passed through state.
    public void UpdateState(String state) {
        this.state = state;
    }
    //</editor-fold>

    //<editor-fold desc="Accessor">
    // State accessor for outside the class.
    public String GetState() {
        return this.state;
    }
    //</editor-fold>
}
