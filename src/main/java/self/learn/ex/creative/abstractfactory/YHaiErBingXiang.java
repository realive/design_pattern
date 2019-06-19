package self.learn.ex.creative.abstractfactory;

/**
 * Created by wyyangyang1 on 2019/6/19.
 */
public class YHaiErBingXiang extends YAbstractBingXiang {
    public YHaiErBingXiang(){
        this.shangBiao = "HaiEr";
        System.out.println("生产了一台"+shangBiao+type);
    }
    @Override
    public void bingDong() {
        System.out.println(shangBiao+type+"冰冻了一只皮皮虾");
    }
}
