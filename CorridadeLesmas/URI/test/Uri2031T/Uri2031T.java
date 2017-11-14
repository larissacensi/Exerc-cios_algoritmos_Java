package Uri2031T;
import URI2031.pedraPapelAtaque;
import URI2031.pedraPapelAtaque;
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

public class Uri2031T {
    
  @Test
    public void teste1(){
        System.out.println("Teste com pedra vs pedra");
        pedraPapelAtaque jokenpo = new pedraPapelAtaque();
        String[] sinal = new String[2];
        sinal[0]="pedra";
        sinal[1]="pedra";
        String expResult = "Sem ganhador"; 
        String result = jokenpo.verificarVencedor(sinal);
        assertEquals(expResult, result);
    }
    
    @Test
    public void teste2(){
        System.out.println("Teste com ataque vs papel");
        pedraPapelAtaque jokenpo = new pedraPapelAtaque();
        String[] sinal = new String[2];
        sinal[0]="ataque";
        sinal[1]="papel";
        String expResult = "Jogador 1 venceu";
        String result = jokenpo.verificarVencedor(sinal);
        assertEquals(expResult, result);
    }
}

