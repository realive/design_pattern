package self.learn.ex.creative.bulider;

/**
 * Created by wyyangyang1 on 2019/6/19.
 */
public class YCatBotBuilder implements YBuilder{
    private YRobot catBot = new YRobot();
    @Override
    public void makeHead() {
        catBot.setHead("多啦B萌头");
    }

    @Override
    public void makeBody() {
        catBot.setBody("多啦B萌身");
    }

    @Override
    public void makeHands() {
        catBot.setHands("多啦B萌前腿");
    }

    @Override
    public void makefeet() {
        catBot.setFeet("多啦B萌后蹄子");
    }

    @Override
    public void makeSoul() {
        catBot.setSoul("多啦B萌程序注入");
    }

    @Override
    public YRobot getBot() {
        return catBot;
    }


}
