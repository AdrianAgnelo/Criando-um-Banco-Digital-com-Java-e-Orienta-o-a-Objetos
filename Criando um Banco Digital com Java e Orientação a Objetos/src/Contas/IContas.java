package Contas;

public interface  IContas {
     void sacar(double valor);
     void depositar(double valor);
     void transferir(double valor, Contas contaDestino);
     void imprimirExtrato();
}
