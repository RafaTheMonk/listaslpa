import java.util.Random;
import java.util.Scanner;

public class AtividadeJava {

	public static void main(String[] args) { 
		float[][] matriz = new float[5][4];
		String[] nomes = new String[5];
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os nomes dos 5 alunos:");
		preencherNomes(nomes, sc);
		System.out.println("Gerando notas aleatórias para os alunos...");
		preencherNotas(matriz, rand);
		System.out.println("\nNotas dos alunos:");
		ler(matriz, nomes);
		
	}
	
	public static void preencherNotas(float[][] matr, Random rand) {
		for(int y = 0; y < matr[0].length; y++) {
			for(int x = 0; x < matr.length; x++) {
				matr[x][y] = rand.nextFloat()* 10;
			}
		}
	}
	
	public static void preencherNomes(String[] nomes, Scanner sc) {
		for(int y = 0; y < nomes.length; y++) {
			System.out.print("Digite o nome do aluno " + (y + 1) + ": ");
			nomes[y] = sc.nextLine();
		}
	}
	
	public static void ler(float[][] matr, String[] nomes) {
		System.out.printf("%-15s %s\n", "Aluno", "Notas");
        System.out.println("-------------------------------");
		for(int x=0; x < matr.length; x++) {
			System.out.printf("%-15s", nomes[x]);
			for(int y = 0; y < matr[x].length; y++) {
				System.out.printf("%.1f | ", matr[x][y]);
			}
			System.out.println();
		}
	}
}
