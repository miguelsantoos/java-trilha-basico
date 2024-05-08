import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroUm;
        int numeroDois;

        System.out.println("Digite numero 1: ");
        numeroUm = scanner.nextInt();

        System.out.println("Digite numero 1: ");
        numeroDois = scanner.nextInt();

        int ocorrencia = 0;
        int resul = numeroDois - numeroUm;

        // Se o resultado da soma for menor que que zero ele lança a mensagem
        // Como essa exceção ja é prevista o uso do if se encaixa melhor para tratar
        if (resul < 0)
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        else
            for (ocorrencia = 0; ocorrencia <= resul; ocorrencia++)
                System.out.println(ocorrencia);
    }
}