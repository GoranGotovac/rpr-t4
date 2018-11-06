package ba.unsa.etf.rprtutorijal4;

public class Upis {
    public Student student;
    public Predmet predmet;
    public PlanStudija planStudija;
    public Upis(Student student, Predmet predmet, PlanStudija planStudija) {
        this.student = student;
        this.predmet = predmet;
        this.planStudija = planStudija;
    }

    public Student getStudent() {
        return student;
    }

    public Predmet getPredmet() {
        return predmet;
    }

    public PlanStudija getPlanStudija() {
        return planStudija;
    }
}
