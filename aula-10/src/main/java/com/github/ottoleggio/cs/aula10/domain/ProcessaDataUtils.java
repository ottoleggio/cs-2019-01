package com.github.ottoleggio.cs.aula10.domain;

/**
 * Classe responsável por traduzir Strings de data.
 */
public final class ProcessaDataUtils {

    /**
     * Método construtor da classe.
     */
    private ProcessaDataUtils() {

    }

    /**
     * Método que recebe uma data no formato 'aaaammdd'
     * e extrai o dia correspondente em formato int.
     *
     * @param String de uma data no formato 'aaaammdd'
     *
     * @return int que representa o dia
     */
    public static int extraiDia(final String dataEntrada) {
        int dia = Integer.parseInt(dataEntrada.substring(6,8));
        return dia;
    }

    /**
     * Método que recebe uma data no formato 'aaaammdd'
     * e extrai o mes correspondente em formato int.
     *
     * @param String de uma data no formato 'aaaammdd'
     *
     * @return int que representa o mes
     */
    public static int extraiMes(final String dataEntrada) {
        int mes = Integer.parseInt(dataEntrada.substring(4,6));
        return mes;
    }

    /**
     * Método que recebe uma data no formato 'aaaammdd'
     * e extrai o ano correspondente em formato int.
     *
     * @param String de uma data no formato 'aaaammdd'
     *
     * @return int que representa o ano
     */
    public static int extraiAno(final String dataEntrada) {
        int ano = Integer.parseInt(dataEntrada.substring(0,4));
        return ano;
    }
}
