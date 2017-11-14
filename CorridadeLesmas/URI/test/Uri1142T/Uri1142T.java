package Uri1142T;

import URI1142.PUM;
import URI1142.PUM;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Larissa Censi
 */
public class Uri1142T {

    @Test
    public void testeComUmaUnicaLinha() {
        PUM pum = new PUM();
        final int VEZES = 1;
        final String RESULTADO_ESPERADO = "1 2 3 PUM\n";
        String resultadoObtido = pum.sequencia(VEZES);
        assertEquals(RESULTADO_ESPERADO, resultadoObtido);
    }
    
    @Test
    public void testeComDuasLinhas() {
        PUM pum = new PUM();
        final int VEZES = 2;
        final String RESULTADO_ESPERADO = "1 2 3 PUM\n5 6 7 PUM\n";
        String resultadoObtido = pum.sequencia(VEZES);
        assertEquals(RESULTADO_ESPERADO, resultadoObtido);
    }

}
