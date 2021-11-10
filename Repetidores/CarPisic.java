package EstruturaRepeticao;

import java.util.Scanner;

public class CarPisic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int nc=0,nn=0,na=0,noc=0,nn40=0,nc18=0, idade,sexo,car,cont=0;
		
		while(cont<3) 
		{
			System.out.println("\nEntre com sua idade: ");
			idade=ler.nextInt();
			System.out.println("\nEntre com sua sexo(1-feminino/2-masculino/3-outros): ");
			sexo=ler.nextInt();
			System.out.println("\nEntre com sua característica (1-calme/2-nervose/3-agressive): ");
			car=ler.nextInt();
			if (car==1) {
				nc++;
			}
			if (sexo==1 && car==2) 
			{
				nn++;
			}
			if (sexo==2 && car==3) 
			{
			na++;	
			}
			if (car==1 && sexo==3) 
			{
			noc++;	
			}
			if (car==2 && idade>40) {
				nn40++;
			}
			if (car==1 && idade<18) 
			{
			nc18++;	
			}
			cont++;
			
		}
		System.out.printf("\nO número de pessoas calma é %d \nO número de mulheres nervosas é %d \nO número de homens agressivos é %d \nO número de outros calmos é %d\nO número de pessoas nervosas com mais de 40 anos é %d\nO número de pessoas calmas com menos de 18 anos é %d",nc,nn,na,noc,nn40,nc18);
		
	}

}
