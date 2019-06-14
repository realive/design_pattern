package self.learn.ex.creative.abstractfactory;

/**
 * @author realive
 * @version 2019/6/14
 */
public abstract class QAbstractProduct1st {
    private static final String type = "product1st";

    public static String getType() {
        return type;
    }

    public void show() {
        System.out.println("this is " + getType() + ", and created by " + this.getClass().getName());
    }
}
