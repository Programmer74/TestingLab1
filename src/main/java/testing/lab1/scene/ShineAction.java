package testing.lab1.scene;

public class ShineAction extends  Action {
    public ShineAction() {
        super("shine");
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
