package testing.lab1.scene;

public class GoldPlanet extends Planet {
    public GoldPlanet() {
        super("Planet made of Gold");
    }
    @Override
    public void doAction(Action action) {
        if (action.getClass().getName().equals(ShineAction.class.getName())) {
            action.setStrength(100);
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
