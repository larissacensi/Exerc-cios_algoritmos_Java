package Uri1151T;
import URI1151.Fibonacci;
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

public class Uri1151T {
    
    @Test
    public void testeCom5() {
        Fibonacci fibonacci = new Fibonacci();
        int numero = 5;
        String RESULTADO_ESPERADO = "0 1 1 2 3";
        String resultadoObtido = fibonacci.gerarFibonacci(numero);
        assertEquals(RESULTADO_ESPERADO, resultadoObtido);
    }
    
}

