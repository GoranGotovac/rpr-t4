package ba.unsa.etf.rprtutorijal4;

import java.util.ArrayList;
import java.util.Map;

public class PlanStudija {
    public Map<Integer, ArrayList<Predmet>> mapa;
    public ArrayList<Predmet> predmeti;
    public void dodajPredmet(int semestar, Predmet predmet) {
        predmeti.add(predmet);
        mapa.put(semestar,predmeti);
    }
}
