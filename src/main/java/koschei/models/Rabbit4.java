package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class Rabbit4 {

    private Duck5 duck;

    @Autowired
    public Rabbit4(Duck5 duck) {
        this.duck = duck;
    }

    @Override
    public String toString() {
        return ", в зайце утка " + duck.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Rabbit4 rabbit4 = (Rabbit4) o;
        return Objects.equals(duck, rabbit4.duck);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(duck);
    }


}
