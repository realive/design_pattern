package self.learn.ex.structural.bridge;

/**
 * @author realive
 * @version 2019/6/13
 */
public class QAbstractionImpl2nd implements QAbstraction {
    private static final String platform = "linux";
    private String val1;
    private Integer val2;

    @Override
    public String getVal1() {
        return val1;
    }

    public void setVal1(String val1) {
        this.val1 = val1;
    }

    @Override
    public Integer getVal2() {
        return val2;
    }

    @Override
    public void setVal2(Integer val2) {
        this.val2 = val2;
    }

    @Override
    public String getPlatform() {
        return platform;
    }
}
