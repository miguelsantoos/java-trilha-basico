import java.util.Scanner;

/**
 *  Projeto cirado para treinar e praticar,
 *  enquanto aprendo vou melhorando em todos os aspectos
 */

public class ContaTerminal {
    public static void main(String[] args) {


        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        // TODO: Usando a importação do Scanner para graavar dados nas variaveis
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


        System.out.println("Digite o numero da conta: ");
        numero = scanner.nextInt();

        System.out.println("Digite a agência: ");
        agencia = scanner.next();

        System.out.println("Digite seu nome: ");
        nomeCliente = scanner.next();

        System.out.println("Digite o seu saldo: ");
        saldo = scanner.nextDouble();

        // TODO: Mensagem final, criando a conta
        System.out.println("Olá, " + nomeCliente + ", obrigado por criar uma conta em nosso banco");
        System.out.println("sua agencia é, " + agencia + ", conta " + numero + " e seu saldo de " + saldo + " ja estar disponivel para saque");
    }
}

