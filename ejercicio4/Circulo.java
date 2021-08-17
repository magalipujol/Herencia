package ejercicio4;

public class Circulo implements calculosFormas {
    private double radio;
            double diametro;


    public Circulo() {
    }

    public Circulo(double radio, double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }

    public double getRadio() {
        return this.radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return this.diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    @Override
    public String toString() {
        return "{" +
            " radio='" + getRadio() + "'" +
            ", diametro='" + getDiametro() + "'" +
            "}";
    }
    
    @Override
    public double calcularPerimetro() {
        return (pi * this.diametro);
    };

    @Override
    public double calcularArea() {
        return (pi * (Math.pow(this.radio, 2)));
    };

}
