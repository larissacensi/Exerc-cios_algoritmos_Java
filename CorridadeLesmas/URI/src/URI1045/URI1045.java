/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1045;
import java.util.Scanner;


/**
 *
 * @author larissa.pelenci
 */
public class URI1045 {
     public static void run(){
      DefinirTriangulo define = new DefinirTriangulo();
      Scanner reader;       
      reader = new Scanner (System.in);
      float a = reader.nextFloat();
      float b = reader.nextFloat();
      float c = reader.nextFloat();
      String triangulo = define.verifica(a, b, c);
      System.out.println(triangulo);
    }
}
