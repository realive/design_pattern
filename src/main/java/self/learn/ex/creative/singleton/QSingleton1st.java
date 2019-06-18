package self.learn.ex.creative.singleton;

/**
 * @author likun11
 * @version 2019/6/18
 */
/** 急切初始化 用于开销小的示例创建 */
public class QSingleton1st {
    private static QSingleton1st singleton = new QSingleton1st();

    private QSingleton1st() {
        System.out.println("创建了实例:" + this.getClass().getName());
    }

    public static QSingleton1st getInstance() {
        return singleton;
    }
}
