package sorts;

public class BubbleSort {
	
	
    public static void sorteamento(int[][] coordenada) {
        int n = coordenada.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
            	if (coordenada[j][0] > coordenada[j + 1][0] || (coordenada[j][0] == coordenada[j + 1][0] && coordenada[j][1] > coordenada[j + 1][1])) {
            		    
            		    int tempX = coordenada[j][0];
            		    int tempY = coordenada[j][1];
            		    coordenada[j][0] = coordenada[j + 1][0];
            		    coordenada[j][1] = coordenada[j + 1][1];
            		    coordenada[j + 1][0] = tempX;
            		    coordenada[j + 1][1] = tempY;
            		}

            }
        }
    }
}
