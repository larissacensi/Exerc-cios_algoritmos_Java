package Uri1114T;
import URI1114.verificarSenha;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author larissa.pelenci
 */

public class Uri1114T {
    
    @Test
    public void teste1(){
        System.out.println("Digitando senha 2200");
        verificarSenha verifica = new verificarSenha();
        String expResult = "Senha Invalida" ; // Retorna que a senha é invalida
        String result = verifica.Senha(2200);
        assertEquals(expResult, result);
    }
    
    @Test
    public void teste2(){
        System.out.println("Digitando senha 1020");
        verificarSenha verifica = new verificarSenha();
        String expResult = "Senha Invalida" ;
        String result = verifica.Senha(1020);
        assertEquals(expResult, result);
    }
    
    @Test
    public void teste3(){
        System.out.println("Digitando senha 2022");
        verificarSenha verifica = new verificarSenha();
        String expResult = "Senha Invalida" ;
        String result = verifica.Senha(2022);
        assertEquals(expResult, result);
    }
    
    @Test
    public void teste4(){
        System.out.println("Digitando senha 2002");
        verificarSenha verifica = new verificarSenha();
        String expResult = "Acesso permitido"; // Acesso permitido
        String result = verifica.Senha(2002);
        assertEquals(expResult, result);
    }

}
