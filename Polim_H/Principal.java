package Poli_heranca;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal cavalo = new Cavalo("Pablo",10);
		Animal preguica = new Preguica("Tiana",5);
		Animal cachorro = new Cachorro("Rex",2);
		
		cavalo.imprimirInfo();
		preguica.imprimirInfo();
		cachorro.imprimirInfo();
	}

}
