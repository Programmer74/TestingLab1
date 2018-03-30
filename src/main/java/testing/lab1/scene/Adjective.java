package testing.lab1.scene;

public class Adjective {

    private String adjective;

    public Adjective(String adjective) {
        this.adjective = adjective;
    }

    public String getAdjective() {
        return adjective;
    }

    @Override
    public String toString() {
        return "Adjective{" +
                "adjective='" + adjective + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Adjective adjective1 = (Adjective) o;

        return adjective != null ? adjective.equals(adjective1.adjective) : adjective1.adjective == null;
    }

    @Override
    public int hashCode() {
        return adjective != null ? adjective.hashCode() : 0;
    }
}
