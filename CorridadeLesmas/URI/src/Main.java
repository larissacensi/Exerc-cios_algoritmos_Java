
import URI1042.URI1042;
import URI1045.URI1045;
import URI1114.URI1114;
import URI1142.URI1142;
import URI1151.URI1151;
import URI1789.URI1789;
import URI1960.URI1960;
import URI2031.URI2031;
import URI2167.URI2167;
import URI2582.URI2582;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author larissa.pelenci
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
       System.out.println("Passe o número de um problema.");
       Scanner reader;
       reader = new Scanner (System.in);
       int uri = reader.nextInt();
       switch(uri){
           case 1042:
               URI1042.run();
               break;
           case 1045:
               URI1045.run();
               break;
           case 1114:
               URI1114.run();
               break;
           case 1142:
               URI1142.run();
               break;
           case 1151:
               URI1151.run();
               break;
           case 1789:
               URI1789.run();
               break;
           case 1960:
               URI1960.run();
               break;
           case 2031:
               URI2031.run();
               break;
            case 2167:
               URI2167.run();
               break;
           case 2582:
               URI2582.run();
               break;
       }
    }
            
}