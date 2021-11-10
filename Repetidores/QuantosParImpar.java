package EstruturaRepeticao;

import java.util.Scanner;

public class QuantosParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int i, cp = 0, ci = 0, num, q = 5;
		for (i = 0; i < q; i++) {
			System.out.printf("\n Entre com o número %d: ", i + 1);
			num = ler.nextInt();
			if (num % 2 == 0) {
				cp++;
			} else
				ci++;
		}
		System.out.printf("\nVocê inseriu %d números pares e %d números ímpares.", cp,ci);
	}

}
