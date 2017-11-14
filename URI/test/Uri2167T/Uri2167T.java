package Uri2167T;
import URI2167.falhaDoMotor;
import URI2167.falhaDoMotor;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Larissa Censi
 */

public class Uri2167T {
    
    @Test
    public void test1() {
        System.out.println("3");
        falhaDoMotor motor = new falhaDoMotor();
        int[] teste = {1,4,2};
        int expResult = 3;
        int result = motor.falha(teste);
        assertEquals(expResult, result);
    }
    
    @Test
    public void test2() {
        System.out.println("5");
        falhaDoMotor motor = new falhaDoMotor();
        int[] teste = {100,199,199,198,0};
        int expResult = 4;
        int result = motor.falha(teste);
        assertEquals(expResult, result);
    }
    
    @Test
    public void test3() {
        System.out.println("4");
        falhaDoMotor motor = new falhaDoMotor();
        int[] teste = {1,2,2,2};
        int expResult = 0;
        int result = motor.falha(teste);
        assertEquals(expResult, result);
    }
}

