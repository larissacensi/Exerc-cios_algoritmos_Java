/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1042;
import java.util.Scanner;

/**
 *
 * @author larissa.pelenci
 */
public class URI1042 {
    public static void run (){
       Ordenar orde = new Ordenar();
       Scanner reader;
       reader = new Scanner (System.in);
       int num1 = reader.nextInt();
       int num2 = reader.nextInt();
       int num3 = reader.nextInt();
       int[] ordenado = orde.imprimeNumeros(num1,num2,num3);
       System.out.println();
      for(int num : ordenado){
         System.out.println(num);
      }
  
    }
    
}
