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
     * Recebe uma data no formato 'aaaammdd'
     * e extrai o dia correspondente em formato int.
     *
     * @param dataEntrada String de uma data no formato 'aaaammdd'
     *
     * @return int que representa o dia
     */
    public static int extraiDia(final String dataEntrada) {
        int dia = Integer.parseInt(dataEntrada.substring(6,8));
        return dia;
    }

    /**
     * Recebe uma data no formato 'aaaammdd'
     * e extrai o mes correspondente em formato int.
     *
     * @param dataEntrada String de uma data no formato 'aaaammdd'
     *
     * @return int que representa o mes
     */
    public static int extraiMes(final String dataEntrada) {
        int mes = Integer.parseInt(dataEntrada.substring(4,6));
        return mes;
    }

    /**
     * Recebe uma data no formato 'aaaammdd'
     * e extrai o ano correspondente em formato int.
     *
     * @param dataEntrada String de uma data no formato 'aaaammdd'
     *
     * @return int que representa o ano
     */
    public static int extraiAno(final String dataEntrada) {
        int ano = Integer.parseInt(dataEntrada.substring(0,4));
        return ano;
    }

    /**
     * Identifica se um ano é bissexto de acordo com critérios
     * especificados nos requisitos.
     *
     * @param ano Ano que se deseja saber se é bissexto
     * @param bissextoRef Ano bissexto de referência
     *
     * @return verdadeiro quando bissexto e falso caso
     * o constrário
     */
    public static boolean SeBissexto(final int ano, final int bissextoRef) {
        if (ano == bissextoRef) {
            return true;
        } else if ((ano - bissextoRef) % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) {
            return true;
        }
        return false;
    }
}
