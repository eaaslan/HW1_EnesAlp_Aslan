package HW1;

import java.util.Objects;

public class Pair implements Comparable<Pair> {
    private String t1;
    private String t2;
    private double factor;

    public Pair(String t1, String t2, double factor) {
        this.t1 = t1;
        this.t2 = t2;
        this.factor = factor;
    }

    public String getT1() {
        return t1;
    }

    public void setT1(String t1) {
        this.t1 = t1;
    }

    public String getT2() {
        return t2;
    }

    public void setT2(String t2) {
        this.t2 = t2;
    }

    public double getFactor() {
        return factor;
    }

    public void setFactor(double factor) {
        this.factor = factor;
    }

    @Override
    public String toString() {
        return "HW1.Pair{" +
                "t1='" + t1 + '\'' +
                ", t2='" + t2 + '\'' +
                ", factor=" + factor +
                '}';
    }

    @Override
    public int compareTo(Pair o) {
        if (o.factor > factor)
            return 1;
        else if (o.factor < factor)
            return -1;
        else
            return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair pair = (Pair) o;
        return Double.compare(pair.factor, factor) == 0 &&
                Objects.equals(t1, pair.t1) &&
                Objects.equals(t2, pair.t2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(t1, t2, factor);
    }
}
