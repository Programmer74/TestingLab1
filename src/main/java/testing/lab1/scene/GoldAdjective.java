package testing.lab1.scene;

public class GoldAdjective extends Adjective {
    public GoldAdjective() {
        super("gold");
    }

    @Override
    public String toString() {
        return this.getAdjective();
    }
}
