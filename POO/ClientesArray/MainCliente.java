package POO;



public class MainCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Cliente[] lista = new Cliente[3];
		for (i=0;i<3;i++) {
			lista[i]= new Cliente("Nome"+i,i,"telefone"+i,i);	
		}
		for (i=0;i<3;i++) {
			lista[i].imprimir();	
		}
		
		
	}

}
