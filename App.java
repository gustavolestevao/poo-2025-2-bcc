import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Qual é o número da primeira conta? ");
        String numero1  = input.next();

        System.out.println("Quem é o titular da primeira conta? ");
        String titular1  = input.next();

        System.out.println("Qual é o número da segunda conta? ");
        String numero2  = input.next();

        System.out.println("Quem é o titular da segunda conta? ");
        String titular2  = input.next();

        
        ContaBancaria conta1 = new ContaBancaria(numero1, titular1, 0);
        ContaBancaria conta2 = new ContaBancaria(numero2, titular2, 0);
        
        conta1.depositar(1000);
        conta1.depositar(700);
        
        conta2.depositar(5000);
        conta2.sacar(3000);

        conta2.transferir(conta1, 1800);

        System.out.println(conta1.toString());
        System.out.println(conta2.toString());
    }
}