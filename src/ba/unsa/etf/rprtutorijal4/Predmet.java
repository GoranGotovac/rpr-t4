package ba.unsa.etf.rprtutorijal4;

public class Predmet {
    public String nazivPredmeta;
    public int brojECTS;
    public boolean obavezni;
    public Predmet(String nazivPredmeta, int brojECTS, boolean obavezni) {
        this.nazivPredmeta = nazivPredmeta;
        this.obavezni = obavezni;
        this.brojECTS = brojECTS;
    }

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
