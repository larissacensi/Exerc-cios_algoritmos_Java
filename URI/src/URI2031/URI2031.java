/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI2031;

import java.util.Scanner;

/**
 *
 * @author larissa.pelenci
 */
public class URI2031 {
    public static void run (){
        int i=0,j;
        pedraPapelAtaque jokenpo = new pedraPapelAtaque();
        Scanner reader;
        reader = new Scanner (System.in);
        String[] sinal = new String[2];
        int qntd = jokenpo.lerQuantidade();
        for(int l=0; l<qntd; l++){
            for(j=0;j<2;j++){
                sinal[j] = reader.nextLine();
            }
        String vencedor = jokenpo.verificarVencedor(sinal);
        i++;
        }
    }
}
