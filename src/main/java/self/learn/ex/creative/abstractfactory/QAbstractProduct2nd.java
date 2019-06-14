package self.learn.ex.creative.abstractfactory;

/**
 * @author realive
 * @version 2019/6/14
 */
public abstract class QAbstractProduct2nd {
    private static final String type = "product2nd";

    public static String getType() {
        return type;
    }

    public void show() {
        System.out.println("this is " + getType() + ", and created by " + this.getClass().getName());
    }
}
