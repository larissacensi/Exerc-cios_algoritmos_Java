package URI2031;


import java.util.Scanner;

/**
 *
 * @author Larissa Censi
 */


public class pedraPapelAtaque {

    public int lerQuantidade() {
        Scanner reader;
        reader = new Scanner(System.in);
        int qntd = reader.nextInt();
        return qntd;
    }

    public String verificarVencedor(String[] sinal) {
        String[] forma = {"pedra", "papel", "ataque"};
        int jogador1, jogador2, vencedor;
        if (sinal[0].equals(forma[0])) { //se sinal1 for pedra    
            jogador1 = 1;
        } else if (sinal[0].equals(forma[1])) { //se sinal1 for papel    
            jogador1 = 2;
        } else { //se sinal1 for ataque    
            jogador1 = 3;
        }

        if (sinal[1].equals(forma[0])) { //se sinal2 for pedra    
            jogador2 = 1;
        } else if (sinal[1].equals(forma[1])) { //se sinal2 for papel    
            jogador2 = 2;
        } else { //se sinal2 for ataque    
            jogador2 = 3;
        }
        if (jogador1 == 3 && jogador2 != 3) {// Ataque ganha de todos, "Jogador 1 venceu"
            vencedor = 1;
        } else if (jogador2 == 3 && jogador1 != 3) { //ataque ganha de todos, "Jogador 2 venceu"
            vencedor = 2;
        } else if (jogador2 == 3 && jogador1 == 3) { //ataque com ataque, "Aniquilação Mútua"
            vencedor = 5;
        } else if (jogador1 == 1 && jogador2 == 1) { //pedra com pedra, "Sem ganhador"
            vencedor = 3;
        } else if (jogador1 == 2 && jogador2 == 2) {//papel com papel, "Ambos ganham"
            vencedor = 4;
        } else if (jogador1 == 1 && jogador2 == 2) {//pedra com papel, "Jogador 1 venceu"
            vencedor = 1;
        } else {
            vencedor = 2; //papel com pedra, "Jogador 2 venceu"
        }

        String resultado = "";
        switch (vencedor) {
            case 1:
                System.out.print("Jogador 1 venceu");
                resultado = "Jogador 1 venceu";
                System.out.println("");
                break;
            case 2:
                System.out.print("Jogador 2 venceu");
                resultado = "Jogador 2 venceu";
                System.out.println("");
                break;
            case 3:
                System.out.print("Sem ganhador");
                resultado = "Sem ganhador";
                System.out.println("");
                break;
            case 4:
                System.out.print("Ambos venceram");
                resultado = "Ambos venceram";
                System.out.println("");
                break;
            case 5:
                System.out.print("Aniquilação Mútua");
                resultado = "Aniquilação Mútua";
                System.out.println("");
                break;
        }
        return resultado;
    }

}
