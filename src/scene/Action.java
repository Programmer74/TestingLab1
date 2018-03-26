package scene;

public class Action {

    private String actionName;

    public Action(String actionName) {
        this.actionName = actionName;
    }

    @Override
    public String toString() {
        return "Action{" +
                "actionName='" + actionName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Action action = (Action) o;

        return actionName != null ? actionName.equals(action.actionName) : action.actionName == null;
    }

    @Override
    public int hashCode() {
        return actionName != null ? actionName.hashCode() : 0;
    }

    public String getActionName() {
        return actionName;
    }

}
