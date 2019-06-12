package self.learn.ex.creative.factory;

/**
 * @author realive
 * @version 2019/6/12
 */
public class QFactory1st implements QFactory {
    /** 具体工厂生产具体产品 */
    @Override
    public QProduct1st createProduct() {
        return new QProduct1st("television", 30);
    }
}
