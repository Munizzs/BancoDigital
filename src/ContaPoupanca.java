public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void mostrarSaldo(){
        System.out.println("\n|Conta Poupança|");
        super.mostrarSaldo();
    }
    
}
