package Vetores;

import java.util.Scanner;

public class BasicoMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m[][] = new int[3][3];
		Scanner ler = new Scanner(System.in);
		System.out.println("Entre com a matriz 3x3\n");
		for(int i =0;i<3;i++) {
			for(int j = 0;j<3;j++) {
				System.out.printf("Elemento [%d] [%d]: ",i+1,j+1);
				m[i][j]=ler.nextInt();
			}
		}
		int cont=0;
		System.out.println("Elemntos maiores que 10:\n");
		for(int i =0;i<3;i++) {
			for(int j = 0;j<3;j++) {
				if (m[i][j]>10) {
				System.out.printf("\n%d",m[i][j]);
				cont++;
				}
			}
		}
		System.out.printf("\nHá %d elementos maiores que 10.", cont);
		
	}

}
