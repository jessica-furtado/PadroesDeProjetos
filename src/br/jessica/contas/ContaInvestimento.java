package br.jessica.contas;

public class ContaInvestimento extends Conta {

    double taxa;
    int prazo;

    boolean sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo = this.saldo - (valor * 1.01);
            return true;
        } else {
            return false;
        }
    }

    boolean depositar(double valor) {
        if (valor >= 0) {
            this.saldo = this.saldo + (valor * 1.01);
            return true;
        } else {
            return false;
        }
    }

    void AplicarRendimento (double taxa) {
        this.saldo = this.saldo + (1*taxa);
    }

}
