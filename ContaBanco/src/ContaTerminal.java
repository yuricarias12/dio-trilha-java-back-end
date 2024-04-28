import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta !");
        int numeroConta = ler.nextInt();
        System.out.println("Por favor, digite o número da Agência !");
        String numeroAgencia = ler.next();
        ler.nextLine();
        System.out.println("Por favor, digite o Nome do Cliente !");
        String nomeCliente = ler.nextLine();
        System.out.println("Por favor, digite o Saldo !");
        double saldo = ler.nextDouble();

        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + " conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}