package Contas;
public abstract class Contas implements IContas {

    private static int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int conta;
    protected double saldo;

    public Contas() {
        this.agencia = AGENCIA_PADRAO;
        this.conta = SEQUENCIAL++;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void transferir(double valor, Contas contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public void imprimirExtrato(){
        
    }
}
