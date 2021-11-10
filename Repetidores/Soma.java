package EstruturaRepeticao;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0,soma;
		Scanner ler = new Scanner(System.in);
		do 
		{
			soma=+num;
			num = ler.nextInt();
		} while (num!=0);
		System.out.printf("\nA soma dá: ", soma);
	}

}
