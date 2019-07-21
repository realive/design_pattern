package self.learn.ex.structural.flyweight;

public class QUnsharedState {
    private String state;
    public QUnsharedState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "QUnsharedState [state = " + state + ']';
    }
}
