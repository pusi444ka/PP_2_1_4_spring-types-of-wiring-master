package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class Needle7 {
    private Deth8 deth;

    @Autowired
    public void setDeth(Deth8 deth) {
        this.deth = deth;
    }

    @Override
    public String toString() {
        return ", смерть Кощея на игле :( " + "";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Needle7 needle7 = (Needle7) o;
        return Objects.equals(deth, needle7.deth);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(deth);
    }
}
