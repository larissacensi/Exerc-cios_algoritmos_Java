/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1114;

import java.util.Scanner;

/**
 *
 * @author larissa.pelenci
 */
public class URI1114 {
    public static void run (){
        verificarSenha verifica = new verificarSenha();
        Scanner reader;       
        reader = new Scanner (System.in);
        int senhalida = reader.nextInt();
        String senha = verifica.Senha(senhalida);
        System.out.println(senha);
    }
}
