package solvedQuestions.P01;

public class Cember extends Sekil {

    public Cember(double yariCap) {
        super(yariCap);
    }

    @Override
    public String toString() {
        return "yariCap=" + yariCap + "Alan = " + alanHesaplama(yariCap) + " Çevre = " + cevreHesaplama(yariCap);
    }
}
