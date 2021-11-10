package EstruturaRepeticao;

import java.util.Scanner;

public class IdadeFaixa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade=0, c21=0,c50=0;
		Scanner ler = new Scanner(System.in);
		while(idade != -99) {
			System.out.println("\nEntre com a idade: ");
			idade=ler.nextInt();
			if (idade<21) 
			{
				c21++;
			}
			else if (idade>50) 
			{
			c50++;	
			}
		}
		System.out.printf("\nHá %d com menos de 21 anos e %d com mais de 50.",c21,c50);
	}

}
