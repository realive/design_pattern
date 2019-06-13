package self.learn.ex.structural.bridge;

/**
 * @author realive
 * @version 2019/6/13
 */
public class QRefinedImplementor1st extends QImplementor {
    private static final String add2Val1 = "impl 1st:";

    private static final Integer add2Val2 = 100;

    public QRefinedImplementor1st(QAbstraction abstraction) {
        super(abstraction);
    }

    public String setAndGetRefinedVal1(String val1) {
        return add2Val1 + setAndGetVal1(val1);
    }

    public Integer setAndGetRefinedVal2(Integer val2) {
        return add2Val2 + setAndGetVal2(val2);
    }
}
