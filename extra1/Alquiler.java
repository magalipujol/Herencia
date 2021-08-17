package extra1;

import java.time.LocalDate;

public class Alquiler {
//     nombre,  documento  del  cliente,  la  fecha  de  alquiler,  fecha  de 
// devolución, la posición del amarre y el barco que lo ocupará

    private String nombre;
    private Integer DNICliente;
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;
    private Integer posicionAmarre;
    private Barco barcoOcupante;

    

    public Alquiler() {
    }

    public Alquiler(String nombre, Integer DNICliente, LocalDate fechaAlquiler, LocalDate fechaDevolucion, Integer posicionAmarre, Barco barcoOcupante) {
        this.nombre = nombre;
        this.DNICliente = DNICliente;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barcoOcupante = barcoOcupante;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDNICliente() {
        return this.DNICliente;
    }

    public void setDNICliente(Integer DNICliente) {
        this.DNICliente = DNICliente;
    }

    public LocalDate getFechaAlquiler() {
        return this.fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return this.fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Integer getPosicionAmarre() {
        return this.posicionAmarre;
    }

    public void setPosicionAmarre(Integer posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barco getBarcoOcupante() {
        return this.barcoOcupante;
    }

    public void setBarcoOcupante(Barco barcoOcupante) {
        this.barcoOcupante = barcoOcupante;
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", DNICliente='" + getDNICliente() + "'" +
            ", fechaAlquiler='" + getFechaAlquiler() + "'" +
            ", fechaDevolucion='" + getFechaDevolucion() + "'" +
            ", posicionAmarre='" + getPosicionAmarre() + "'" +
            ", barcoOcupante='" + getBarcoOcupante() + "'" +
            "}";
    }

    public Integer calcularAlquiler() {
        Integer diasAlquiler = fechaDevolucion.compareTo(fechaAlquiler);
        System.out.println("dias " + diasAlquiler);
        Integer precioAlquiler = barcoOcupante.getModulo() * diasAlquiler;
        System.out.println("modulo " + barcoOcupante.getModulo());
        return precioAlquiler;
    }
    

}
