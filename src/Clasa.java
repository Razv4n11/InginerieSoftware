import java.util.List;

public class Clasa {
    int capacitate;
    NumarClasa numar;
    char litera;
    List<Elev> elevi;

    public void adaugaElev(Elev elev) {
        elevi.add(elev);
    }

    public void eliminaElev(Elev elev) {
        elevi.remove(elev);
    }

    public int getTotalElevi() {
        return elevi.size();
    }

}
