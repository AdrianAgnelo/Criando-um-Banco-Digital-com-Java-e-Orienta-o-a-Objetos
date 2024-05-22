package Contas;
public class ContaCorrente extends Contas{

    public void imprimirExtrato () {
        System.out.println("=== Extrato Conta Corrente ===");
        System.out.println(String.format("Agência : %d", super.agencia));
        System.out.println(String.format("Conta : %d", super.conta));
        System.out.println(String.format("Saldo : %f", super.saldo));
    }
}
