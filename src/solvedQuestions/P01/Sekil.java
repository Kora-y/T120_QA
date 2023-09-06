package solvedQuestions.P01;

public class Sekil {
    double uzunKenar;

    double kisaKenar;

    double yariCap;


    public Sekil(double uzunKenar, double kisaKenar) {
        this.uzunKenar = uzunKenar;
        this.kisaKenar = kisaKenar;
    }

    public Sekil(double yariCap) {
        this.yariCap = yariCap;
    }
        double cevreHesaplama(double yariCap) {

            return 2*3.14*yariCap;
        }
        double alanHesaplama(double yariCap) {

        return 3.14*(yariCap*yariCap);
        }

        double cevreHesaplama(double uzunKenar,double kisaKenar) {
        return (kisaKenar+uzunKenar)*2;
        }

        double alanHesapla(double uzunKenar,double kisaKenar){

        return (kisaKenar*uzunKenar);
        }

}
