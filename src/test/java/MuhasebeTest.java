import org.testng.Assert;
import org.testng.annotations.Test;

public class MuhasebeTest {

    @Test
    public void testMaasHesaplama() {
        // MuhasebeProje sınıfı ve metodunun var olduğunu varsayıyoruz
        MuhasebeProje muhasebe = new MuhasebeProje();

        double gercekMaas = muhasebe.hesaplaMaas(40, 25); // Örneğin: 40 saat çalışılmış, saatlik ücret 25 TL
        double beklenenMaas = 1000.0; // 40 * 25 = 1000 TL

        Assert.assertEquals(gercekMaas, beklenenMaas, "Maaş hesaplaması doğru değil.");
    }
}