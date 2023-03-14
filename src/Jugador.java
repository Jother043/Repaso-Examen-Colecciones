public class Jugador extends Cromo{

    String nombreJugador;
    String equipo;
    int altura;

    public Jugador(int id, String nombreJugador, String equipo, int altura) {
        super(id, nombreJugador);
        this.nombreJugador=nombreJugador;
        this.equipo = equipo;
        this.altura = altura;
    }

    public void setNombreJugador(String nombreJugador) throws InvalidValuesCromos{
        if(nombreJugador == null || nombreJugador.trim().isEmpty()){
            throw new InvalidValuesCromos("El nombre del jugador no puede estar en blanco");
        }
        this.nombreJugador = nombreJugador;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public String getEquipo() {
        return equipo;
    }

    public int getAltura() {
        return altura;
    }
}
