package self.learn.ex.creative.factory;

/**
 * Created by wyyangyang1 on 2019/6/18.
 */
public class YAppleIceCreamFactory implements YIceCreamFactory{
    @Override
    public YIceCream createIceCream() {
        return new YAppleIceCream();
    }
}
