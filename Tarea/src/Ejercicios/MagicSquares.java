package Ejercicios;

public class MagicSquares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] matriz = new int [4][4];
		
		for(int i=0; i<matriz.length; i ++) {
			for(int j=0; j<matriz.length;j++) {
				matriz[i][j]  = (int) (Math.random()*100);
				
				System.out.print(matriz[i][j]+" ");
			}
			
			System.out.println();
			
		}
		
		System.out.println("El valor pico es: 100");

	}

}
