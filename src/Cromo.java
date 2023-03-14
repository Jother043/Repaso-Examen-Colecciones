import java.util.Objects;

public class Cromo {

    private int id;
    String nombre;

    public Cromo(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cromo cromo = (Cromo) o;
        return id == cromo.id && Objects.equals(nombre, cromo.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre);
    }
}
