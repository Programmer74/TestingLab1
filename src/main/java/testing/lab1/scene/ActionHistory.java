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
            if (!a.getKey().getAdjectives().isEmpty()) {
                for (Adjective adj : a.getKey().getAdjectives()) {
                    System.out.print(adj.toString() + " ");
                }
            }
            System.out.println(a.getKey().toString() + " did " + a.getValue().toString());
        }
    }

}
