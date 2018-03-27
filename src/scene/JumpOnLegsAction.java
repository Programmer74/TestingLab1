package scene;

public class JumpOnLegsAction extends Action{
    public JumpOnLegsAction() {
        super("jump on legs");
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
