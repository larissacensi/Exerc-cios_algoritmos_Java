package URI1114;

import java.util.Scanner;

/**
 *
 * @author larissa.pelenci
 */
public class verificarSenha {

    public String Senha(int num){
        StringBuilder builder = new StringBuilder();
        while (num != 2002){
            builder.append("Senha Invalida");
            return (builder.toString());
        }
        builder.append("Acesso permitido");  
        return (builder.toString());
        
    }
}
