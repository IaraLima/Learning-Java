package Vetores;

public class BasicoVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v[] ={1,0,5,-2,-5,7};
		int soma;
		soma = v[0]+v[1]+v[5];
		v[4]=100;
		System.out.println("\nA soma das posições 0, 1 e 5 do vetor "+v+" é "+soma);
		//pq o resultado de vão vários caracteres estranhos? o que ele puxou e printou?
		System.out.println("\nO vetor alterado ficou:");
		for (int i =0; i<6;i++) {
			System.out.printf("Elemento %d: %d\n",i+1,v[i]);
		}
	}

}
