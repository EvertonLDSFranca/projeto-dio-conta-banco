
import java.util.Locale; 
import java.util.Scanner;   

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);

        System.out.println("Olá! Por favor, digite o número da sua conta:");
        int conta = scanner.nextInt();
        
        System.out.println("Por favor, digite a sua agência:");
        String agencia = scanner.next();
        
        System.out.println("Por favor, digite o seu nome:");
        String nomeCliente = scanner.next();

        System.out.println("Por favor " + nomeCliente + ", digite o seu saldo:");
        double saldo = scanner.nextDouble();

        System.out.println("");

    



    }
}
