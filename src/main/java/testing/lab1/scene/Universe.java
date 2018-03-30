package testing.lab1.scene;

import javafx.scene.Scene;

import java.util.ArrayList;
import java.util.List;

public class Universe extends SceneObject {

    public List<SceneObject> objects;

    public Universe() {
        super("Universe");
        objects = new ArrayList<>();
    }

    public void AddObject (SceneObject object) {
        objects.add(object);
    }

    public ActionDescription generateComparableActionDescription(SceneObject object, Action idealAction, Action action) {
        for (SceneObject o : objects) {
            o.doAction(action);
            if (idealAction.getStrength() == action.getStrength()) {
                return ActionDescription.generate_LikeSceneObject_Description(o);
            }
        }
        return new UncomparableActionDescription("nothing can " + idealAction.getActionName() + " as " + object.getObjectName());
    }
}
