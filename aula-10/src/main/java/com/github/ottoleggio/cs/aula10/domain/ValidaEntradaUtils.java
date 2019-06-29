package com.github.ottoleggio.cs.aula10.domain;

/**
 * Valida as entradas enviadas pelo terminal de acordo com
 * restrições de datas e números inteiros.
 */
public final class ValidaEntradaUtils {

    /**
     * Quantidade de argumentos passados no terminal.
     */
    private static final int TAMANHO_ARGUMENTO = 4;
    /**
     * Posição do vetor de strings passado como argumento
     * que representa a data de interesse.
     */
    private static final int DATA_INTERESSE = 0;
    /**
     * Posição do vetor de strings passado como argumento
     * que representa o ano bissexto.
     */
    private static final int ANO_BISSEXTO = 1;
    /**
     * Posição do vetor de strings passado como argumento
     * que representa a data de referência.
     */
    private static final int DATA_REFERENCIA = 2;
    /**
     * Posição do vetor de strings passado como argumento
     * que representa o dia da semana.
     */
    private static final int DIA_DA_SEMANA = 3;
    /**
     * Limite de meses que um ano pode conter.
     */
    private static final int LIMITE_MES = 12;
    /**
     * Tamanho que excede a quantidade de dias de uma semana.
     */
    private static final int LIMITE_DATA = 8;
    /**
     * Quantidade de dias de uma semana começando de zero.
     */
    private static final int LIMITE_DIASEMANA = 6;

    /**
     * Método construtor da classe.
     */
    private ValidaEntradaUtils() {

    }

    /**
     * Método que recebe uma data no formato 'aaaammdd'
     * e extrai o dia correspondente em formato int.
     *
     * @param argumentos Data no formato 'aaaammdd'
     *
     * @return int que representa o dia
     */
    public static int qtdArgCheck(final String[] argumentos) {
        if (argumentos.length == TAMANHO_ARGUMENTO) {
            return 1;
        } else {
            return -1;
        }
    }

    /**
     * Método que verifica se o argumento em String
     * é composto apenas por carecteres numericos positivos.
     *
     * @param argumentos String a ser avaliado
     *
     * @return Retorna 1 para verdadeiro e
     * -1 para faso
     */
    public static int seInteiro(final String[] argumentos) {
        int seInteiro = -1;
        int sePositivo = 0;

        for (int i = 0; i < argumentos.length; i++) {
            try {
               sePositivo = Integer.parseInt(argumentos[i]);

               seInteiro = 1;
            } catch (NumberFormatException ex) {
               return -1;
            }

            if (sePositivo < 0) {
                return -1;
            }
        }

        return seInteiro;
     }

    /**
     * Método que verifica se o parametro de
     * dia da semana é menor ou igual a 6.
     *
     * @param argDiaSemana String a ser avaliado
     *
     * @return Retorna 1 para verdadeiro e
     * -1 para faso
     */
    public static int limiteSemanaCheck(final int argDiaSemana) {
        if (argDiaSemana > LIMITE_DIASEMANA) {
            return -1;
        } else {
            return 1;
        }
    }

    /**
     * Método que verifica se o parametro de
     * passado como ano bissexto é maio ou
     * igual a 1.
     *
     * @param anoBissexto String a ser avaliado
     *
     * @return Retorna 1 para verdadeiro e
     * -1 para faso
     */
    public static int anoBissextoCheck(final int anoBissexto) {
        final int limiteBissexto = 1;
        if (anoBissexto < limiteBissexto) {
            return -1;
        } else {
            return 1;
        }
    }

    /**
     * Método que verifica se o parametro de
     * passado como data está dentro dos critérios
     * válidos de uma data.
     *
     * @param argumentos String a ser avaliado
     * @param anoBissexto Ano bissexto de referência
     *
     * @return Retorna 1 para verdadeiro e
     * -1 para faso
     */
    public static int dataInvalida(final String argumentos,
        final int anoBissexto) {
        if (argumentos.length() != LIMITE_DATA) {
            return -1;
        }

        final char anoInvalido = '0';

        if (argumentos.charAt(0) == anoInvalido) {
            return -1;
        }

        if (ProcessaDataUtils.extraiMes(argumentos) == 0) {
            return -1;
        }

        if (ProcessaDataUtils.extraiMes(argumentos) > LIMITE_MES) {
            return -1;
        }

        if (ProcessaDataUtils.extraiDia(argumentos) == 0) {
            return -1;
        }

        if (ProcessaDataUtils.extraiDia(argumentos)
                > ProcessaDataUtils.ultimoDiaDoMes(
                    ProcessaDataUtils.extraiMes(argumentos),
                ProcessaDataUtils.extraiAno(argumentos), anoBissexto)) {
            return -1;
        }

        return 1;
    }

    /**
     * Método que processa todos os critérios
     * de excessão do argumento do programa.
     *
     * @param argumentos String a ser avaliado
     *
     * @return Retorna 1 para verdadeiro e
     * -1 para faso
     */
    public static int validadorEntrada(final String[] argumentos) {
        final int verdadeiro = 1;

        if (qtdArgCheck(argumentos) != verdadeiro) {
            return -1;
        }

        if (seInteiro(argumentos) != verdadeiro) {
            return -1;
        }

        if (limiteSemanaCheck(Integer.parseInt(
            argumentos[DIA_DA_SEMANA])) != verdadeiro) {
            return -1;
        }

        if (anoBissextoCheck(Integer.parseInt(
            argumentos[ANO_BISSEXTO])) != verdadeiro) {
            return -1;
        }

        if (dataInvalida(argumentos[DATA_INTERESSE],
        Integer.parseInt(argumentos[ANO_BISSEXTO])) != verdadeiro) {
            return -1;
        }

        if (dataInvalida(argumentos[DATA_REFERENCIA],
        Integer.parseInt(argumentos[ANO_BISSEXTO])) != verdadeiro) {
            return -1;
        }

        return 1;
    }
}
