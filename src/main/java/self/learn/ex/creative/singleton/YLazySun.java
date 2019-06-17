package self.learn.ex.creative.singleton;

/**
 * Created by wyyangyang1 on 2019/6/17.
 */
public class YLazySun {
    private static volatile YLazySun myLazySun = null;
    public static synchronized YLazySun getInstence(){
        if (myLazySun != null){
            myLazySun = new YLazySun();
        }else {
            System.out.println("太阳已经存在，返回该实例");
        }
        return myLazySun;
    }
    private YLazySun(){
        System.out.println("产生了一个太阳");
    }
}
