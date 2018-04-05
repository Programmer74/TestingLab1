package testing.lab1.scene;

import java.util.ArrayList;
import java.util.List;

public class SceneObject {

    private ActionHistory actionHistory = null;
    private String objectName = null;

    private List<Adjective> adjectives;

    public SceneObject(String objectName) {
        this.objectName = objectName;
        adjectives = new ArrayList<>();
    }

    public void addAdjective(Adjective adjective) {
        adjectives.add(adjective);
    }

    public boolean is(Adjective adjective) {
        return adjectives.stream().anyMatch(adj -> adj.equals(adjective));
    }

    public List<Adjective> getAdjectives() {
        return adjectives;
    }

    public void doAction(Action action) {
        if (actionHistory != null) {
            actionHistory.addAction(this, action);
        }
    }

    public void doAction(Action action, ActionDescription ... actionDescriptions) {
        for (ActionDescription a : actionDescriptions) {
            action.addDescription(a);
        }
        if (actionHistory != null) {
            actionHistory.addAction(this, action);
        }
    }

    public String getObjectName() {
        return objectName;
    }

    public void setActionHistory(ActionHistory actionHistory) {
        this.actionHistory = actionHistory;
    }

    public ActionHistory getActionHistory() {
        return actionHistory;
    }

    @Override
    public String toString() {
        String s;
        s = "";
        for (Adjective a : adjectives) {
            s += a.getAdjective() + " ";
        }
        s += objectName;
        return s;
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
