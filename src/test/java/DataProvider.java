import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider {

    @DataProvider(name = "maasVerileri")
    public Object[][] maasVerileri() {
        return new Object[][] {
                {40, 25, 1000.0},
                {30, 20, 600.0},
                {50, 15, 750.0},
                {45, 30, 1350.0}
        };
    }

    @Test(dataProvider = "maasVerileri")
    public void testMaasHesaplama(int saat, double saatlikUcret, double beklenenMaas) {
        MuhasebeProje muhasebe = new MuhasebeProje();
        double gercekMaas = muhasebe.hesaplaMaas(saat, saatlikUcret);

        Assert.assertEquals(gercekMaas, beklenenMaas, "Maaş hesaplaması doğru değil.");
    }
