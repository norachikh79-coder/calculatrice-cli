package dz.univ.calculatrice;

public class Division implements Operation {
    @Override
    public double calculer(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division par zéro impossible");
        }
        return a / b;
    }

    @Override
    public String getNom() {
        return "/";
    }
}