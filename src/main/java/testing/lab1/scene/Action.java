package testing.lab1.scene;

import java.util.ArrayList;
import java.util.List;

public class Action {

    private String actionName;
    private List<ActionDescription> actionDescriptions;

    public Action(String actionName) {
        this.actionName = actionName;
        actionDescriptions = new ArrayList<>();
    }

    public void addDescription(ActionDescription description) {
        actionDescriptions.add(description);
    }

    protected List<ActionDescription> getActionDescriptions() {
        return actionDescriptions;
    }

    @Override
    public String toString() {
        String s = "Action{actionName='" + actionName + '\'';
        if (!actionDescriptions.isEmpty()) {
            s += ", doneHow: ";
            for (ActionDescription actionDescription : actionDescriptions) {
                s += actionDescription.toString() + " ";
            }
        }
        s += "}";
        return s;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Action action = (Action) o;

        if (actionName != null ? !actionName.equals(action.actionName) : action.actionName != null) return false;
        return actionDescriptions != null ? actionDescriptions.equals(action.actionDescriptions) : action.actionDescriptions == null;
    }

    @Override
    public int hashCode() {
        int result = actionName != null ? actionName.hashCode() : 0;
        result = 31 * result + (actionDescriptions != null ? actionDescriptions.hashCode() : 0);
        return result;
    }

    public String getActionName() {
        return actionName;
    }

}
