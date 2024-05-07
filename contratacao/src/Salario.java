public class Salario {
    public static void main(String[] args) {

        caso1(2000.0, 1000.0);
        caso1(2000.0, 2000.0);
        caso1(2000.0, 3000.0);

    }

    public static void caso1(double salarioBase, double salarioPretendido) {

        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");

        }
        else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA");

        }
        else {
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}