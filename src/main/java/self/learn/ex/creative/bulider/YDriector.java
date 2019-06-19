package self.learn.ex.creative.bulider;

import lombok.Setter;

/**
 * Created by wyyangyang1 on 2019/6/19.
 */
@Setter
public class YDriector {
    private YBuilder builder;
    public YDriector(YBuilder builder){
        this.builder = builder;
    }
    public YRobot zaoRen(){
        builder.makeHead();
        builder.makeBody();
        builder.makeHands();
        builder.makefeet();
        builder.makeSoul();
        return builder.getBot();
    }
}
