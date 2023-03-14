public class Escudo extends Cromo{

    private String nombreEquipo;
    private int annoFundacion;
    private int numJugadores;

    public Escudo(int id, String nombreEquipo, int annoFundacion, int numJugadores ) {
        super(id,nombreEquipo);
        this.nombreEquipo = nombreEquipo;
        this.annoFundacion = annoFundacion;
        this.numJugadores = numJugadores;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public int getAnnoFundacion() {
        return annoFundacion;
    }

    public int getNumJugadores() {
        return numJugadores;
    }
}
