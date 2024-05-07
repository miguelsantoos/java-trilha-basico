import java.util.concurrent.ThreadLocalRandom;

public class Selecao {

    public static void main(String[] args) {
        case2();

    }

    static void case2() {
        double salarioBase = 2000.0;
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
        int totalSelecionados = 0;
        int proximoCandidato = 0;

        while (totalSelecionados < 5 && proximoCandidato < candidatos.length) {
            String candidato = candidatos[proximoCandidato++];
            double salarioPretendido = salarioPretendido();

            System.out.println("O candidato " + candidato + " estar pedindo " + salarioPretendido);

            if (salarioBase < salarioPretendido) {
                System.out.println("O candidato " + candidato + " nao foi selecionado ");
            }else {
                System.out.println("LEGAL!! O candidato " + candidato + " foi selecionado ");
                totalSelecionados++;
            }

        }
        System.out.println("Total de selecionados: " + totalSelecionados);
        System.out.println("Total de consultados: " + proximoCandidato);

    }

    static double salarioPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }



}
