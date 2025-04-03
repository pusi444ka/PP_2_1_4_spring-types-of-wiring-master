package koschei.models;


import java.util.Objects;

public class Duck5 {
    private Egg6 egg;

    public Duck5(Egg6 egg) {
        this.egg = egg;
    }

    @Override
    public String toString() {
        return ", в утке яйцо " + egg.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Duck5 duck5 = (Duck5) o;
        return Objects.equals(egg, duck5.egg);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(egg);
    }
}
