public class Cpf {
    private static final int INDICE_REGIAO_CPF = 8;
    private static final int INDICE_PRIMEIRO_VERIFICADOR = 9;
    private static final int INDICE_SEGUNDO_VERIFICADOR = 10;

    public void validar(String cpf) {
        // ABC.DEF.GHI-JK
        // A-H: identificador que a RF emite
        // I: regição onde foi emitido o cpf
        // JK: dígitos verificadores

        // desconsidere os pontos
        // ABCDEFGHIJK
        int regiao = cpf.charAt(INDICE_REGIAO_CPF);
        int primeiroDigitoVerificador = cpf.charAt(INDICE_PRIMEIRO_VERIFICADOR);
        int segundooDigitoVerificador = cpf.charAt(INDICE_SEGUNDO_VERIFICADOR);
    }

}
