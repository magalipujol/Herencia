package extra1;

public class BarcoAMotor extends Barco {
    private Integer potenciaEnCV;
    

    public BarcoAMotor() {
    }

    public BarcoAMotor(Integer potenciaEnCV, String matricula, Integer eslora, Integer anioDeFabricacion) {
        super(matricula, eslora, anioDeFabricacion);
        setModulo(modulo + potenciaEnCV);
        this.potenciaEnCV = potenciaEnCV;
    }

    public Integer getPotenciaEnCV() {
        return this.potenciaEnCV;
    }

    public void setPotenciaEnCV(Integer potenciaEnCV) {
        this.potenciaEnCV = potenciaEnCV;
    }

    @Override
    public String toString() {
        return "{" +
            " potenciaEnCV='" + getPotenciaEnCV() + "'" +
            "}";
    }
    
}
