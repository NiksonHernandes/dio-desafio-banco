import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        Conta poupanca = new ContaPoupanca();

        cc.depositar(100);

        cc.transferir(100, poupanca);

        System.out.println(cc);
        System.out.println(poupanca);

    }
}