package Collections;

import java.util.ArrayList;
import java.util.List;

public class Produto {

	private String Nome;
	private double preco;
	
	
	
	
	public Produto(String nome, double preco) {
		Nome = nome;
		this.preco = preco;
	}
	
	public void imprimirInfo(int i) {
		i=i+1;
		System.out.println(i+" - posição\n"+"Produto: "+getNome()+"\nPreço: "+getPreco());
		
	}
	

	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
}
