package self.learn.ex.structural.proxy;

public class QProxy {
    private QSubject subject;

    public QProxy(QSubject subject) {
        this.subject = subject;
    }

    public void request() {
        subject.request();
    }

    public void preRequest() {
        System.out.println("response by proxy before request.");
    }

    public void postRequest() {
        System.out.println("response by proxy after request.");
    }

    public static void main(String[] args) {
        QSubject subject = new QRealSubject();
        QProxy proxy = new QProxy(subject);
        proxy.preRequest();
        proxy.request();
        proxy.postRequest();
    }
}
