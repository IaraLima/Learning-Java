package Iniciante;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int num;
		double resultado;
		System.out.println("\nEntre com o n�mero: ");
		num = leia.nextInt();
		if (num%2==0)
		{
			resultado=(Math.sqrt(num));
			System.out.println("\nEsse n�mero � par, e sua raiz quadrada � "+ resultado);
		}
		else {
			resultado=Math.pow(num,2);
			System.out.println("\nEsse n�mero � impar, e sua pot�ncia quadrada � "+ resultado);
					
		}
	}

}
