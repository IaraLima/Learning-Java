package ProjetoIntroducao;

import java.util.Scanner;

public class SegundosParaHMS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tsegundo, thora, tminuto, tempo;
		Scanner leia = new Scanner(System.in);
		System.out.println("\nEntre com o tempo em segundos: ");
		tempo = leia.nextInt();
		thora = tempo/3600;
		tminuto=(tempo - thora*3600)/60;
		tsegundo=(tempo-thora*3600-tminuto*60);
		System.out.println("\nEsse tempo equivale a "+thora+" horas, "+tminuto+" minutos e "+tsegundo+" segundos.");
		
	}

}
