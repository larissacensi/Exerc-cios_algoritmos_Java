package URI1142;


/**
 *
 * @author Larissa Censi
 */
public class PUM {

    public String sequencia(int numero) {
        int cont = 0;
        StringBuilder builder = new StringBuilder();
        int j;
        for (j = 1; j <= (numero * 4); j++) {
            builder.append( j );
            builder.append(" ");
            cont++;
            if (cont == 3) {
                j++;
                builder.append("PUM");
                builder.append("\n");
                cont = 0;
            }
        }
        return builder.toString();
    }
}
