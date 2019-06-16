package com.github.ottoleggio.cs.aula10.domain;

public final class ValidaEntradaUtils {

    private static final int LIMITE_DIA = 31;
    private static final int LIMITE_MES = 12;
    private static final int LIMITE_DATA = 8;
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
        if(argumentos.length != 4) {
            return -1;
        }else {
            return 1;
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
        int isValidInteger = -1;
        int indiceArg = 0;
        int sePositivo = 0;

        for(int i = 0; i < argumentos.length; i++) {
            try
            {
               sePositivo = Integer.parseInt(argumentos[indiceArg]);

               isValidInteger = 1;
            }
            catch (NumberFormatException ex)
            {
               return -1;
            }

            if(sePositivo < 0) {
                return -1;
            }
        }

        return isValidInteger;
     }

    /**
     * Método que verifica se o parametro de 
     * dia da semana é menor ou igual a 6.
     *
     * @param argumentos String a ser avaliado
     *
     * @return Retorna 1 para verdadeiro e 
     * -1 para faso
     */
    public static int limiteSemanaCheck(final int argDiaSemana) {
        if(argDiaSemana > LIMITE_DIASEMANA) {
            return -1;
        }else {
            return 1;
        }
    }

    /**
     * Método que verifica se o parametro de 
     * passado como ano bissexto é maio ou
     * igual a 1.
     *
     * @param argumentos String a ser avaliado
     *
     * @return Retorna 1 para verdadeiro e 
     * -1 para faso
     */
    /*
    public static int anoBissextoCheck(final int anoBissexto) {
        if(anoBissexto < 1) {
            return -1;
        }else {
            return 1;
        }
    }
    */

    /**
     * Método que verifica se o parametro de 
     * passado como data está dentro dos critérios
     * válidos de uma data.
     *
     * @param argumentos String a ser avaliado
     *
     * @return Retorna 1 para verdadeiro e 
     * -1 para faso
     */
    public static int dataInvalida(final String argumentos) {
        int seValido = -1;

        if(argumentos.length() == LIMITE_DATA) {
            seValido = 1;
        }

        if(argumentos.charAt(0) == '0') {
            seValido = -1;
        }

        if(ProcessaDataUtils.extraiMes(argumentos) == 0) {
            seValido = -1;
        }

        if(ProcessaDataUtils.extraiMes(argumentos) > LIMITE_MES) {
            seValido = -1;
        }

        if(ProcessaDataUtils.extraiDia(argumentos) == 0) {
            seValido = -1;
        }

        if(ProcessaDataUtils.extraiDia(argumentos) > LIMITE_DIA) {
            seValido = -1;
        }

        return seValido;
    }

    public static int validadorEntrada(final String[] argumentos) {
        if(qtdArgCheck(argumentos) != 1) {
            return -1;
        }

        if(seInteiro(argumentos) != 1) {
            return -1;
        }

        if(limiteSemanaCheck(Integer.parseInt(argumentos[3])) != 1) {
            return -1;
        }

        //seValido = anoBissextoCheck(ProcessaDataUtils.extraiAno(argumentos[1]));
        if(dataInvalida(argumentos[0]) != 1) {
            return -1;
        }

        if(dataInvalida(argumentos[2]) != 1) {
            return -1;
        }

        return 1;
    }
}
