package self.learn.ex.structural.bridge;

/**
 * @author realive
 * @version 2019/6/13
 */
/** 独立于具体实现的抽象 */
public interface QAbstraction {
    String getVal1();

    Integer getVal2();

    String getPlatform();

    void setVal1(String val1);

    void setVal2(Integer val2);
}
