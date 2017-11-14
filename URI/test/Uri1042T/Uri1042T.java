/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uri1042T;
import URI1042.Ordenar;
import org.junit.Test;
import static org.junit.Assert.*;

public class Uri1042T {
    
    @Test
    public void teste1(){
        System.out.println("sort 7 21 -14");
        Ordenar ordena = new Ordenar();
        int[] expResult = {-14, 7, 21};
        int[] result = ordena.imprimeNumeros(7, 21, -14);
        assertArrayEquals(expResult, result);
    }
    
    @Test
    public void teste2(){
        System.out.println("sort -14 21 7");
        Ordenar ordena = new Ordenar();
        int[] expResult = {-14, 7, 21};
        int[] result = ordena.imprimeNumeros(-14, 21, 7);
        assertArrayEquals(expResult, result);
    }
}