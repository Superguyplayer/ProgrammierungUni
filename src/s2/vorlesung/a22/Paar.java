package s2.vorlesung.a22;

public class Paar<T, U> {

    protected T valueT;
    protected U valueU;

    public void setValueT(T valueT) {
        this.valueT = valueT;
    }

    public T getValueT() {
        return valueT;
    }

    public void setValueU(U valueU) {
        this.valueU = valueU;
    }

    public U getValueU() {
        return valueU;
    }

    @Override
    public String toString() {
        return "(" + valueT +
                ", " + valueU +
                ')';
    }
}
