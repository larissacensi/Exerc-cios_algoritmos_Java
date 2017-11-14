package URI1151;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Larissa Censi
 */
public class Fibonacci {
       public String gerarFibonacci(int numero){
        StringBuilder builder = new StringBuilder();
        int n1 = 1, n2 = 0;
        builder.append(n2);
        builder.append(" ");
        builder.append(n1);
        builder.append(" ");
        
            for(int j = 0; j < (numero-2); j++){
                n1 = n1 + n2;
                n2 = n1 - n2;
                builder.append(n1);
                if((j+1) != (numero-2)){
                  builder.append(" ");  
                }
            }
        return builder.toString();
    } 
}
