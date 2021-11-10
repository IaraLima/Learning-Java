package EstruturaRepeticao;

import java.util.Scanner;

public class MediaNum3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1, soma=0, cont=0,md;
		Scanner ler = new Scanner(System.in);
		do 
		{
			if (num%3==0) 
			{
				soma+=num;
				cont++;
				System.out.printf(" num: %d ",num);
				
			}
			
			System.out.printf("\nInforme o número: ");
			num=ler.nextInt();
			
			
		} while(num!=0);
		md=soma/cont;
		System.out.printf("\nA média dos números múltiplos de 3 é %d ",md);
	}
}
