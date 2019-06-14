package self.learn.ex.creative.bulider;

/**
 * @author realive
 * @version 2019/6/14
 */
public class QConcreteBuilder2nd implements QBuilder {
    private QProduct product = new QProduct();

    @Override
    public QProduct getProduct() {
        return this.product;
    }

    @Override
    public void buildComponent1st() {
        this.product.setComponent1st("builder2st set 1st component");
    }

    @Override
    public void buildComponent2nd() {
        this.product.setComponent2nd("builder2st set 2nd component");
    }

    @Override
    public void buildComponent3rd() {
        this.product.setComponent3rd("do nothing");
    }
}
