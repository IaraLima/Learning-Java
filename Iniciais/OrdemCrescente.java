package Iniciante;

import java.util.Scanner;

public class OrdemCrescente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int n1,n2,n3;
		System.out.println("\nEntre com o primeiro número: ");
		n1=leia.nextInt();
		System.out.println("\nEntre com o segundo número: ");
		n2=leia.nextInt();
		System.out.println("\nEntre com o terceiro número: ");
		n3=leia.nextInt();
		if (n1<=n2 && n1<=n3){
			if (n2<=n3) {
			System.out.println("\n Em ordem crescente: "+ n1+ " "+n2+" "+n3+".");	
			}
			else {
				System.out.println("\n Em ordem crescente: "+ n1+ " "+n3+" "+n2+".");	
					
			}
			
		}
		else if (n2<=n2 && n2<=n3){
			if (n1<=n3) {
			System.out.println("\n Em ordem crescente: "+ n2+ " "+n1+" "+n3+".");	
			}
			else {
				System.out.println("\n Em ordem crescente: "+ n2+ " "+n3+" "+n1+".");	
					
			}
			
		}
		else {
			if (n1<=n2) {
				System.out.println("\n Em ordem crescente: "+ n3+ " "+n1+" "+n2+".");	
				}
				else {
					System.out.println("\n Em ordem crescente: "+ n3+ " "+n2+" "+n1+".");	
						
				}
				
		}
	}

}
