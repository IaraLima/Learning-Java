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
			System.out.println("\nEntre com sua caracter�stica (1-calme/2-nervose/3-agressive): ");
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
		System.out.printf("\nO n�mero de pessoas calma � %d \nO n�mero de mulheres nervosas � %d \nO n�mero de homens agressivos � %d \nO n�mero de outros calmos � %d\nO n�mero de pessoas nervosas com mais de 40 anos � %d\nO n�mero de pessoas calmas com menos de 18 anos � %d",nc,nn,na,noc,nn40,nc18);
		
	}

}
