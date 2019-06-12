package self.learn.ex.creative.factory;

/**
 * @author realive
 * @version 2019/6/12
 */
public class QFactory2nd implements QFactory {
    @Override
    public QProduct2nd createProduct() {
        return new QProduct2nd("computer", 90);
    }
}
