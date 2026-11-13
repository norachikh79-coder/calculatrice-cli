package dz.univ.calculatrice;

public class Multiplication implements Operation {
    @Override
    public double calculer(double a, double b) {
        return a * b;
    }

    @Override
    public String getNom() {
        return "*";
    }
}