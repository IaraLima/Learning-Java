package Poli_heranca;

public abstract class Animal {
	private String nome;
	private int idade;

	

	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	abstract String emitirSom();
	abstract String comoDesloca();
	public void imprimirInfo() {
		System.out.println("O(A) "+getNome()+ " faz "+emitirSom()+", tem "+getIdade()+" anos de vida e gosta de "+comoDesloca()+".\n");
	}
	
}
