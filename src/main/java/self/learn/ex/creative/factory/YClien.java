package self.learn.ex.creative.factory;

import org.testng.annotations.Test;

/**
 * Created by wyyangyang1 on 2019/6/18.
 */
public class YClien {
    @Test
    public void Test(){
        YIceCreamFactory appleF= new YAppleIceCreamFactory();
        YIceCreamFactory cocoF= new YCocoIcecreamFactory();
        appleF.createIceCream().show();
        cocoF.createIceCream().show();
    }
}
