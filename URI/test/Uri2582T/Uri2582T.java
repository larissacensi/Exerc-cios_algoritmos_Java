package Uri2582T;
import URI2582.EscolhaDasMusicas;
import URI2582.EscolhaDasMusicas;
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
public class Uri2582T {
    
    @Test
    public void teste1() {
        EscolhaDasMusicas musica = new EscolhaDasMusicas();
        int[] botoes = {3,4};
        final String RESULTADO_ESPERADO = "SALT\n";
        String resultadoObtido = musica.verificarMusica(botoes);
        assertEquals(RESULTADO_ESPERADO, resultadoObtido);
    }
    @Test
    public void teste2() {
        EscolhaDasMusicas musica = new EscolhaDasMusicas();
        int[] botoes = {0,0};
        final String RESULTADO_ESPERADO = "PROXYCITY\n";
        String resultadoObtido = musica.verificarMusica(botoes);
        assertEquals(RESULTADO_ESPERADO, resultadoObtido);
    }
    @Test
    public void teste3() {
        EscolhaDasMusicas musica = new EscolhaDasMusicas();
        int[] botoes = {1,0};
        final String RESULTADO_ESPERADO = "P.Y.N.G.\n";
        String resultadoObtido = musica.verificarMusica(botoes);
        assertEquals(RESULTADO_ESPERADO, resultadoObtido);
    }
}
