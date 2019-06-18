package self.learn.ex.creative.singleton;

import com.alibaba.fastjson.JSON;

import java.lang.reflect.Constructor;

/**
 * @author realive
 * @version 2019/6/18
 */
public class QSingletonTest {

    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 100; ++i) {
            new Thread(QSingleton1st::getInstance).start();
        }

        /** 通过反射破坏单例 */
        Class<?> clz = Class.forName("self.learn.ex.creative.singleton.QSingleton1st");
        Constructor<?> cons = clz.getDeclaredConstructor();
        cons.setAccessible(true);
        cons.newInstance();

        /** 通过序列化和反序列化破坏单例 */
        QSingleton1st singleton = QSingleton1st.getInstance();
        JSON.parseObject(JSON.toJSONString(singleton), QSingleton1st.class);

        Thread.sleep(1000l);
        for (int i = 0; i < 100; ++i) {
            new Thread(QSingleton2nd::getInstance).start();
        }
    }
}
