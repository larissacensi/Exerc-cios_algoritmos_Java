/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1960;

import java.util.Scanner;

/**
 *
 * @author larissa.pelenci
 */
public class URI1960 {
    public static void run (){
        NumerosRomanos NRomanos = new NumerosRomanos();
        Scanner reader;
        reader = new Scanner(System.in);
        System.out.println("Digite um numero");
        String num = reader.nextLine();
        String romano = NRomanos.numerosRomanos(num);
    }
}
