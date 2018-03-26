package scene;

import java.util.ArrayList;
import java.util.List;

public class Scene {

    private ActionHistory actionHistory;
    private List<SceneObject> sceneObjects;

    public Scene() {
        actionHistory = new ActionHistory();
        sceneObjects = new ArrayList<>();
    }

    public void addSceneObject(SceneObject sceneObject) {
        sceneObject.setActionHistory(actionHistory);
        sceneObjects.add(sceneObject);
    }

    public SceneObject getSceneObject(String objectName) {
        for (SceneObject sc : sceneObjects) {
            if (sc.getObjectName().equals(objectName)) return sc;
        }
        return null;
    }

    public ActionHistory getActionHistory() {
        return actionHistory;
    }
}
