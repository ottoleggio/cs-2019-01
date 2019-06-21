package com.github.ottoleggio.cs.aula10.domain;

/**
 * Incremente ou decrementa uma data um dia
 * de cada vez levando em conta o último dia
 * de cada mês e o ano bissexto passado como
 * parâmetro em Strings que representam datas
 * no formato 'aaaammdd'.
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
    public static boolean seBissexto(final int ano,
            final int bissextoRef) {
        if (ano == bissextoRef) {
            return true;
        } else if ((ano - bissextoRef) % 4 == 0 &&
                (ano % 100 != 0 || ano % 400 == 0)) {
            return true;
        }
        return false;
    }

    /**
     * Identifica o último dia do mês de acordo com 
     * a data fornecida e o ano bissexto calculado.
     *
     * @param mes mês em que se deseja saber o último dia
     * @param ano ano para se saber se é bissexto ou não
     * @param bissextoRef Ano bissexto de referência
     *
     * @return um int representando o último dia do mês
     */
    public static int ultimoDiaDoMes(final int mes, final int ano,
            final int bissextoRef) {
        boolean seBissexto = seBissexto(ano, bissextoRef);

        switch(mes) {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
            return 31;
        case 4:
        case 6:
        case 9:
        case 11:
            return 30;
        case 2:
            if(seBissexto) {
                return 29;
            } else {
                return 28;
            }
        default:
            return 0;
        }
    }

    /**
     * Compara se duas datas passadas como inteiros
     * são iguais.
     *
     * @param diaUm Dia da primeira data a se comparar
     * @param mesUm Mês da primeira data a se comparar
     * @param anoUm Ano da primeira data a se comparar
     * @param diaDois Dia da segunda data a se comparar
     * @param mesDois Mês da segunda data a se comparar
     * @param anoDois Ano da segunda data a se comparar
     *
     * @return verdadeiro se as duas datas forem iguais e
     * falso caso o contrário
     */
    private static boolean comparaDatas(final int diaUm,
            final int mesUm, final int anoUm, final int diaDois,
            final int mesDois,final int anoDois) {
        if(anoUm == anoDois) {
            if(mesUm == mesDois) {
                if(diaUm == diaDois) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Conta a diferença de dias entre uma data menor e outra maior
     * considerando um ano bissexto informado como parâmetro.
     *
     * @param dataOrigem Data de origem
     * @param dataDestino Data de destino
     * @param bissextoRef Ano bissexto de referência
     *
     * @return inteiro do número de dias de diferença entre
     * as datas fornecidas
     */
    public static int avancaData(final String dataOrigem,
            final String dataDestino, final int bissextoRef) {
        int diaOrigem = extraiDia(dataOrigem);
        int mesOrigem = extraiMes(dataOrigem);
        int anoOrigem = extraiAno(dataOrigem);
        int diaDestino = extraiDia(dataDestino);
        int mesDestino = extraiMes(dataDestino);
        int anoDestino = extraiAno(dataDestino);
        int contadorDias = 0;

        while(!comparaDatas(diaOrigem, mesOrigem, anoOrigem,
                diaDestino, mesDestino, anoDestino)) {
            for(int j = mesOrigem; j <= 12; j++) {
                for(int i = diaOrigem; i <= ultimoDiaDoMes(mesOrigem,
                        anoOrigem, bissextoRef); i++) {
                    if(comparaDatas(diaOrigem, mesOrigem, anoOrigem,
                            diaDestino, mesDestino, anoDestino)) {
                        break;
                    }
                    diaOrigem++;
                    contadorDias++;
                }
                if(comparaDatas(diaOrigem, mesOrigem, anoOrigem,
                        diaDestino, mesDestino, anoDestino)) {
                    break;
                }
                diaOrigem = 1;
                mesOrigem++;
            }
            if(comparaDatas(diaOrigem, mesOrigem, anoOrigem,
                    diaDestino, mesDestino, anoDestino)) {
                break;
            }
            mesOrigem = 1;
            anoOrigem++;
        }

        return contadorDias;
    }

    /**
     * Conta a diferença de dias entre uma data maior e outra menor
     * considerando um ano bissexto informado como parâmetro.
     *
     * @param dataOrigem Data de origem
     * @param dataDestino Data de destino
     * @param bissextoRef Ano bissexto de referência
     *
     * @return inteiro do número de dias de diferença entre
     * as datas fornecidas
     */
    public static int recuaData(final String dataOrigem,
            final String dataDestino, final int bissextoRef) {
        int diaOrigem = extraiDia(dataOrigem);
        int mesOrigem = extraiMes(dataOrigem);
        int anoOrigem = extraiAno(dataOrigem);
        int diaDestino = extraiDia(dataDestino);
        int mesDestino = extraiMes(dataDestino);
        int anoDestino = extraiAno(dataDestino);
        int contadorDias = 0;

        while(!comparaDatas(diaOrigem, mesOrigem, anoOrigem,
                diaDestino, mesDestino, anoDestino)) {
            for(int j = mesOrigem; j > 0; j--) {
                for(int i = diaOrigem; i > 0; i--) {
                    if(comparaDatas(diaOrigem, mesOrigem, anoOrigem,
                            diaDestino, mesDestino, anoDestino)) {
                        break;
                    }
                    diaOrigem = recuaDia(bissextoRef, diaOrigem,
                            mesOrigem, anoOrigem);
                    contadorDias++;
                }
                if(comparaDatas(diaOrigem, mesOrigem, anoOrigem,
                        diaDestino, mesDestino, anoDestino)) {
                    break;
                }
                mesOrigem = recuaMes(mesOrigem);
                diaOrigem = ultimoDiaDoMes(mesOrigem, anoOrigem,
                        bissextoRef);
            }
            if(comparaDatas(diaOrigem, mesOrigem, anoOrigem,
                    diaDestino, mesDestino, anoDestino)) {
                break;
            }
            anoOrigem--;
        }

        return contadorDias;
    }

    /**
     * Retroage um dia numa data especificada
     * considerando o ano bissexto informado.
     *
     * @param dia Dia da data a recuar
     * @param mes Mês da data a recuar
     * @param ano Ano da data a recuar
     * @param bissextoRef Ano bissexto de referência
     * 
     * @return inteiro representando o dia anterior
     * da data informada
     */
    private static int recuaDia(final int bissextoRef, int dia, int mes, int ano) {
        if(dia == 1) {
            dia = ultimoDiaDoMes(mes-1, ano, bissextoRef);
        } else {
            dia--;
        }
        return dia;
    }

    /**
     * Retroage um mês para o mês anterior.
     *
     * @param mes Mês da data a recuar
     * 
     * @return inteiro representando o mês anterior
     * do mês informado
     */
    private static int recuaMes(int mes) {
        if(mes == 1) {
            mes = 12;
        } else {
            mes--;
        }
        return mes;
    }

    /**
     * Avança ao longo dos 7 dias da semana de acordo
     * com a quantidade de dias solicitado.
     *
     * @param qtdDia Quantidade dias a se avançar
     * @param diaSemanaRef Dia da semana inicial
     * 
     * @return inteiro que representa o dia da semana
     * após a iteração
     */
    public static int avancaDiaDaSemana(final int qtdDia, final int diaSemanaRef) {
        int iteradorDia = diaSemanaRef;

        for(int i = 0; i < qtdDia; i++) {
            iteradorDia++;
            if(iteradorDia == 7) {
                iteradorDia = 0;
            }
        }

        return iteradorDia;
    }

    /**
     * Recua ao longo dos 7 dias da semana de acordo
     * com a quantidade de dias solicitado.
     *
     * @param qtdDia Quantidade dias a se recuar
     * @param diaSemanaRef Dia da semana inicial
     * 
     * @return inteiro que representa o dia da semana
     * após a iteração
     */
    public static int recuaDiaDaSemana(final int qtdDia, final int diaSemanaRef) {
        int iteradorDia = diaSemanaRef;

        for(int i = 0; i < qtdDia; i++) {
            iteradorDia--;
            if(iteradorDia == -1) {
                iteradorDia = 6;
            }
        }
        
        return iteradorDia;
    }

    public static int qualDataMaior(String dataOrigem, String dataDestino) {
        int diaOrigem = extraiDia(dataOrigem);
        int mesOrigem = extraiMes(dataOrigem);
        int anoOrigem = extraiAno(dataOrigem);
        int diaDestino = extraiDia(dataDestino);
        int mesDestino = extraiMes(dataDestino);
        int anoDestino = extraiAno(dataDestino);

        if(anoDestino == anoOrigem) {
            if(mesDestino == mesOrigem) {
                if(diaOrigem > diaDestino) {
                    return -1;
                } else if(diaOrigem == diaDestino) {
                    return 0;
                } else {
                    return 1;
                }
            } else if(mesDestino > mesOrigem) {
                return 1;
            } else {
                return -1;
            }
        } else if(anoDestino > anoOrigem) {
            return 1;
        } else {
            return -1;
        }
    }

    public static int executaPrograma(String dataDestino, String anoBissexto, String dataInicial, String semanaReferencia) {
        String[] argumentos = {dataDestino, anoBissexto, dataInicial, semanaReferencia};
        if(ValidaEntradaUtils.validadorEntrada(argumentos) == -1) {
            return -1;
        }

        int resultado = -1;

        if(qualDataMaior(argumentos[2], argumentos[0]) == 0) {
            resultado = Integer.parseInt(argumentos[3]);
        }

        if(qualDataMaior(argumentos[2], argumentos[0]) == 1) {
            resultado = avancaDiaDaSemana(avancaData(argumentos[2], argumentos[0], Integer.parseInt(argumentos[1])), Integer.parseInt(argumentos[3]));
        }

        if(qualDataMaior(argumentos[2], argumentos[0]) == -1) {
            resultado = recuaDiaDaSemana(recuaData(argumentos[2], argumentos[0], Integer.parseInt(argumentos[1])), Integer.parseInt(argumentos[3]));
        }

        return resultado;
    }
}
