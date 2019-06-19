package self.learn.ex.creative.bulider;

import org.testng.annotations.Test;

/**
 * Created by wyyangyang1 on 2019/6/19.
 */
public class YBuilderClint {
    @Test
    public void test(){
        YBuilder dogBuilder = new YDogBotBuilder();
        YDriector nvWa = new YDriector(dogBuilder);
        YRobot dogBot = nvWa.zaoRen();
        dogBot.show();

        nvWa.setBuilder(new YCatBotBuilder());
        nvWa.zaoRen().show();



    }
}
