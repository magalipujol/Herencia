package ejercicio4;

public class Rectangulo implements calculosFormas {
    private double base;
            double altura;


    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return this.base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "{" +
            " base='" + getBase() + "'" +
            ", altura='" + getAltura() + "'" +
            "}";
    }
    

    @Override
    public double calcularPerimetro() {
        return ((this.base + this.altura) * 2);
    };

    @Override
    public double calcularArea() {
        return (this.base * this.altura);
    };
}
