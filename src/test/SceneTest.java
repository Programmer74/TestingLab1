package test;

import org.junit.Test;
import scene.Action;
import scene.Scene;
import scene.SceneObject;

public class SceneTest {
    @Test
    public void InitialTest() {
        Scene scene = new Scene();

        SceneObject obj1 = new SceneObject("obj1");
        SceneObject obj2 = new SceneObject("obj2");

        Action act1 = new Action("act1");
        Action act2 = new Action("act2");

        scene.addSceneObject(obj1);
        scene.addSceneObject(obj2);

        scene.getSceneObject("obj2").doAction(act1);
        scene.getSceneObject("obj1").doAction(act2);

        scene.getActionHistory().printActionHistory();

        assert(act1.getActionName().equals("act1"));
    }
}
