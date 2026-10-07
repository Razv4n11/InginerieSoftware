import java.util.Map;

public class Scoala {
    private Map<String, Clasa> clase;

    public void adaugaClasa(String nume, Clasa clasa) {
        clase.put(nume, clasa);
    }

    public void eliminaClasa(String nume) {
        clase.remove(nume);
    }

    public void adaugaElevInClasa(String numeClasa, Elev elev) {
        Clasa clasa = clase.get(numeClasa);
        if (clasa != null) {
            clasa.adaugaElev(elev);
        }
    }

    public void eliminaElevDupaNume(String numeElev) {
        for (Clasa clasa : clase.values()) {
            for (Elev elev : clasa.elevi) {
                if (elev.nume.equals(numeElev)) {
                    clasa.eliminaElev(elev);
                    return;
                }
            }
        }
    }
    public int getNumarClase() {
        return clase.size();
    }
    public int getTotalElevi() {
        return clase.values().stream()
                .mapToInt(Clasa::getTotalElevi)
                .sum();
    }
}
