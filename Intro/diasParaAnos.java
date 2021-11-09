package ProjetoIntroducao;

import java.util.Scanner;

public class diasParaAnos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idadeAno,idadeMes,idadeDias, dias;
		Scanner leia = new Scanner(System.in);
		System.out.println("\nEntre com a idade em dias: ");
		dias= leia.nextInt();
		idadeAno=dias/365;
		idadeMes=(dias-365*idadeAno)/30;
		idadeDias=(dias - 365*idadeAno-30*idadeMes);
		System.out.println("\nSua idade é " + idadeAno+" anos, "+idadeMes+" meses e "+ idadeDias+" dias.");
	}

}
