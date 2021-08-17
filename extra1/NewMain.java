package extra1;
import java.time.LocalDate;

public class NewMain {
    public static void main(String[] args) {
        LocalDate fechaAlquiler = LocalDate.of(2020, 1, 8);
        LocalDate fechaDevolucion = LocalDate.of(2020, 1, 10);


        Barco barco = new Barco("hola", 2, 1000);
        Barco velero = new Velero(1, "hola", 3, 1000);
        Barco motor = new BarcoAMotor(3, "hola", 4, 1);

        Alquiler alquiler1 = new Alquiler("hola", 1, fechaAlquiler, fechaDevolucion, 1, barco);
        Alquiler alquiler2 = new Alquiler("hola", 1, fechaAlquiler, fechaDevolucion, 1, velero);
        Alquiler alquiler3 = new Alquiler("hola", 1, fechaAlquiler, fechaDevolucion, 1, motor);

        System.out.println(alquiler1.calcularAlquiler());
        System.out.println("---------------");
        System.out.println(alquiler2.calcularAlquiler());
        System.out.println("---------------");
        System.out.println(alquiler3.calcularAlquiler());

       
    }

}
