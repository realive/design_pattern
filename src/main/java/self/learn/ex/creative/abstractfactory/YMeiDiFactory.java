package self.learn.ex.creative.abstractfactory;

/**
 * Created by wyyangyang1 on 2019/6/19.
 */
public class YMeiDiFactory implements YFactory{
    @Override
    public YBingXiang createBingXiang() {
        return new YMeiDiBingXiang();
    }

    @Override
    public YXiYiJi createXiYiJI() {
        return new YMeiDiXiYiJi();
    }
}
