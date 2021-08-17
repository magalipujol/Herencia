package extra1;

public class Barco {
//     matrícula, su eslora en metros y año de 
// fabricación.

    protected String matricula;
              Integer eslora;
              Integer anioDeFabricacion;
              Integer modulo;
    

    public Barco() {
    }

    public Barco(String matricula, Integer eslora, Integer anioDeFabricacion) {
        Integer modulo = eslora * 10;
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioDeFabricacion = anioDeFabricacion;
        this.modulo = modulo;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Integer getEslora() {
        return this.eslora;
    }

    public void setEslora(Integer eslora) {
        this.eslora = eslora;
    }

    public Integer getModulo() {
        return this.modulo;
    }

    public void setModulo(Integer modulo) {
        this.modulo = modulo;
    }

    public Integer getAnioDeFabricacion() {
        return this.anioDeFabricacion;
    }

    public void setAnioDeFabricacion(Integer anioDeFabricacion) {
        this.anioDeFabricacion = anioDeFabricacion;
    }

    @Override
    public String toString() {
        return "{" +
            " matricula='" + getMatricula() + "'" +
            ", eslora='" + getEslora() + "'" +
            ", anioDeFabricacion='" + getAnioDeFabricacion() + "'" +
            "}";
    }

    
    
}
