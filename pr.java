https://www.codewars.com/kata/5b043e3886d0752685000009/train/java

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

// TODO: Replace examples and use TDD development by writing your own tests

public class SolutionTest {
    @Test
    public void simpleTests() {
        assertEquals(10, PizzaPayments.michaelPays(15), 0.0);
        assertEquals(4, PizzaPayments.michaelPays(4), 0.0);
        assertEquals(20, PizzaPayments.michaelPays(30), 0.0);
        assertEquals(70, PizzaPayments.michaelPays(80), 0.0);
        assertEquals(14.67, PizzaPayments.michaelPays(22), 0.0);
        assertEquals(3.95, PizzaPayments.michaelPays(5.9181), 0.0);
        assertEquals(19.19, PizzaPayments.michaelPays(28.789), 0.0);
        assertEquals(4.33, PizzaPayments.michaelPays(4.325), 0.0);       
    }
}



import java.util.*;

public class PizzaPayments {
  public static double michaelPays(double cost) {
    
    if(cost < 5){
      cost = Math.round(cost * 100.0) / 100.0;
    }else if(cost > 5 && cost < 30){
      cost -= cost * 1 / 3;
      cost = Math.round(cost * 100.0) / 100.0;
    }else if(cost >= 30){
      cost = cost - 10;
      cost = Math.round(cost * 100.0) / 100.0;
    }
    
    
    return cost ;
  }
