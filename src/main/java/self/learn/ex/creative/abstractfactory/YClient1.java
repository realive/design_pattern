package self.learn.ex.creative.abstractfactory;

import org.testng.annotations.Test;

/**
 * Created by wyyangyang1 on 2019/6/19.
 */
public class YClient1 {

    @Test
    public void test(){
        YFactory haierF = new YHaiErFactory();
        haierF.createBingXiang().bingDong();
        haierF.createXiYiJI().xiYiFu();

        YFactory meiDiF = new YMeiDiFactory();
        meiDiF.createBingXiang().bingDong();
        meiDiF.createXiYiJI().xiYiFu();
    }
}
