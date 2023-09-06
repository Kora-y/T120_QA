package solvedQuestions.P01;

public class Dikdortgen extends Sekil{
    public Dikdortgen(double uzunKenar, double kisaKenar) {
        super(uzunKenar, kisaKenar);
    }


    @Override
    public String toString() {
        return  "uzunKenar=" + uzunKenar + ", kisaKenar=" + kisaKenar + "çevresi=" +cevreHesaplama(uzunKenar,kisaKenar) + "alanı = " +
                alanHesapla(uzunKenar,kisaKenar);
    }
}
