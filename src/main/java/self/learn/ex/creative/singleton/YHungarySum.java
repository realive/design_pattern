package self.learn.ex.creative.singleton;

/**
 * Created by wyyangyang1 on 2019/6/17.
 */
public class YHungarySum {
    private static YHungarySum yHungarySum = new YHungarySum();
    public static YHungarySum getInstance(){
        return yHungarySum;
    }
    private YHungarySum(){
        System.out.println("初始化一个饿汉实例");
    }
}
