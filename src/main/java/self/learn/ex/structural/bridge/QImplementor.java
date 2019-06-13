package self.learn.ex.structural.bridge;

/**
 * @author realive
 * @version 2019/6/13
 */
/** 隐藏实现细节，面向接口编程的实现类 */
public class QImplementor {
    private QAbstraction abstraction;

    public QImplementor(QAbstraction abstraction) {
        this.abstraction = abstraction;
    }

    public String setAndGetVal1(String val1) {
        System.out.println("---set and get val1 from " + abstraction.getPlatform() + " ---");
        abstraction.setVal1(val1);
        return abstraction.getVal1();
    }

    public Integer setAndGetVal2(Integer val2) {
        System.out.println("---set and get val2 from " + abstraction.getPlatform() + " ---");
        abstraction.setVal2(val2);
        return abstraction.getVal2();
    }
}
