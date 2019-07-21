package self.learn.ex.structural.composite;

public class QLeaf implements QComponent {
    private String name;

    public QLeaf(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.print(name + " ");
    }
}
