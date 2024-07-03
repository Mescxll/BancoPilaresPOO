package banco;

public class Main {

	public static void main(String[] args) {
		Cliente maria = new Cliente();
		maria.setNome("Maria");
	
		Conta cc1 = new ContaCorrente(maria);
		Conta poupanca1 = new ContaPoupanca(maria);

		cc1.depositar(200);
		cc1.transferir(100, poupanca1);
		poupanca1.depositar(350);
		cc1.imprimirExtrato();
		poupanca1.imprimirExtrato();
		
		
		Cliente vicente = new Cliente();
		vicente.setNome("Vicente");
		Conta cc2 = new ContaCorrente(vicente);
		Conta poupanca2 = new ContaPoupanca(vicente);
		cc2.depositar(2000);
		poupanca2.depositar(0);
		
		cc2.imprimirExtrato();
		poupanca2.imprimirExtrato();
		
		Cliente sofia = new Cliente();
		sofia.setNome("Sofia");
		Conta cc3 = new ContaCorrente(sofia);
		Conta poupanca3 = new ContaPoupanca(sofia);
		cc3.depositar(50);
		poupanca3.depositar(3000);
		
		cc3.imprimirExtrato();
		poupanca3.imprimirExtrato();
	
	}	
}
