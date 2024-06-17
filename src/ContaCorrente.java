public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }
    
    @Override
    public void mostrarSaldo(){
        System.out.println("\n|Conta Corrente|");
        super.mostrarSaldo();
    }
}
