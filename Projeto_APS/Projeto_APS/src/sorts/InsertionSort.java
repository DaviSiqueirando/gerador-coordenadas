package sorts;

public class InsertionSort {

    public static void sorteamento(int[][] coordenada) {
        int n = coordenada.length;

        for (int i = 1; i < n; i++) {
            int xAtual = coordenada[i][0];
            int yAtual = coordenada[i][1];
            int j = i - 1;

            while (j >= 0 && (coordenada[j][0] > xAtual ||(coordenada[j][0] == xAtual && coordenada[j][1] > yAtual))) {
            	    
            	    coordenada[j + 1][0] = coordenada[j][0];
            	    coordenada[j + 1][1] = coordenada[j][1];
            	    j--;
            	}


            coordenada[j + 1][0] = xAtual;
            coordenada[j + 1][1] = yAtual;
        }
    }
}