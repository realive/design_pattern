package self.learn.ex.structural.bridge;

/**
 * @author realive
 * @version 2019/6/13
 */
public class QRefinedImplementor2nd extends QImplementor {
    private static final String format = "impl 2nd: val1 is %s, val2 is %05d";

    public QRefinedImplementor2nd(QAbstraction abstraction) {
        super(abstraction);
    }

    public String combineVal1AndVal2(String val1, Integer val2) {
        return String.format(format, setAndGetVal1(val1), setAndGetVal2(val2));
    }
}
