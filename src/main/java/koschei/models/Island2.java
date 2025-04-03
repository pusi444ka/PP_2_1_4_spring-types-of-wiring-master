package koschei.models;

import java.util.Objects;

public class Island2 {
    private Wood3 wood;

    public Island2(Wood3 wood) {
        this.wood = wood;
    }

    @Override
    public String toString() {
        return ", на острове дерево " + wood.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Island2 island2 = (Island2) o;
        return Objects.equals(wood, island2.wood);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(wood);
    }
}
