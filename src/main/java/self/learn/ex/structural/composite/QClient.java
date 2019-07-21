package self.learn.ex.structural.composite;

public class QClient {
    public static void main(String[] args) {
        QComponent composite1st = new QComposite("componsite");
        QComponent leaf1st = new QLeaf("leaf1");
        leaf1st.operation();
        System.out.println();
        composite1st.addChild(leaf1st);
        composite1st.addChild(new QLeaf("leaf2"));
        composite1st.addChild(new QLeaf("leaf3"));
        composite1st.addChild(new QLeaf("leaf4"));
        composite1st.operation();
        System.out.println();
        composite1st.getChild(1).operation();
        System.out.println();
        composite1st.removeChild(leaf1st);
        composite1st.operation();
        System.out.println();
        QComponent composite2nd = new QComposite("composite2nd");
        composite2nd.addChild(leaf1st);
        composite2nd.addChild(composite1st);
        composite2nd.operation();
    }
}
