package poo_h;

public class Cavalo extends Animal{
 private String modoViver;
 
	public Cavalo(String nome, int idade) {
		super(nome, idade,"Rimmmm");
		this.setModoViver("Correr");
		
		// TODO Auto-generated constructor stub
	}
	

	public Cavalo(String nome, int idade, String som, String modoViver) {
		super(nome, idade, som);
		this.modoViver = modoViver;
		// TODO Auto-generated constructor stub
	}


	public String getModoViver() {
		return modoViver;
	}

	public void setModoViver(String modoViver) {
		this.modoViver = modoViver;
	}
	
	
}
