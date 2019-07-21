package self.learn.ex.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class QComposite implements QComponent {
    private String name;

    private List<QComponent> components = new ArrayList<>();

    public QComposite(String name) {
        this.name = name;
    }

    @Override
    public QComponent getChild(int i) {
        if (i < 0 || i >= components.size()) {
            throw new IndexOutOfBoundsException(
                    i < 0 ? "index must be positive." : "only has " + i + " components.");
        }
        return components.get(i);
    }

    @Override
    public boolean addChild(QComponent component) {
        return components.add(component);
    }

    @Override
    public boolean removeChild(QComponent component) {
        return components.remove(component);
    }

    @Override
    public void operation() {
        System.out.print(name + " ");
        if (components == null) {
            return;
        }
        for (QComponent component : components) {
            component.operation();
        }
    }
}
