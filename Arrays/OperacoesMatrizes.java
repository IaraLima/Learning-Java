package Vetores;

import java.util.Scanner;

public class OperacoesMatrizes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n[][]=new int[2][2];
		int m[][] = new int[2][2];
		Scanner ler = new Scanner(System.in);
		System.out.println("Entre com a 1 matriz 2x2\n");
		for(int i =0;i<2;i++) {
			for(int j = 0;j<2;j++) {
				System.out.printf("Elemento [%d] [%d]: ",i+1,j+1);
				m[i][j]=ler.nextInt();
			}
		}
		System.out.println("Entre com a 2 matriz 2x2\n");
		
		for(int i =0;i<2;i++) {
			for(int j = 0;j<2;j++) {
				System.out.printf("Elemento [%d] [%d]: ",i+1,j+1);
				n[i][j]=ler.nextInt();
			}
		}
		int op=0;
		while(op!=5) {
			System.out.println("\n1- Somar matrizes.");
			System.out.println("\n2- Subtrair a primeira pela segunda.");
			System.out.println("\n3- Adicionar uma constante as duas matrizes.");
			System.out.println("\n4- Imprimir as matrizes");
			System.out.println("\n5-Sair");
		System.out.println("\nEntre com a opção: ");
		op=ler.nextInt();
		
		switch(op) {
		case 1:{
			int res[][] = new int[2][2];
			for(int i =0;i<2;i++) {
				for(int j = 0;j<2;j++) {
					res[i][j]=n[i][j]+m[i][j];
				}
				
			}
			System.out.println("Matriz resultante\n");
			for(int i =0;i<2;i++) {
				for(int j = 0;j<2;j++) {
					System.out.printf("%d ",res[i][j]);
				}
				System.out.printf("\n");
			}	
			break;
		}
		case 2:{
			int res[][] = new int[2][2];	
			for(int i =0;i<2;i++) {
				for(int j = 0;j<2;j++) {
					res[i][j]=m[i][j]-n[i][j];
				}
			}
			System.out.println("Matriz resultante\n");
			for(int i =0;i<2;i++) {
				for(int j = 0;j<2;j++) {
					System.out.printf("%d ",res[i][j]);
				}
				System.out.printf("\n");
			}	
			break;
		}
		case 3:{
			int constante;
			System.out.println("Entre com a constante: ");
			constante = ler.nextInt();
			for(int i =0;i<2;i++) {
				for(int j = 0;j<2;j++) {
					n[i][j]=n[i][j]+constante;
					m[i][j]=m[i][j]+constante;
				}
			}
			break;
		}
		case 4: {
			System.out.println("Matrizes\nMatriz 1:\n");
			for(int i =0;i<2;i++) {
				for(int j = 0;j<2;j++) {
					System.out.printf("%d ",m[i][j]);
				}
				System.out.printf("\n");
			}
			System.out.println("Matriz 2:\n");
			for(int i =0;i<2;i++) {
				for(int j = 0;j<2;j++) {
					System.out.printf("%d ",n[i][j]);
				}
				System.out.printf("\n");
			}
			break;
		}
		case 5:{
			break;
		}
		default: {
			System.out.println("Opção inválida!!");
			break;
		}
		}
	if (op==5) {
		break;
	}	
	}
	}
}
