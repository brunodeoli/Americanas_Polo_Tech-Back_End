
public class Conta {
    private String num_conta;
    private String agencia;
    private double saldo;

    public Conta(String num_conta, String agencia) {
        this.num_conta = num_conta;
        this.agencia = agencia;
        this.saldo = 0;
    }

    public String getConta() {
        return num_conta;
    }

    public String getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean depositar(double valor) {
        if (valor >= 0) {
            this.saldo += valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean sacar(double valor) {
        if (this.saldo >= 0) {
            if (valor >= 0 && valor <= this.saldo) {
                this.saldo -= valor;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public boolean transferir(Conta conta1, Conta conta2, double valor) {
        if (conta1.saldo >= 0 && valor >= 0 && valor <= this.saldo) {
            conta1.saldo -= valor;
            conta2.saldo += valor;
            return true;
        } else {
            return false;
        }
    }
}

