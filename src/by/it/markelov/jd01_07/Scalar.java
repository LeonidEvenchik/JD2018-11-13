package by.it.markelov.jd01_07;

class Scalar extends Var {
    private double value;

    public Scalar(double value) {
        this.value = value;
    }

    public Scalar(Scalar scalar) {
        value = scalar.value;
    }

    public Scalar(String str) {
        value = Double.parseDouble(str);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(value);
        return sb.toString();

    }
}
