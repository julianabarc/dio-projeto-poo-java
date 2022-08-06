
public class Main {

	public static void main(String[] args) {
		Cliente juliana = new Cliente();
		juliana.setNome("Juliana");
		
		Conta cc = new ContaCorrente(juliana);
		Conta poupanca = new ContaPoupanca(juliana);

		cc.depositar(500);
		cc.transferir(500, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
