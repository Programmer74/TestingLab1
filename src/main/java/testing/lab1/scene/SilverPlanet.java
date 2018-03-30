package testing.lab1.scene;

public class SilverPlanet extends Planet {
    public SilverPlanet() {
        super("Planet made of Silver");
    }
    @Override
    public void doAction(Action action) {
        if (action.getClass().getName().equals(ShineAction.class.getName())) {
            action.setStrength(50);
        }
        super.doAction(action);
    }

    public void doAction(Action action, ActionDescription ... actionDescriptions) {
        for (ActionDescription a : actionDescriptions) {
            action.addDescription(a);
        }
        doAction(action);
    }
}
