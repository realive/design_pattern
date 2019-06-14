package self.learn.ex.creative.bulider;

/**
 * @author realive
 * @version 2019/6/14
 */
/**
 * 导向器/指挥者通过生成器器获取产品，导向器持有生成器，但不了解产品的细节和生成器的实现
 * 导向器按照一定的流程逐个生成产品组件，并进行装配
 */
public class QDirector {
    private QBuilder builder;

    public QDirector(QBuilder builder) {
        this.builder = builder;
    }

    /** 逐个构建组件 */
    public QProduct construct() {
        this.builder.buildComponent1st();
        this.builder.buildComponent2nd();
        this.builder.buildComponent3rd();
        return this.builder.getProduct();
    }
}
