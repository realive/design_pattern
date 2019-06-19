package self.learn.ex.creative.bulider;

/**
 * Created by wyyangyang1 on 2019/6/19.
 */
public class YDogBotBuilder implements YBuilder{
    private YRobot dogBot = new YRobot();
    @Override
    public void makeHead() {
        dogBot.setHead("狗头");
    }

    @Override
    public void makeBody() {
        dogBot.setBody("狗身");
    }

    @Override
    public void makeHands() {
        dogBot.setHands("狗前腿");
    }

    @Override
    public void makefeet() {
        dogBot.setFeet("狗后蹄子");
    }

    @Override
    public void makeSoul() {
        dogBot.setSoul("单身狗程序注入");
    }

    @Override
    public YRobot getBot() {
        return dogBot;
    }


}
