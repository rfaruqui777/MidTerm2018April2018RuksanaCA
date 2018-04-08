package unit.testing;

import org.testng.Assert;

public class ApplyCalculator {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        Assert.assertEquals(cal.addition(22,10),32);
        Assert.assertEquals(cal.subtraction(22,10),12);
        Assert.assertEquals(cal.multiplication(22,10),220);
    }
}
