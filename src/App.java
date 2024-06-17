
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Cliente cliente1 = new Cliente("Matheus Muniz", 20);
        Conta cc = new ContaCorrente(cliente1);
        cc.depositar(10000000);

        
        Cliente cliente2 = new Cliente("João",18);
        
        Conta cp = new ContaPoupanca(cliente2);
        
        cp.mostrarSaldo();
        
        cp.depositar(100);
        
        cp.mostrarSaldo();
        
        cp.sacar(10);
        
        cp.transferir(50, cc);
        
        cc.mostrarSaldo();

    }
}
