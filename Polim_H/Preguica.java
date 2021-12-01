package Poli_heranca;

public class Preguica extends Animal {

	
	public Preguica(String nome,int idade){
		
		setNome(nome);
		setIdade(idade);
			
	}
	@Override
	 String emitirSom() {
	return "Roooonnnc";	
	}
	@Override
	 String comoDesloca() {
	return "Subir em árvores";	
	}
	
	
	
	
}
