
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // TODO:conhecer e importar a classe Scanner
        // Exibir as mensagem para o nosso user
        // Obter pelo scanner os valores digitados no terminal
        // Exibir mensagem conta criada
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();
        System.out.println("Digite o numero da agência: ");
        String numeroAgencia = scanner.nextLine();
        System.out.println("Digite o numero da conta: ");
        int numeroConta = scanner.nextInt();
        System.out.println("Digite o valor do saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Ola " + nomeCliente + ", obrigado por criar um conta em nosso banco, sua agência é "
                + numeroAgencia + ", conta " + numeroConta + " e seu saldo é " + saldo
                + " já está disponível para saque");

    }
}
