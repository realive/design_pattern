package self.learn.ex.creative.factory;

/**
 * @author realive
 * @version 2019/6/12
 */
public class QClient {
    private QFactory factory;

    public QClient(QFactory factory) {
        this.factory = factory;
    }

    /** 客户不知道产品细节，只需要从工厂取出并使用 */
    public String useProduct() {
        QProduct product = factory.createProduct();
        return product.show();
    }
}
