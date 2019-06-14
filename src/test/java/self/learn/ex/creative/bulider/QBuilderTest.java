package self.learn.ex.creative.bulider;

/**
 * @author realive
 * @version 2019/6/14
 */
public class QBuilderTest {
    /** 使用者持有导向器，并指定具体的生成器 */
    public static void main(String[] args) {
        QConcreteBuilder1st builder1st = new QConcreteBuilder1st();
        QConcreteBuilder2nd builder2nd = new QConcreteBuilder2nd();

        QDirector director = new QDirector(builder1st);
        System.out.println(director.construct().show());

        director = new QDirector(builder2nd);
        System.out.println(director.construct().show());
    }
}
