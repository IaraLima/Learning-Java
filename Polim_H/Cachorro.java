package Poli_heranca;

public class Cachorro extends Animal{
	
	public Cachorro(String nome,int idade){
		
		setNome(nome);
		setIdade(idade);
		
	}
	@Override
	 String emitirSom() {
	return "Au au au";	
	}
	@Override
	 String comoDesloca() {
	return "Correr";	
	}
	
}
