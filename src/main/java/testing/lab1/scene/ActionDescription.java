package testing.lab1.scene;

public class ActionDescription {
    private String actionDescription;

    public ActionDescription(String actionDescription) {
        this.actionDescription = actionDescription;
    }

    public String getActionDescription() {
        return actionDescription;
    }

    @Override
    public String toString() {
        return actionDescription;
    }

    public static ActionDescription generate_LikeSceneObject_Description (SceneObject object) {
        return new ActionDescription("like " + object.getObjectName());
    }

    public static ActionDescription generate_ToSceneObject_Description (SceneObject object) {
        return new ActionDescription("to " + object.getObjectName());
    }

    public static ActionDescription generate_ToPlace_Description (DestinationEnum destination) {
        return new ActionDescription("at " + destination.name());
    }

    public static ActionDescription generateDescriptionFromEnum (ActionDescriptionEnum descriptionEnum) {
        return new ActionDescription(descriptionEnum.name());
    }
}
