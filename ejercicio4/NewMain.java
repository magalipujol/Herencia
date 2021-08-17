package ejercicio4;

public class NewMain {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(1, 2);

        System.out.println(circulo);
        System.out.println("Area: " + circulo.calcularArea());
        System.out.println("Perimetro: " + circulo.calcularPerimetro());

        Rectangulo rectangulo = new Rectangulo(1, 2);

        System.out.println(rectangulo);
        System.out.println("Area: " + rectangulo.calcularArea());
        System.out.println("Perimetro: " + rectangulo.calcularPerimetro());


    }

}