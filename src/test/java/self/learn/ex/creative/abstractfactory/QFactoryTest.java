package self.learn.ex.creative.abstractfactory;

/**
 * @author realive
 * @version 2019/6/14
 */
public class QFactoryTest {

    public static void main(String[] args) {
        QAbstractFactory factory = new QConcreteFactory1st();
        QAbstractProduct1st product1st = factory.createProduct1st();
        QAbstractProduct2nd product2nd = factory.createProduct2nd();
        product1st.show();
        product2nd.show();
        factory = new QConcreteFactory2nd();
        product1st = factory.createProduct1st();
        product2nd = factory.createProduct2nd();
        product1st.show();
        product2nd.show();
    }
}
