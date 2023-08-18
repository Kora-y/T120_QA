package day34_inheritance;

public class BToyota extends Araba{

    //parent classtaki bazı özellikleri update edebiliriz
    String marka = "Toyota";
    String uretimYeri = "Toyota araclar Japonya ve Turkiye'de üretilir.";

    // parent classta olmayan yeni özellikler ekleyebiliriz

    String lastik = "Tüm toyota araçlar pirelli lastik kullanır";
    String guvenlik = "Tum toyota araçlar extra guvenlik içerir.";

    String fren = "Toyota araçlar abs fren sistemi kullanır.";
}
