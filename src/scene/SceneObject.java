package scene;

import java.util.List;

public class SceneObject {

    private ActionHistory actionHistory = null;
    private String objectName = null;

    public SceneObject(String objectName) {
        this.objectName = objectName;
    }

    public void doAction(Action action) {
        actionHistory.addAction(this, action);
    }

    public void doAction(Action action, ActionDescription ... actionDescriptions) {
        for (ActionDescription a : actionDescriptions) {
            action.addDescription(a);
        }
        actionHistory.addAction(this, action);
    }

    public String getObjectName() {
        return objectName;
    }

    public void setActionHistory(ActionHistory actionHistory) {
        this.actionHistory = actionHistory;
    }

    @Override
    public String toString() {
        return "SceneObject{" +
                "objectName='" + objectName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SceneObject that = (SceneObject) o;

        return objectName != null ? objectName.equals(that.objectName) : that.objectName == null;
    }

    @Override
    public int hashCode() {
        return objectName != null ? objectName.hashCode() : 0;
    }
}
