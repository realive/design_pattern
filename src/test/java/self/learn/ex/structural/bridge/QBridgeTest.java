package self.learn.ex.structural.bridge;

/**
 * @author realive
 * @version 2019/6/13
 */
public class QBridgeTest {

    /**
     * QImplementor和QAbstraction是独立变化的两个部分中稳定的桥，
     * QImplementor拥有QAbstraction实例，因此QAbstraction可以独立于QImplementor而变化
     * QImplementor的子类通过继承，获取了QImplementor的全部能力，并可通过新增属性方法对原有功能进行扩展
     */
    public static void main(String[] args) {
        QImplementor implementor = new QRefinedImplementor1st(new QAbstractionImpl1st());
        System.out.println(implementor.setAndGetVal1("test setAndGetVal1"));
        System.out.println(implementor.setAndGetVal2(1134));
        System.out.println(((QRefinedImplementor1st)implementor).setAndGetRefinedVal1("test setAndGetVal1 refined"));
        System.out.println(((QRefinedImplementor1st)implementor).setAndGetRefinedVal2(1134));

        implementor = new QRefinedImplementor2nd(new QAbstractionImpl2nd());
        System.out.println(implementor.setAndGetVal1("test setAndGetVal1"));
        System.out.println(implementor.setAndGetVal2(1134));
        System.out.println(((QRefinedImplementor2nd)implementor).combineVal1AndVal2("test setAndGetVal1 refined", 1134));
    }
}
