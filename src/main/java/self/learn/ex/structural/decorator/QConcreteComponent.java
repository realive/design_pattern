package self.learn.ex.structural.decorator;

/**
 * @author realive
 * @version 2019/7/10
 */
public class QConcreteComponent implements QComponent {
    @Override
    public String operation() {
        return "this is my operation";
    }
}
