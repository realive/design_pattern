package self.learn.ex.structural.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class QFlyweightFactory {
    private static Map<String, QFlyweight> flyweights = new ConcurrentHashMap<>();

    public static QFlyweight getFlyweight(String key) {
        QFlyweight flyweight = flyweights.get(key);
        if (flyweight == null) {
            flyweight = new QConcreteFlyweight();
            flyweights.put(key, flyweight);
        }
        return flyweight;
    }

    public static void main(String[] args) {
        QFlyweight f1 = QFlyweightFactory.getFlyweight("one");
        f1.operation(new QUnsharedState("state1"));
        QFlyweight f2 = QFlyweightFactory.getFlyweight("one");
        f2.operation(new QUnsharedState("state2"));
        QFlyweight f3 = QFlyweightFactory.getFlyweight("two");
        f3.operation(new QUnsharedState("state3"));
    }
}
