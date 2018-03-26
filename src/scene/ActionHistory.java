package scene;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

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

}
