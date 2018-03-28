package testing.lab1.scene;

public class Person extends SceneObject {

    public Person(String objectName) {
        super(objectName);
    }

    @Override
    public String toString() {
        return "Person " + getObjectName();
    }
}
