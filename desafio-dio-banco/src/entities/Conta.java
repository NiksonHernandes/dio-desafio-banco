package entities;

import java.util.List;

public class Conta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int conta;
    protected double saldo;

    public Conta() {
        this.agencia = AGENCIA_PADRAO;
        this.conta = SEQUENCIAL++;
    }

    public void sacar(double saldo) {
        this.saldo -= saldo;
    }

    public void depositar(double saldo) {
        this.saldo += saldo;
    }

    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Conta{");
        sb.append("agencia=").append(agencia);
        sb.append(", conta=").append(conta);
        sb.append(", saldo=").append(saldo);
        sb.append('}');
        return sb.toString();
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
}
