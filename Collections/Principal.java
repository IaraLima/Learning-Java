package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		//Criando uma lista 
		System.out.println("Entre com a quantidade de elementos da list: ");
		int q = ler.nextInt();
		List<Produto> lp = new ArrayList<Produto>();
		for(int i = 0; i<q;i++){
			Produto p = new Produto("nome "+i,20);
			lp.add(p);		
			}
		int op=7;
		while(op!=5) {
			System.out.println("1- Imprimir lista de produtos");
			System.out.println("2- Remover Produto");
			System.out.println("3-  Alterar produto numa posição da lista");
			System.out.println("4- Adcionar produto");
			System.out.println("5- Sair");
			System.out.println("Entre com sua opção: ");
			op = ler.nextInt();
			switch(op) {
			case 1:{
				for(int i = 0; i<q;i++){
					lp.get(i).imprimirInfo(i);
					}
			break;	
			}
			case 2:{
				System.out.println("Em que posição está o produto que vc quer remover? vai de 1 a "+lp.size()+" ");
				int p = ler.nextInt();
				lp.remove(p-1);
				q=lp.size();
					
					break;		
						}
			case 3:{
				System.out.println("Em que posição está o produto que vc quer alterar? vai de 1 a "+lp.size()+" ");
				int p = ler.nextInt();
				Produto prod = new Produto("vazio",0);
				System.out.println("Nome: ");
				prod.setNome(ler.next());
				ler.next();
				System.out.println("Preço: ");
				prod.setPreco(ler.nextDouble());
				ler.next();
				lp.set(p-1, prod);
			break;	
			}
			case 4:{
				Produto prod = new Produto("vazio",0);
				System.out.println("Nome: ");
				prod.setNome(ler.next());
				System.out.println("Preço: ");
				prod.setPreco(ler.nextDouble());
				lp.add(prod);
				q=lp.size();
				
				
			
			break;	
			}
			case 5:{
			break;	
			}
			default: {
				System.out.println("Entre com sua opção válida!!");
			break;		
			}
						}
			
		if (op==5) {
			break;
		}	
				
		}

}
}