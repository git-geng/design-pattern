package opacity;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

    List<Component> components=new ArrayList<>();

    @Override
    public void add(Component component) {
        components.add(component);
    }

    @Override
    public void remove(Component component) {
        components.remove(component);
    }

    @Override
    public Component getChild(int i) {
        return components.get(i);
    }

    @Override
    public void operation() {
        components.parallelStream().forEach(component -> {
            component.operation();
        });
    }
}
