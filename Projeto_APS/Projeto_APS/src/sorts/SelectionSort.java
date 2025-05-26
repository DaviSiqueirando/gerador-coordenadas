package sorts;

public class SelectionSort {

    public static void sorteamento(int[][] coordenada) {
        int n = coordenada.length;

        for (int i = 0; i < n - 1; i++) {
            int IndiceMinimo = i;

            for (int j = i + 1; j < n; j++) {
            	if (coordenada[j][0] < coordenada[IndiceMinimo][0] || (coordenada[j][0] == coordenada[IndiceMinimo][0] && coordenada[j][1] < coordenada[IndiceMinimo][1])) {
            		    
            		IndiceMinimo = j;
            		}

            }

            // Troca coordenada[i] com coordenada[IndiceMinimo]
            int tempX = coordenada[i][0];
            int tempY = coordenada[i][1];
            coordenada[i][0] = coordenada[IndiceMinimo][0];
            coordenada[i][1] = coordenada[IndiceMinimo][1];
            coordenada[IndiceMinimo][0] = tempX;
            coordenada[IndiceMinimo][1] = tempY;
        }
    }
}