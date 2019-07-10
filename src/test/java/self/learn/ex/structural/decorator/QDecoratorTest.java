package self.learn.ex.structural.decorator;

/**
 * @author realive
 * @version 2019/7/10
 */
public class QDecoratorTest {
    public static void main(String[] args) {
        QComponent component = new QConcreteComponent();
        QDecorator decorator = new QConcreteDecorator(component);
        System.out.println(component.operation());
        System.out.println(decorator.operation());
        System.out.println(decorator.addBehavior());
    }
}
