package self.learn.ex.creative.singleton;

/**
 * @author likun11
 * @version 2019/6/18
 */
/** 延迟创建实例 */
public class QSingleton2nd {
    /** 需要加关键字volatile */
    private volatile static QSingleton2nd singleton;

    private QSingleton2nd() {
        System.out.println("创建了实例:" + this.getClass().getName());
    }

    /** 双重检查锁能够有效降低并发调用开销 */
    public static QSingleton2nd getInstance() {
        if (singleton == null) {
            synchronized (QSingleton2nd.class) {
                if (singleton == null) {
                    singleton = new QSingleton2nd();
                }
            }
        }
        return singleton;
    }
}
