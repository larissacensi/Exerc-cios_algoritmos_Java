/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1789;

import java.util.Scanner;

/**
 *
 * @author larissa.pelenci
 */
public class URI1789 {
   public static void run (){ 
        int veloz;
        CorridadeLesmas CorridaLesmas = new CorridadeLesmas();
        Scanner reader;
        reader = new Scanner(System.in);
        System.out.println("Digite a quantidade de lesmas que iram participar da corrida");
        int quantidade = reader.nextInt();
        int[] lesmas = new int[quantidade];
        lesmas = CorridaLesmas.cadastrarLesmas(quantidade);
        int nivel = CorridaLesmas.verificarVelocidades(lesmas);
   }
}
