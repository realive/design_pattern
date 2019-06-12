package self.learn.ex.creative.factory;

/**
 * @author realive
 * @version 2019/6/12
 */
public class QProduct2nd extends QAbstractProduct {
    private int life;

    public QProduct2nd() {
    }

    public QProduct2nd(String productName, int life) {
        super(productName);
        this.life = life;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    @Override
    public String show() {
        return super.show() + ", was designed " + life + " years active life.";
    }
}
