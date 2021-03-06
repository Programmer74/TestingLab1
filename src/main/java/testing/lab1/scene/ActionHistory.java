package testing.lab1.scene;

import java.util.ArrayList;
import java.util.List;

import testing.lab1.util.Pair;

public class ActionHistory {

    private List<Pair<SceneObject, Action>> actions;

    public ActionHistory() {
        actions = new ArrayList<>();
    }

    public void addAction(SceneObject sceneObject, Action action) {
        actions.add(new Pair<>(sceneObject, action));
    }

    public void printActionHistory() {
        for (Pair<SceneObject, Action> a : actions) {
            System.out.println(a.getKey().toString() + " did " + a.getValue().toString());
        }
    }

    public Action getLastAction(SceneObject object) {
        Pair<SceneObject, Action> a =  actions.stream().filter(
                p -> p.getKey() == object).reduce((f, s) -> s).orElse(null);
        return a == null ? null : a.getValue();
    }

}
