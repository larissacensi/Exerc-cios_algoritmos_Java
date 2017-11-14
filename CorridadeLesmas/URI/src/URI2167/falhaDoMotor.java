package URI2167;

/**
 *
 * @author Larissa Censi
 */

public class falhaDoMotor {
      public int falha(int[]rotacoesMinutos){
        int i,c=1, caso=0;
        for(i=1;i<rotacoesMinutos.length;i++){
            if(rotacoesMinutos[i]<rotacoesMinutos[i-1]) {
                caso = i;
                c++;
               break;
            } 
        } 
       
        if (c>=2){
            return caso+1;
        } else {
            return caso;
        }    
    }
}
