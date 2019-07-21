package self.learn.ex.structural.composite;

public interface QComponent {
    void operation();

    default QComponent getChild(int i) {
        throw new UnsupportedOperationException("only composite component supported");
    }

    default boolean addChild(QComponent component) {
        throw new UnsupportedOperationException("only composite component supported");
    }

    default boolean removeChild(QComponent component) {
        throw new UnsupportedOperationException("only composite component supported");
    }
}
