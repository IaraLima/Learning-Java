package Vetores;

import java.util.Scanner;

public class LerVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declaracao de variaveis
		int v[] = new int[6];
		Scanner ler = new Scanner(System.in);
		//leitura dos 6 n�meros inteiros
		for (int i =0;i<6;i++) {
			System.out.println("\nEntre com o n�mero: ");
			v[i] = ler.nextInt();

		}
		//iremos determinar n�meros pares, sp -> soma dos n�meros pares, n�meros �mpares e qi-> quantidade de n�emros impares
		int sp=0,qi=0;
		for (int i = 0; i<6;i++) {
			if (v[i]%2==0) {
				System.out.printf("\n O n�mero %d � par.",v[i]);
				sp=sp+v[i];
			}
			else {
				System.out.printf("\n O n�mero %d � �mpar.", v[i]);
				qi++;	
			}
		}
		System.out.println("\nA soma dos n�meros pares � "+ sp);
		System.out.println("\nA quantidade dos n�meros �mpares � "+ qi);
		
		
	}

}
