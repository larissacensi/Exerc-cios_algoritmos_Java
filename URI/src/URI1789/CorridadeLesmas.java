package URI1789;


import java.util.Scanner;

/**
 *
 * @author Larissa Censi
 */

public class CorridadeLesmas {

    public int[] cadastrarLesmas(int quantidade) {
        int i;
        Scanner reader;
        reader = new Scanner(System.in);
        int[] lesmas = new int[quantidade];
        for (i = 0; i < quantidade; i++) {
            System.out.println("Digite a velocidade da lesma " + (i + 1) + ":");
            lesmas[i] = reader.nextInt();
        }
        return lesmas;
    }

    public int verificarVelocidades(int[] lesmas) {
        int velocidade = 0, i;
        for (i = 0; i < lesmas.length; i++) {
            if (lesmas[i] > velocidade) {
                velocidade = lesmas[i];
            }
        }
        int veloz;
        if (velocidade < 10) {
            veloz = 1;
        } else if (velocidade >= 10 && velocidade < 20) {
            veloz = 2;
        } else {
            veloz = 3;
        }
        System.out.println("O nivel da lesma mais veliz é: " + veloz);
        return veloz;
    }
}
