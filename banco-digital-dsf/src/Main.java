import java.util.Scanner;


public class Main {
  
	public static void main(String[] args){
	  Cliente felipe = new Cliente();
	    
	  felipe.setNome("Felipe");
	  
	
	  Conta poupanca = new ContaPoupanca(felipe);
	  Conta cc = new ContaCorrente(felipe);
	  
	  cc.depositar(100);
	  cc.transferir(100, poupanca);
	  
	  poupanca.imprimirExtrato();
	  cc.imprimirExtrato();
	  
	  
	  
  }
  
  
}