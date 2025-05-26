package Utils;

//Esses Imports que coloquei são essenciais para Criação de pastas e arquivos
//Uma Ótima forma de Separar arquivos nos respectivos espaços
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


// AQUI SERÁ CRIADO A PASTA NO QUAL SERÁ SALVO OS ARQUIVOS
// TAMBÉM SERÁ CRIADO A PASTA COM O CÁLCULO COM TEMPOS TOTAIS DE CADA SORTEAMENTO!
public class Arquivos {

    private static final String DIRETORIO = "Resultados";

    // Cria a pasta "saida" se ela não existir
    public static void PastaResultados() {
        File pasta = new File(DIRETORIO);
        if (!pasta.exists()) {
            pasta.mkdir();
        }
    }
    
    public static void PastaDesordenado() {
        File pasta = new File(DIRETORIO + "/Desordenado");
        if (!pasta.exists()) {
            pasta.mkdir();
        }
    }
    public static void PastaOrdenados() {
        File pasta = new File(DIRETORIO + "/Ordenados");
        if (!pasta.exists()) {
            pasta.mkdir();
        }
    }

    public static void ArquivosDesordenados(String nomeArquivo, int[][] coordenadas) {
        try {
            FileWriter writer = new FileWriter(DIRETORIO + "/Desordenado/" + nomeArquivo);
            for (int[] coord : coordenadas) {
                writer.write("(" + coord[0] + ", " + coord[1] + ") \n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Erro ao salvar coordenadas em " + nomeArquivo + ": " + e.getMessage());
        }
    }
    
    // Salva as coordenadas em um arquivo
    public static void ArquivosCoordenadas(String nomeArquivo, int[][] coordenadas) {
        try {
            FileWriter writer = new FileWriter(DIRETORIO + "/Ordenados/" + nomeArquivo);
            for (int[] coord : coordenadas) {
                writer.write("(" + coord[0] + ", " + coord[1] + ") \n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Erro ao salvar coordenadas em " + nomeArquivo + ": " + e.getMessage());
        }
    }

    // TEMPO DE SORTEAMENTO
    public static void salvarTempos(double tempoBubble, double tempoInsertion, double tempoSelection) {
        try {
            FileWriter writer = new FileWriter(DIRETORIO + "/tempo_execucao.txt");
            writer.write("TEMPOS DE EXECUÇÃO (ms)\n");
            writer.write(String.format("Bubble Sort:    %.2f ms%n", tempoBubble));
            writer.write(String.format("Insertion Sort: %.2f ms%n", tempoInsertion));
            writer.write(String.format("Selection Sort: %.2f ms%n", tempoSelection));
            writer.close();
        } catch (IOException e) {
            System.out.println("Erro ao salvar os tempos de execução: " + e.getMessage());
        }
    }
}
