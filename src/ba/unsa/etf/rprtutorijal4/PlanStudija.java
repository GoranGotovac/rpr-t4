package ba.unsa.etf.rprtutorijal4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PlanStudija {
    public Map<Integer, ArrayList<Predmet>> mapa = new HashMap<>();

    public void dodajPredmet(int semestar, Predmet predmet) {
        ArrayList<Predmet> predmeti = new ArrayList<>();
        if(mapa.isEmpty()) {
            predmeti.add(predmet);
            mapa.put(semestar, predmeti);
        }
        else {
            for (Map.Entry<Integer, ArrayList<Predmet>> m: mapa.entrySet()) {
                if(m.getKey().equals(semestar)) {
                    m.getValue().add(predmet);
                }
            }
        }
    }
}
