package ProjetoIntroducao;

import java.util.Scanner;

public class idadeEmDias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ano,mes,dia,totalDias;
		Scanner leia = new Scanner(System.in);
		System.out.println("\nEntre com sua idade, ano: ");
		ano = leia.nextInt();
		System.out.println("\nmeses: ");
		mes = leia.nextInt();
		System.out.println("\ndias: ");
		dia = leia.nextInt();
		totalDias= (ano*365)+(mes*30)+dia;
		System.out.println("\nTotal de dias: "+totalDias + " de vida.");
	}

}
