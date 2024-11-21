public class AtividadeJava {

	public static void main(String[] args) { 
		int[][] matriz = new int[4][4];
		
		preencher(matriz);
		ler(matriz);
	}
	
	public static void preencher(int[][] matr) {
		for(int y = 0; y < matr[0].length; y++) {
			for(int x = 0; x < matr.length; x++) {
				if(y == x) {
					matr[x][y] = 0;
				}else if(x < y){
					matr[x][y] = 1;
				}else {
					matr[x][y] = -1;
				}
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
