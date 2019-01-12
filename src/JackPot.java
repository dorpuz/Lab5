import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class JackPot {
    int a, b, c;

    public JackPot(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "JackPot{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JackPot jackPot = (JackPot) o;
        return a == jackPot.a &&
                b == jackPot.b &&
                c == jackPot.c;
    }

    @Override
    public int hashCode() {

        return Objects.hash(a, b, c);
    }
}
