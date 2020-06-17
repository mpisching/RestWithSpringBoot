package br.edu.professormap.domain;

public class SimpleMath {
    public Double sum(Double n1, Double n2) { return n1 + n2; }

    public Double subtract(Double n1, Double n2) {
        return n1 - n2;
    }

    public Double multiply(Double n1, Double n2) {
        return n1 * n2;
    }

    public Double divide(Double n1, Double n2) {
        return n1 / n2;
    }

    public Double media(Double n1, Double n2) {
        return (n1 + n2) / 2D;
    }

    public Double sqrt(Double n1) {
        return java.lang.Math.sqrt(n1);
    }
}
