package self.learn.ex.structural.adapter;

public class QClient {
    public static void main(String[] args) {
        QAdaptee adaptee = new QAdaptee();
        QTarget target = new QAdapter(adaptee);
        target.request();
    }
}
