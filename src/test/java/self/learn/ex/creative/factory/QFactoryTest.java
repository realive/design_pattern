package self.learn.ex.creative.factory;

/**
 * @author realive
 * @version 2019/6/12
 */
public class QFactoryTest {

    /** 解耦产品和用户 */
    public static void main(String[] args) {
        QClient client = new QClient(new QFactory1st());
        System.out.println(client.useProduct());
        client = new QClient(new QFactory2nd());
        System.out.println(client.useProduct());
    }
}
