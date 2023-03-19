import java.util.HashMap;
import java.util.Map;

public class Mazo {

    private Map<Cromo, Integer> mazo;

    public Mazo() {
        this.mazo = new HashMap<>();
    }

    public Map<Cromo, Integer> getMazo() {
        return mazo;
    }

    public void addCromo(Cromo cromo) {
        int index = 0;
        for (Cromo c : mazo.keySet()) {
            if (mazo.containsKey(cromo)) {
                index++;
            }
        }
        mazo.put(cromo, index);
    }

    public void intercambioCromo() {

    }

}
