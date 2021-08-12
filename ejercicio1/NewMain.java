package ejercicio1;

public class NewMain {
    public static void main(String[] args) {
        Animal perro = new Perro("Pipo", "DogAdiós", 3, "Humano");
        perro.Alimentarse();

        Animal gato = new Gato("Michi", "Sobrecito", 2, "DeLaCallePapá");
        gato.Alimentarse();

        Animal caballo = new Caballo("Tiro al blanco", "mortadela", 12, "Pura sangre");
        caballo.Alimentarse();
    }
    
}