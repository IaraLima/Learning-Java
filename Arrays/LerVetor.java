package Vetores;

import java.util.Scanner;

public class LerVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declaracao de variaveis
		int v[] = new int[6];
		Scanner ler = new Scanner(System.in);
		//leitura dos 6 números inteiros
		for (int i =0;i<6;i++) {
			System.out.println("\nEntre com o número: ");
			v[i] = ler.nextInt();

		}
		//iremos determinar números pares, sp -> soma dos números pares, números ímpares e qi-> quantidade de núemros impares
		int sp=0,qi=0;
		for (int i = 0; i<6;i++) {
			if (v[i]%2==0) {
				System.out.printf("\n O número %d é par.",v[i]);
				sp=sp+v[i];
			}
			else {
				System.out.printf("\n O número %d é ímpar.", v[i]);
				qi++;	
			}
		}
		System.out.println("\nA soma dos números pares é "+ sp);
		System.out.println("\nA quantidade dos números ímpares é "+ qi);
		
		
	}

}
