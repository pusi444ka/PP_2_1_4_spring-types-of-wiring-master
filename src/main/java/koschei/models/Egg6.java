package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class Egg6 {
    private Needle7 needle;

    @Autowired
    public void setNeedle(Needle7 needle) {
        this.needle = needle;
    }

    @Override
    public String toString() {
        return ", в яйце иголка " + needle.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Egg6 egg6 = (Egg6) o;
        return Objects.equals(needle, egg6.needle);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(needle);
    }
}
