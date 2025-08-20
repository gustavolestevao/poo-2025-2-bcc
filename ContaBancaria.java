public class ContaBancaria {
    private String numero;
    private String titular;
    private double saldo;
    
    public ContaBancaria(String numero, String titular, double saldo) {
        setNumero(numero);
        setTitular(titular);
        setSaldo(saldo);
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor do depósito deve ser positivo.");
        } else {
            this.saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (valor <= 0 || valor > this.saldo) {
            throw new IllegalArgumentException("O valor do saque deve ser positivo e não pode ser maior do que o saldo atual.");
        } else {
            this.saldo -= valor;
        }
    }

    public void transferir(ContaBancaria contaBancaria,double valor) {
        if (valor <= 0 || valor > this.saldo) {
            throw new IllegalArgumentException("O valor da transferência deve ser positivo e não pode ser maior do que o saldo atual da conta de origem.");
        } else {
            this.saldo -= valor;
            contaBancaria.setSaldo(valor + contaBancaria.getSaldo());
        }
    }

    @Override
    public String toString() {
        return "ContaBancaria [titular=" + titular + ", saldo=" + saldo + "]";
    }
}