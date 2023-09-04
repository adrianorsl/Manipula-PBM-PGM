import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;



public class Main {
	
//Atividade 5-2 a e b	
public static String Alterar_PGM_PBM(String inputFile2, int valorMaximo, String tipoImagem, int limite) throws IOException {
    	
    	// Carrega a imagem PGM de entrada
        FileInputStream inputStream2 = new FileInputStream(inputFile2);
        Scanner scanner = new Scanner(inputStream2);
        
        // Lê o cabeçalho da imagem PGM
        String tipoImagem2 = scanner.nextLine();
        int largura = scanner.nextInt();
        int altura = scanner.nextInt();
        int valorMaximo2 = scanner.nextInt();
        int newBit = 0;
        	
        String outputFile2 = "/home/adriano/Imagens/PDI/Manipula1.pbm"; // Caminho da imagem redimensionada de saída
        FileWriter writer = new FileWriter(outputFile2);
        writer.write(tipoImagem + "\n");
        writer.write(largura + " " + altura + "\n");
        //escreve o valor maximo dos bits
        writer.write(valorMaximo + "\n");
        
        for (int y = 0; y < altura; y++) {
            for (int x = 0; x < largura; x++) {
                int bits = scanner.nextInt();
                //faz checagens com o limite difinido
                if (bits <= limite) {
                	newBit = 0;
                }else {
                	newBit = 1;
                }
                writer.write(newBit + " ");
            }
            writer.write("\n");
        }
        writer.close();
    	
    	String teste = "OK";
        
        return teste;
    }

// Atividade 6 
public static String Alterar_PGM_PBM_valor(String inputFile2, int valorMaximo, String tipoImagem, int limite, int valor1, int valor2) throws IOException {
	
	// Carrega a imagem PGM de entrada
    FileInputStream inputStream2 = new FileInputStream(inputFile2);
    Scanner scanner = new Scanner(inputStream2);
    
    // Lê o cabeçalho da imagem PGM
    String tipoImagem2 = scanner.nextLine();
    int largura = scanner.nextInt();
    int altura = scanner.nextInt();
    int valorMaximo2 = scanner.nextInt();
    int newBit = 0;
    	
    String outputFile2 = "/home/adriano/Imagens/PDI/Manipula2.pgm"; // Caminho da imagem redimensionada de saída
    FileWriter writer = new FileWriter(outputFile2);
    writer.write(tipoImagem + "\n");
    writer.write(largura + " " + altura + "\n");
    writer.write(valorMaximo + "\n");
    
    for (int y = 0; y < altura; y++) {
        for (int x = 0; x < largura; x++) {
            int bits = scanner.nextInt();
            if (bits <= limite) {
            	newBit = valor1;
            }else {
            	newBit = valor2;
            }
            writer.write(newBit + " ");
        }
        writer.write("\n");
    }
    writer.close();
	
	String teste = "OK";
    
    return teste;
}

//Atividade 5-2 c inverte os valores dos bits
public static String Negativo(String inputFile2, String tipoImagem) throws IOException {
	
	// Carrega a imagem PGM de entrada
    FileInputStream inputStream2 = new FileInputStream(inputFile2);
    Scanner scanner = new Scanner(inputStream2);
    
    // Lê o cabeçalho da imagem PGM
    String tipoImagem2 = scanner.nextLine();
    int largura = scanner.nextInt();
    int altura = scanner.nextInt();
    int valorMaximo = scanner.nextInt();
    int newBit = 0;
    	
    String outputFile2 = "/home/adriano/Imagens/PDI/Negativo1.pbm"; // Caminho da imagem redimensionada de saída
    FileWriter writer = new FileWriter(outputFile2);
    // Define o tipo da imagem
    writer.write(tipoImagem + "\n");
    writer.write(largura + " " + altura + "\n");
    writer.write(valorMaximo + "\n");
    
    for (int y = 0; y < altura; y++) {
        for (int x = 0; x < largura; x++) {
            int bits = scanner.nextInt();
            if (bits == 0) {
            	newBit = 1;
            }else {
            	newBit = 0;
            }
            writer.write(newBit + " ");
        }
        writer.write("\n");
    }
    writer.close();
	
	String teste = "OK";
    
    return teste;
}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String inputFile = "/home/adriano/Imagens/PDI/Entrada_EscalaCinza.pgm"; // Caminho da imagem de entrada
		String inputFile2 = "/home/adriano/Imagens/PDI/Manipula1.pbm"; // Caminho da imagem de entrada
		
		Alterar_PGM_PBM(inputFile, 1, "P1", 128);
		Negativo(inputFile2, "P1");
		Alterar_PGM_PBM_valor(inputFile, 255, "P2", 128, 0, 255);
	}

}
