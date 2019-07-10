package self.learn.ex.structural.decorator;

/**
 * @author realive
 * @version 2019/7/10
 */
public class QConcreteDecorator implements QDecorator {
    private QComponent component;

    public QConcreteDecorator(QComponent component) {
        this.component = component;
    }

    @Override
    public String operation() {
        return "Decorated: " + component.operation();
    }

    @Override
    public String addBehavior() {
        return "My name is " + component.getClass().getName();
    }
}
