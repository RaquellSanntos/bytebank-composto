
public class TestaBanco {
	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		paulo.nome	= "Paulo Silveira";
		paulo.cpf	= "222.222.222-22";
		paulo.profissao = "programador";
		
		Conta contaDConta	= new Conta();
		contaDConta.deposita(100);
	}

}
