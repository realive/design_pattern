package self.learn.ex.creative.bulider;

/**
 * @author realive
 * @version 2019/6/13
 */
/**
 * 生成器具有统一的组件或流程，可以使用同一套操作序列构建产品
 * 组件或流程需要覆盖全面，是各种产品组件或流程的集合，具体生成器
 * 可只选择部分组件进行构建。
 */
public interface QBuilder {
    QProduct getProduct();
    /** 定义了各组件的构建步骤或方法 */
    void buildComponent1st();

    void buildComponent2nd();

    void buildComponent3rd();
}
