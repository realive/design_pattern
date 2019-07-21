package self.learn.ex.structural.proxy;

public class QRealSubject implements QSubject {
    @Override
    public void request() {
        System.out.println("response by real subject.");
    }
}
