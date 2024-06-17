
public abstract class Conta implements IConta{
    
    private int SEQUENCIAL = 1;
    
    protected int numeroConta;
    protected int agenciaPadrao = 0001;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        numeroConta = SEQUENCIAL++;
        this.cliente = cliente;
    }   

    public int getNumeroConta() {
        return numeroConta;
    }

    public int getAgencia() {
        return agenciaPadrao;
    }

    public double getSaldo() {
        return saldo;
    }

    public Conta(int numeroConta, int agencia, double saldo) {
        this.numeroConta = numeroConta;
        this.agenciaPadrao = agencia;
        this.saldo = saldo;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public void mostrarSaldo() {
        System.out.printf("#%d - %d | %s",numeroConta,agenciaPadrao,cliente.getNome());
        System.out.printf("\nSaldo: R$%.2f\n",saldo);
    }
}
