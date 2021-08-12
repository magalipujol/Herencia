package ejercicio1;

public class Animal {
    protected String nombre;
              String alimento;
              Integer edad;
              String raza;

    public Animal() {
    }

    public Animal(String nombre, String alimento, Integer edad, String raza) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlimento() {
        return this.alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public Integer getEdad() {
        return this.edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return this.raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", alimento='" + getAlimento() + "'" +
            ", edad='" + getEdad() + "'" +
            ", raza='" + getRaza() + "'" +
            "}";
    }

    public void Alimentarse() {
        System.out.println("Me alimento con " + alimento);
    }
}
