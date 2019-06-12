package self.learn.ex.creative.factory;

/**
 * @author realive
 * @version 2019/6/12
 */
public class QAbstractProduct implements QProduct {
    /** 公共属性 */
    private String productName;

    public QAbstractProduct() {
    }

    public QAbstractProduct(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public String show() {
        return "this product named " + productName;
    }
}
