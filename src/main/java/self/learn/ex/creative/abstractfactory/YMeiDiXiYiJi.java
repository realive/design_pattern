package self.learn.ex.creative.abstractfactory;

/**
 * Created by wyyangyang1 on 2019/6/19.
 */
public class YMeiDiXiYiJi extends YAbstractXiYiJi {
    public YMeiDiXiYiJi(){
        this.shangBiao = "MeiDi";
    }
    @Override
    public void xiYiFu() {
        System.out.println(shangBiao+type+"洗了一件衣服");
    }
}
