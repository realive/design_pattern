package self.learn.ex.creative.bulider;

/**
 * @author realive
 * @version 2019/6/14
 */
public class QProduct {
    /** 产品组件 */
    private String component1st;
    private String component2nd;
    private String component3rd;

    public void setComponent1st(String component1st) {
        this.component1st = component1st;
    }

    public void setComponent2nd(String component2nd) {
        this.component2nd = component2nd;
    }

    public void setComponent3rd(String component3rd) {
        this.component3rd = component3rd;
    }

    /** 产品的输出功能 */
    public String show() {
        return component1st + ", " + component2nd + ", " + component3rd;
    }
}
