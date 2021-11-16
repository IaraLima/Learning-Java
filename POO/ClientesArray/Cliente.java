package POO;

public class Cliente {
	private String nome;
	private int id;
	private String telefone;
	private int compraId;
	
	public Cliente(String nome, int id, String telefone, int compraId) {
		this.setNome(nome);
		this.setId(id);
		this.setTelefone(telefone);
		this.setCompraId(compraId);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getCompraId() {
		return compraId;
	}

	public void setCompraId(int compraId) {
		this.compraId = compraId;
	}
	public void imprimir() {
		System.out.println("\nCliente " + this.id + "\nNome: " + this.nome+"\nTelefone: "+this.telefone+"\nCódigo da compra: "+this.compraId);
	}
	
	
	
}
