package Iniciante;

import java.util.Scanner;

public class CategoriaIdade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int idade;
		System.out.println("\nEntre com sua idade: ");
		idade=leia.nextInt();
		if (idade>=10 && idade<=14) {
			System.out.println("\nInfantil");
		}
		else if (idade>=15 && idade<=17) {
			System.out.println("\nJuvenil");
				
		}
		else if (idade>=18) {
			System.out.println("\nAdulto");
				
		}
		else {
			System.out.println("\nValor inválido!!");
				
		}
	}

}
