package ba.unsa.etf.rprtutorijal4;

public class Predmet {
    public String nazivPredmeta;
    public int brojECTS;
    public boolean obavezni;
    public Predmet(String ime, int broj, boolean obavezni) {}

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public int getBrojECTS() {
        return brojECTS;
    }

    public boolean isObavezni() {
        return obavezni;
    }
}
