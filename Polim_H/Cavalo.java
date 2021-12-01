package Poli_heranca;

public class Cavalo extends Animal {

	
	public Cavalo(String nome,int idade){
		
		setNome(nome);
		setIdade(idade);
			
	}
	@Override
	 String emitirSom() {
	return "Rimmmmm";	
	}
	@Override
	 String comoDesloca() {
	return "Correr";	
	}
	
	
}
