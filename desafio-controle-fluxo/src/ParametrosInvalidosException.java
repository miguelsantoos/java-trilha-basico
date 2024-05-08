public class ParametrosInvalidosException extends Exception {

    static String parametrosInvalidosException(int numeroUm, int numeroDois) throws ParametrosInvalidosException {

        if(numeroDois > numeroDois)
            throw new ParametrosInvalidosException();
        return "O segundo parâmetro deve ser maior que o primeiro";
    }
}
