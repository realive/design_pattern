package self.learn.ex.creative.singleton;

/**
 * @author realive
 * @version 2019/6/18
 */
public enum QSingleton3rd {
    instance;

    QSingleton3rd() {
        System.out.println("创建了实例:" + this.getClass().getName());
    }
}
