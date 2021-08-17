package extra1;

public class Velero extends Barco {
    private Integer numeroDeMastiles;


    public Velero() {
    }

    public Velero(Integer numeroDeMastiles, String matricula, Integer eslora, Integer anioDeFabricacion) {
        super(matricula, eslora, anioDeFabricacion);
        setModulo(modulo + numeroDeMastiles);
        this.numeroDeMastiles = numeroDeMastiles;
    }


    public Integer getNumeroDeMastiles() {
        return this.numeroDeMastiles;
    }

    public void setNumeroDeMastiles(Integer numeroDeMastiles) {
        this.numeroDeMastiles = numeroDeMastiles;
    }

    @Override
    public String toString() {
        return "{" +
            " numeroDeMastiles='" + getNumeroDeMastiles() + "'" +
            "}";
    }


}
