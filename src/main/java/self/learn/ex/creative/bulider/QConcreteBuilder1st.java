package self.learn.ex.creative.bulider;

/**
 * @author realive
 * @version 2019/6/14
 */
/** 生成器并不一定要持有产品的引用，也可通过返回组件在导向器中具体装配 */
public class QConcreteBuilder1st implements QBuilder {
    private QProduct product = new QProduct();

    @Override
    public QProduct getProduct() {
        return this.product;
    }

    @Override
    public void buildComponent1st() {
        this.product.setComponent1st("builder1st set 1st component");
    }

    @Override
    public void buildComponent2nd() {
        this.product.setComponent2nd("do nothing");
    }

    @Override
    public void buildComponent3rd() {
        this.product.setComponent3rd("builder1st set 3rd component");
    }
}
