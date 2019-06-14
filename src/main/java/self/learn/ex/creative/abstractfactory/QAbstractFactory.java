package self.learn.ex.creative.abstractfactory;

/**
 * @author realive
 * @version 2019/6/14
 */
/** 有多少个组合，就有多少具体工厂 */
public interface QAbstractFactory {
    /** 产品族 */
    QAbstractProduct1st createProduct1st();

    QAbstractProduct2nd createProduct2nd();
}
