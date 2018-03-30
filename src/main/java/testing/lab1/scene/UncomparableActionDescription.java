package testing.lab1.scene;

public class UncomparableActionDescription extends ActionDescription {
    private String uncomparableReason;

    public UncomparableActionDescription(String reason) {
        super("");
        uncomparableReason = reason;
    }

    public String getUncomparableReason() {
        return uncomparableReason;
    }

    @Override
    public String toString() {
        return "as ... unable to find comparison, since " + uncomparableReason;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UncomparableActionDescription that = (UncomparableActionDescription) o;

        return uncomparableReason != null ? uncomparableReason.equals(that.uncomparableReason) : that.uncomparableReason == null;
    }

    @Override
    public int hashCode() {
        return uncomparableReason != null ? uncomparableReason.hashCode() : 0;
    }
}
