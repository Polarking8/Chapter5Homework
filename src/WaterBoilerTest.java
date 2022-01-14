import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class WaterBoilerTest {
    @Test
    public void celsiusMetersBoilingTest(){
        WaterBoiler kettle;
        kettle = new WaterBoiler();
        Assertions.assertEquals("boiling", kettle.getState(92, 3000, false, false));
    }
    @Test
    public void fahrenheitFeetLiquidTest(){
        WaterBoiler kettle;
        kettle = new WaterBoiler();
        Assertions.assertEquals("liquid", kettle.getState(197, 8000, true, true));
    }
}
