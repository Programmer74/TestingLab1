package scene;

public class Person extends SceneObject {

    public Person(String objectName) {
        super(objectName);
    }

    @Override
    public String toString() {
        return "Person " + getObjectName();
    }
}
