package self.learn.ex.creative.factory;

/**
 * Created by wyyangyang1 on 2019/6/18.
 */
public abstract class YIcecreamImp implements YIceCream{
    String teste;
    @Override
    public void show() {
        System.out.println("生产一个"+teste+name);
    }
}
