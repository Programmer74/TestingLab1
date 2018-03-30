package testing.lab1.scene;

public class ExtendAction extends Action{
    public ExtendAction() {
        super("extend");
    }

    @Override
    public String toString() {
        String s = getActionName();
        if (!getActionDescriptions().isEmpty()) {
            s += " ";
            for (ActionDescription actionDescription : getActionDescriptions()) {
                s += actionDescription.toString() + " ";
            }
        }
        return s;
    }
}