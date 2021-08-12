package ejercicio1;

public class Perro extends Animal {
    public Perro() {
    }
    


    public Perro(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override 
    public void Alimentarse() {
        System.out.print("Soy un perro y ");
        System.out.println("Me alimento con " + alimento);
    }
    

   
}
