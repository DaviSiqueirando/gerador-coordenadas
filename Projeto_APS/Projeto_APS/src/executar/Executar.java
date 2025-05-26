package executar;

//Importei todas as outras packages, com o intuito de otimizar o código e organizar por sua propria classe.
import sorts.BubbleSort;
import sorts.InsertionSort;
import sorts.SelectionSort;
import Utils.GeradorCoordenadas;
import Utils.Arquivos;

//Input
import java.util.Scanner;


//Esse será o Arquivo que deverá ser executado para funcionar o Projeto.
public class Executar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de coordenada a serem geradas: ");
        int tamanho = scanner.nextInt();

        // Geração das coordenada
        int[][] coordenadaOriginais = GeradorCoordenadas.gerarcoordenada(tamanho);

        // Cópias para cada algoritmo
        int[][] coordsBubble = GeradorCoordenadas.copiarMatriz(coordenadaOriginais);
        int[][] coordsInsertion = GeradorCoordenadas.copiarMatriz(coordenadaOriginais);
        int[][] coordsSelection = GeradorCoordenadas.copiarMatriz(coordenadaOriginais);

        // São os arquivos da Package "Utils", criamos com função de ordenar
        // Pastas e os tempos de cada sorteamento...
        Arquivos.PastaResultados();
        Arquivos.PastaDesordenado();
        Arquivos.PastaOrdenados();

        // Coordenada Desordenada
        Arquivos.ArquivosDesordenados("coordenada_desordenadas.txt", coordenadaOriginais);

        // Bubble Sort e Tempo de Sort
        long inicio = System.nanoTime();
        BubbleSort.sorteamento(coordsBubble);
        long fim = System.nanoTime();
        double tempoBubble = (fim - inicio) / 1e6;
        Arquivos.ArquivosCoordenadas("Sorteamento_BubbleSort.txt", coordsBubble);

        // Insertion Sort e Tempo de Sort
        inicio = System.nanoTime();
        InsertionSort.sorteamento(coordsInsertion);
        fim = System.nanoTime();
        double tempoInsertion = (fim - inicio) / 1e6;
        Arquivos.ArquivosCoordenadas("Sorteamento_InsertionSort.txt", coordsInsertion);

        // Selection Sort e Tempo de Sort
        inicio = System.nanoTime();
        SelectionSort.sorteamento(coordsSelection);
        fim = System.nanoTime();
        double tempoSelection = (fim - inicio) / 1e6;
        Arquivos.ArquivosCoordenadas("Sorteamento_selectionSort.txt", coordsSelection);

        // Salva os tempos
        Arquivos.salvarTempos(tempoBubble, tempoInsertion, tempoSelection);
        
        System.out.println("\nPronto! Teste Realizado com Sucesso!");
        System.out.println("Todos os Arquivos salvos na pasta 'Resultados', na Raiz do Diretório da Pasta, contendo a Coordenada Desordenada e as Ordenadas.");
        System.out.println("\n =-=-=-=-=-=-=-=-=-=-= TEMPOS DE EXECUÇÃO (ms) =-=-=-=-=-=-=-=-=-=-=\n");
        System.out.println(String.format("Bubble Sort:    %.2f ms%n", tempoBubble));
        System.out.println(String.format("Insertion Sort: %.2f ms%n", tempoInsertion));
        System.out.println(String.format("Selection Sort: %.2f ms%n", tempoSelection));

        scanner.close();
    }
}
