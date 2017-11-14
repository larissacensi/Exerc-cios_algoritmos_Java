package Uri1960T;
import URI1960.NumerosRomanos;
import URI1960.NumerosRomanos;
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
public class Uri1960T {

    @Test
    public void teste1() {
        System.out.println("Numero 666");
        NumerosRomanos NRomanos = new NumerosRomanos();
        String num = "666";
        String expResult = "DCLXVI";
        String result = NRomanos.numerosRomanos(num);
        assertEquals(expResult, result);
    }

    @Test
    public void teste2() {
        System.out.println("Numero 83");
        NumerosRomanos NRomanos = new NumerosRomanos();
        String num = "83";
        String expResult = "LXXXIII";
        String result = NRomanos.numerosRomanos(num);
        assertEquals(expResult, result);
    }

    @Test
    public void teste3() {
        System.out.println("Numero 999");
        NumerosRomanos NRomanos = new NumerosRomanos();
        String num = "999";
        String expResult = "CMXCIX";
        String result = NRomanos.numerosRomanos(num);
        assertEquals(expResult, result);
    }
}
