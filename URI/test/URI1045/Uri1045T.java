package URI1045;
import URI1045.DefinirTriangulo;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author larissa.pelenci
 */
public class Uri1045T {
        
    @Test
    public void teste1(){
        System.out.println("Valores de A, B e C   7.0 5.0 7.0");
        DefinirTriangulo define = new DefinirTriangulo();
        String expResult ="TRIANGULO ACUTANGULO\n"+"TRIANGULO ISOSCELES\n";
        String result = define.verifica(7.0, 5.0, 7.0);
        assertEquals(expResult, result);
    }
    
    @Test
    public void teste2(){
        System.out.println("Valores de A, B e C   6.0 6.0 10.0");
        DefinirTriangulo define = new DefinirTriangulo();
        String expResult ="TRIANGULO OBTUSANGULO\n" + "TRIANGULO ISOSCELES\n";
        String result = define.verifica(6.0, 6.0, 10.0);
        assertEquals(expResult, result);
    }
    @Test
    public void teste3(){
        System.out.println("Valores de A, B e C  6.0 6.0 6.0");
        DefinirTriangulo define = new DefinirTriangulo();
        String expResult ="TRIANGULO ACUTANGULO\n"+"TRIANGULO EQUILATERO\n";
        String result = define.verifica(6.0, 6.0, 6.0);
        assertEquals(expResult, result);
    }
    
    @Test
    public void teste4(){
        System.out.println("Valores de A, B e C   5.0 7.0 2.0");
        DefinirTriangulo define = new DefinirTriangulo();
        String expResult ="NAO FORMA UM TRIANGULO\n";
        String result = define.verifica(5.0, 7.0, 2.0);
        assertEquals(expResult, result);
    }
    
    @Test
    public void teste5(){
        System.out.println("Valores de A, B e C   6.0 8.0 10.0");
        DefinirTriangulo define = new DefinirTriangulo();
        String expResult ="TRIANGULO RETANGULO\n";
        String result = define.verifica(6.0, 8.0, 10.0);
        assertEquals(expResult, result);
    }
}
