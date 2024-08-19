import org.testng.Assert;
import org.testng.annotations.Test;

public class MuhasebeTest {

    @Test
    public void testMaasHesaplama() {

        Odev5 muhasebe = new Odev5();

        double gercekMaas = muhasebe.hesapla(40, 25); // Örneğin: 40 saat çalışılmış, saatlik ücret 25 TL
        double beklenenMaas = 1000.0; // 40 * 25 = 1000 TL

        Assert.assertEquals(gercekMaas, beklenenMaas, "Maaş hesaplaması doğru değil.");
    }
}