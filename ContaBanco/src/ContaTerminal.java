import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor Digite o numero da Conta:");
        int cont = scanner.nextInt();
        System.out.println("Digite o Numero da agencia:");
        String agencia = scanner.next();

        System.out.println("Digite seu nome:");
        String nomeClienteString = scanner.next();

        System.out.println("Digite o saldo Inicial");
        double saldo = scanner.nextDouble();

       System.out.println("Olá cliente " + nomeClienteString + " obrigado por criar sua conta em nosso banco, sua agência é " +agencia + ", conta " + "saldo " +saldo);
    }
}
