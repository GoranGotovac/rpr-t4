package ba.unsa.etf.rprtutorijal4;

import java.util.HashSet;
import java.util.Set;

public class Fakultet {
    public Set<Predmet> predmeti = new HashSet<>();
    public Set<Upis> upisi = new HashSet<>();
    public Set<Student> studenti = new HashSet<>();
    public void dodajStudenta(Student student) {
        studenti.add(student);
    }
    public void dodajPredmet(Predmet predmet) {
        predmeti.add(predmet);
    }
    public void setUpis(Upis upis) {
        predmeti.add(upis.getPredmet());
        studenti.add(upis.getStudent());
        upisi.add(upis);
    }
    public String ispisi(Predmet p) {
        String spisakStudenata = "";
        for (Upis upis: upisi) {
            if(upis.getPredmet().equals(p))
            spisakStudenata += upis.getStudent().getIme() + " " + upis.getStudent().getBrojIndexa()+"\n";
        }
        return spisakStudenata;
    }
}
