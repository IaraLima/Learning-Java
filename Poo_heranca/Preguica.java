package poo_h;

public class Preguica extends Animal{
	private String modoViver;
	
	public Preguica(String nome, int idade) {
		super(nome, idade,"Roonc");
		this.setModoViver("Subir em árvores");
		
		// TODO Auto-generated constructor stub
	}
	

	public Preguica(String nome, int idade, String som, String modoViver) {
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
