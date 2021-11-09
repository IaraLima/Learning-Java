package Iniciante;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int num;
		double resultado;
		System.out.println("\nEntre com o número: ");
		num = leia.nextInt();
		if (num%2==0)
		{
			resultado=(Math.sqrt(num));
			System.out.println("\nEsse número é par, e sua raiz quadrada é "+ resultado);
		}
		else {
			resultado=Math.pow(num,2);
			System.out.println("\nEsse número é impar, e sua potência quadrada é "+ resultado);
					
		}
	}

}
