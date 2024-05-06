public class Salario {
    public static void main(String[] args) {

        valorProposto(1000.0);
        valorProposto(2000.0);
        valorProposto(3000.0);

    }

    public static String valorProposto(double valorCandidato) {

        double valorProposto = 2000.0;

        if (valorProposto > valorCandidato) {
            System.out.println("AGUARDE CONTRA PROPOSTA");

        } else if (valorCandidato == valorProposto) {
            System.out.println("LIGANDO PARA CANDIDATO");

        } else if(valorProposto < valorCandidato) {
            System.out.println("AGUARDANDO OUTROS CANDIDATOS");
        }

        return null;
    }
}