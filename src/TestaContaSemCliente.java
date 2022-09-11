
public class TestaContaSemCliente {
	
	public static void main(String[] args) {
		Conta contadaMarcela = new Conta();
		contadaMarcela.titular = new Cliente();
		System.out.println(contadaMarcela.saldo);
		
		
		System.out.println(contadaMarcela.titular);
		contadaMarcela.titular.nome = "Marcela";
		System.out.println(contadaMarcela.titular.nome);
		
	}

}
