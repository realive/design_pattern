package self.learn.ex.creative.factory;

/**
 * @author realive
 * @version 2019/6/12
 */
public class QProduct1st extends QAbstractProduct {
    private int power;

    public QProduct1st() {
    }

    public QProduct1st(String productName, int power) {
        super(productName);
        this.power = power;
    }

    public QProduct1st(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String show() {
        return super.show() + ", has power up to " + power + " watts.";
    }
}
