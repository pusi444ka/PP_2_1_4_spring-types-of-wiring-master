package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class Ocean1 {

    @Autowired
    private Island2 island;

    @Override
    public String toString() {
        return "на океане остров " + island.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Ocean1 ocean1 = (Ocean1) o;
        return Objects.equals(island, ocean1.island);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(island);
    }
}
