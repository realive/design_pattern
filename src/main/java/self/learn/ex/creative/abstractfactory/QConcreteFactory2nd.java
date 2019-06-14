package self.learn.ex.creative.abstractfactory;


/**
 * @author realive
 * @version 2019/6/14
 */
public class QConcreteFactory2nd implements QAbstractFactory {
    @Override
    public QAbstractProduct1st createProduct1st() {
        return new QProduct1st2nd();
    }

    @Override
    public QAbstractProduct2nd createProduct2nd() {
        return new QProduct2nd2nd();
    }
}
