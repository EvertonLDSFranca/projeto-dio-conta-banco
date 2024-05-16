import java.util.Locale; 
import java.util.Scanner;   

public class ContaTerminal {

    public static void main(String[] args) {


        int conta;
        String agencia;
        String nomeCliente;
        double saldo;

        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH)) {
            System.out.println("Ola! Por favor, digite o numero da sua conta:");
            conta = scanner.nextInt();
            System.out.println("Por favor, digite a sua agencia:");
            agencia = scanner.next();
            System.out.println("Por favor, digite o seu nome:");
            nomeCliente = scanner.next();
            System.out.println("Por favor " + nomeCliente + ", digite o seu saldo:");
            saldo = scanner.nextDouble();
        }

    System.out.println("Ola " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia e " + agencia + ", conta " + conta + ", e seu saldo " + saldo + " ja esta disponivel para saque.");


    }
}
