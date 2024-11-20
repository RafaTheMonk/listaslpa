import java.util.Scanner;

public class AtividadeJava {

	public static void main(String[] args) { 
		int[][] matriz = new int[3][3];
		
		Scanner sc = new Scanner(System.in);
		
		preencher(matriz, sc);
		ler(matriz);
	}
	
	public static void preencher(int[][] matr, Scanner sc) {
		for(int y = 0; y < matr[0].length; y++) {
			for(int x = 0; x < matr.length; x++) {
				matr[x][y] = sc.nextInt();
			}
		}
	}
	
	public static void ler(int[][] matr) {
		for(int x=0; x < matr.length; x++) {
			for(int y = 0; y < matr[x].length; y++) {
				System.out.printf(matr[x][y]+" ");
			}
			System.out.println();
		}
	}
}
