package self.learn.ex.structural.flyweight;

public class QConcreteFlyweight implements QFlyweight {
    public QConcreteFlyweight() {
        System.out.println("flyweight created.");
    }

    @Override
    public void operation(QUnsharedState state) {
        System.out.println("add unshared state : " + state);
    }
}
