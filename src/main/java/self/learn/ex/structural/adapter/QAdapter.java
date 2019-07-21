package self.learn.ex.structural.adapter;

public class QAdapter implements QTarget{
    private QAdaptee adaptee;

    public QAdapter(QAdaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        System.out.println("response by adapter");
        adaptee.specificRequest();
        System.out.println("response completed");
    }
}
