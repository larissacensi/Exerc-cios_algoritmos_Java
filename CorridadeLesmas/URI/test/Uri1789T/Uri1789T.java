/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uri1789T;
import URI1789.CorridadeLesmas;
import URI1789.CorridadeLesmas;
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

public class Uri1789T {
    
  @Test
    public void teste1(){
        System.out.println("Velocidades: 10 10 10 10 15 18 20 15 11 10");
        CorridadeLesmas CorridaLesmas = new CorridadeLesmas();
        int expResult = 3; 
        int[] lesmas = {10, 10, 10, 10, 15, 18, 20, 15, 11, 10};
        int result = CorridaLesmas.verificarVelocidades(lesmas);
        assertEquals(expResult, result);
    }
    
    @Test
    public void teste2(){
        System.out.println("Velocidades: 1 5 2 9 5 5 8 4 4 3");
        CorridadeLesmas CorridaLesmas = new CorridadeLesmas();
        int expResult = 1; 
        int[] lesmas = {1, 5, 2, 9, 5, 5, 8, 4, 4, 3};
        int result = CorridaLesmas.verificarVelocidades(lesmas);
        assertEquals(expResult, result);;
    }
    
    @Test
    public void teste3(){
        System.out.println("Velocidades: 19 9 1 4 5 8 6 11 9 7");
        CorridadeLesmas CorridaLesmas = new CorridadeLesmas();
        int expResult = 2; 
        int[] lesmas = {19, 9, 1, 4, 5, 8, 6, 11, 9, 7};
        int result = CorridaLesmas.verificarVelocidades(lesmas);
        assertEquals(expResult, result);
    }
}