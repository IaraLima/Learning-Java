package poo_h;

public class Cachorro extends Animal{
	private String modoViver;

	public Cachorro(String nome, int idade) {
		super(nome, idade,"Auau");
		this.setModoViver("Correr");
		
		// TODO Auto-generated constructor stub
	}
	

	public Cachorro(String nome, int idade, String som, String modoViver) {
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
