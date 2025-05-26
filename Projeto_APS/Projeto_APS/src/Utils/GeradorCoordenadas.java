package Utils;

//O "Random" é ótimo para randomizar os números que vão ser gerados pras coordenadas
import java.util.Random;

// Aqui criei essa classe para poder denominar a criação randomica das Coordenadas, pro eixo X e Y!! :)
public class GeradorCoordenadas {
	 // Gera coordenada aleatórias
    public static int[][] gerarcoordenada(int quantidade) {
        int[][] coordenada = new int[quantidade][2];
        Random randomizar = new Random();
        for (int i = 0; i < quantidade; i++) {
            coordenada[i][0] = randomizar.nextInt(10000); // x
            coordenada[i][1] = randomizar.nextInt(10000); // y
        }
        return coordenada;
    }

    // Copia matriz de coordenada
    public static int[][] copiarMatriz(int[][] original) {
        int[][] copia = new int[original.length][2];
        for (int i = 0; i < original.length; i++) {
            copia[i][0] = original[i][0];
            copia[i][1] = original[i][1];
        }
        return copia;
    }

}
