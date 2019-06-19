package self.learn.ex.creative.bulider;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by wyyangyang1 on 2019/6/19.
 */
@Getter
@Setter
@ToString
public class YRobot {
    private String head;
    private String body;
    private String hands;
    private String feet;
    private String soul;
    public void show(){
        System.out.println(toString());
    }
}
