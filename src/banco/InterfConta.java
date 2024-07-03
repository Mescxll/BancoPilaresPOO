package banco;

public interface InterfConta {
	
	void sacar(double valor);
	
	void depositar(double valor);
	
	void transferir(double valor, InterfConta contaDestino);
	
	void imprimirExtrato();
}
