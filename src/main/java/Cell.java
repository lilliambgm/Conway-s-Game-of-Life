public class Cell {
    String state;

    public String cell() {
        determineState();
        return state;
    }

    private void determineState() {
        double random = Math.random();
        if (random < 0.5) {
            this.state = "-";
        }
        if (random > 0.5) {
            this.state = "0";
        }
    }
}