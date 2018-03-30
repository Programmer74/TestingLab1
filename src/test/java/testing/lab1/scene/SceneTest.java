package testing.lab1.scene;

import org.junit.Test;

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

        obj2.doAction(act1);
        obj1.doAction(act2);

        scene.getActionHistory().printActionHistory();

        assert(act1.getActionName().equals("act1"));

    }


    /*
    Легко, как балерина, Зафод вскочил на ноги и начал осматриваться.
    До самого горизонта во все стороны простиралась сплошная золотая поверхность.
    Она блестела, как... впрочем, этому невозможно подобрать сравнение,
    потому что ничто во Вселенной не блестит так, как планета из чистого золота.
     */

    @Test
    public void Test() {
        Scene scene = new Scene();

        Zafod zafod = new Zafod();
        Ballerina ballerina = new Ballerina();
        scene.addSceneObject(zafod);

        Surface surface = new Surface();
        scene.addSceneObject(surface);

        GoldAdjective ga = new GoldAdjective();
        FlatAdjective fa = new FlatAdjective();
        surface.addAdjective(ga);
        surface.addAdjective(fa);

        GoldPlanet gp = new GoldPlanet();
        //scene.addSceneObject(gp);
        SilverPlanet sp = new SilverPlanet();
        //scene.addSceneObject(sp);

        Universe uni = new Universe();
        uni.AddObject(sp);

        gp.doAction(new ShineAction());
        sp.doAction(new ShineAction());

        Horizon horizon = new Horizon();

        JumpOnLegsAction jump = new JumpOnLegsAction();
        ExtendAction extend = new ExtendAction();

        zafod.doAction(jump, ActionDescription.generateDescriptionFromEnum(ActionDescriptionEnum.easily), ActionDescription.generate_LikeSceneObject_Description(ballerina));
        surface.doAction(extend, ActionDescription.generate_ToSceneObject_Description(horizon), ActionDescription.generate_ToPlace_Description(DestinationEnum.all_sides));

        ShineAction shine = new ShineAction();
        shine.setStrength(GoldPlanet.SHINING_STRENGTH);

        surface.doAction(shine, uni.generateComparableActionDescription(gp, shine, new ShineAction()));

        scene.getActionHistory().printActionHistory();
        assert(zafod.getObjectName().equals("Zafod"));
    }
}
