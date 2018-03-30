package testing.lab1.scene;

public class FlatAdjective extends Adjective {
    public FlatAdjective() {
        super("flat");
    }

    @Override
    public String toString() {
        return this.getAdjective();
    }
}
