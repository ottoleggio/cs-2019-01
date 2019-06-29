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
     * Posição da string de data no formato 'yyyymmdd' onde
     * está o início do dia.
     */
    private static final int STR_DIA_INICIO = 6;
    /**
     * Posição da string de data no formato 'yyyymmdd' onde
     * está o fim do dia.
     */
    private static final int STR_DIA_FIM = 8;
    /**
     * Posição da string de data no formato 'yyyymmdd' onde
     * está o início do mês.
     */
    private static final int STR_MES_INICIO = 4;
    /**
     * Posição da string de data no formato 'yyyymmdd' onde
     * está o fim do mês.
     */
    private static final int STR_MES_FIM = 6;
    /**
     * Posição da string de data no formato 'yyyymmdd' onde
     * está o início do ano.
     */
    private static final int STR_ANO_INICIO = 0;
    /**
     * Posição da string de data no formato 'yyyymmdd' onde
     * está o fim do ano.
     */
    private static final int STR_ANO_FIM = 4;
    /**
     * Quantidade de dias que o mês de fevereiro tem em anos
     * não bissextos.
     */
    private static final int ULT_DIA_28 = 28;
    /**
     * Quantidade de dias que o mês de fevereiro tem em anos
     * bissextos.
     */
    private static final int ULT_DIA_29 = 29;
    /**
     * Quantidade de dias para meses com 30 dias.
     */
    private static final int ULT_DIA_30 = 30;
    /**
     * Quantidade de dias para meses com 31 dias.
     */
    private static final int ULT_DIA_31 = 31;
    /**
     * Número que representa o mês de janeiro.
     */
    private static final int MES_JANEIRO = 1;
    /**
     * Número que representa o mês de fevereiro.
     */
    private static final int MES_FEVEREIRO = 2;
    /**
     * Número que representa o mês de março.
     */
    private static final int MES_MARCO = 3;
    /**
     * Número que representa o mês de abril.
     */
    private static final int MES_ABRIL = 4;
    /**
     * Número que representa o mês de maio.
     */
    private static final int MES_MAIO = 5;
    /**
     * Número que representa o mês de junho.
     */
    private static final int MES_JUNHO = 6;
    /**
     * Número que representa o mês de julho.
     */
    private static final int MES_JULHO = 7;
    /**
     * Número que representa o mês de agosto.
     */
    private static final int MES_AGOSTO = 8;
    /**
     * Número que representa o mês de setembro.
     */
    private static final int MES_SETEMBRO = 9;
    /**
     * Número que representa o mês de outubro.
     */
    private static final int MES_OUTUBRO = 10;
    /**
     * Número que representa o mês de novembro.
     */
    private static final int MES_NOVEMBRO = 11;
    /**
     * Número que representa o mês de dezembro.
     */
    private static final int MES_DEZEMBRO = 12;
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
    private static final int DATA_REF = 2;
    /**
     * Posição do vetor de strings passado como argumento
     * que representa o dia da semana.
     */
    private static final int DIA_DA_SEMANA = 3;

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
        return Integer.parseInt(dataEntrada.substring(
            STR_DIA_INICIO, STR_DIA_FIM));
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
        return Integer.parseInt(dataEntrada.substring(
            STR_MES_INICIO, STR_MES_FIM));
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
        return Integer.parseInt(dataEntrada.substring(
            STR_ANO_INICIO, STR_ANO_FIM));
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
        final int quatrocentos = 400;
        final int cem = 100;
        final int quatro = 4;

        if (ano == bissextoRef) {
            return true;
        } else if ((ano - bissextoRef) % quatro == 0
                && (ano % cem != 0 || ano % quatrocentos == 0)) {
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
        final boolean seBissexto = seBissexto(ano, bissextoRef);

        switch (mes) {
        case MES_JANEIRO:
        case MES_MARCO:
        case MES_MAIO:
        case MES_JULHO:
        case MES_AGOSTO:
        case MES_OUTUBRO:
        case MES_DEZEMBRO:
            return ULT_DIA_31;
        case MES_ABRIL:
        case MES_JUNHO:
        case MES_SETEMBRO:
        case MES_NOVEMBRO:
            return ULT_DIA_30;
        case MES_FEVEREIRO:
            return ultDiaFevereiro(seBissexto);
        default:
            return 0;
        }
    }

    private static int ultDiaFevereiro(final boolean seBissexto) {
        if (seBissexto) {
            return ULT_DIA_29;
        } else {
            return ULT_DIA_28;
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
            final int mesDois, final int anoDois) {
        return anoUm == anoDois && mesUm == mesDois && diaUm == diaDois;
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
        final int diaDestino = extraiDia(dataDestino);
        final int mesDestino = extraiMes(dataDestino);
        final int anoDestino = extraiAno(dataDestino);
        int contadorDias = 0;
        final int dezembro = 12;

        while (!comparaDatas(diaOrigem, mesOrigem, anoOrigem,
                diaDestino, mesDestino, anoDestino)) {
            for (int j = mesOrigem; j <= dezembro; j++) {
                for (int i = diaOrigem; i <= ultimoDiaDoMes(mesOrigem,
                        anoOrigem, bissextoRef); i++) {
                    if (comparaDatas(diaOrigem, mesOrigem, anoOrigem,
                            diaDestino, mesDestino, anoDestino)) {
                        break;
                    }
                    diaOrigem++;
                    contadorDias++;
                }
                if (comparaDatas(diaOrigem, mesOrigem, anoOrigem,
                        diaDestino, mesDestino, anoDestino)) {
                    break;
                }
                diaOrigem = 1;
                mesOrigem++;
            }
            if (comparaDatas(diaOrigem, mesOrigem, anoOrigem,
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
        final int diaDestino = extraiDia(dataDestino);
        final int mesDestino = extraiMes(dataDestino);
        final int anoDestino = extraiAno(dataDestino);
        int contadorDias = 0;

        while (!comparaDatas(diaOrigem, mesOrigem, anoOrigem,
                diaDestino, mesDestino, anoDestino)) {
            for (int j = mesOrigem; j > 0; j--) {
                for (int i = diaOrigem; i > 0; i--) {
                    if (comparaDatas(diaOrigem, mesOrigem, anoOrigem,
                            diaDestino, mesDestino, anoDestino)) {
                        break;
                    }
                    diaOrigem = recuaDia(bissextoRef, diaOrigem,
                            mesOrigem, anoOrigem);
                    contadorDias++;
                }
                if (comparaDatas(diaOrigem, mesOrigem, anoOrigem,
                        diaDestino, mesDestino, anoDestino)) {
                    break;
                }
                mesOrigem = recuaMes(mesOrigem);
                diaOrigem = ultimoDiaDoMes(mesOrigem, anoOrigem,
                        bissextoRef);
            }
            if (comparaDatas(diaOrigem, mesOrigem, anoOrigem,
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
     * @param diaRef Dia da data a recuar
     * @param mes Mês da data a recuar
     * @param ano Ano da data a recuar
     * @param bissextoRef Ano bissexto de referência
     *
     * @return inteiro representando o dia anterior
     * da data informada
     */
    private static int recuaDia(final int bissextoRef, final int diaRef,
        final int mes, final int ano) {
        int dia = diaRef;
        final int primeiroDia = 1;

        if (dia == primeiroDia) {
            dia = ultimoDiaDoMes(mes - 1, ano, bissextoRef);
        } else {
            dia--;
        }
        return dia;
    }

    /**
     * Retroage um mês para o mês anterior.
     *
     * @param mesRef Mês da data a recuar
     *
     * @return inteiro representando o mês anterior
     * do mês informado
     */
    private static int recuaMes(final int mesRef) {
        int mes = mesRef;
        final int dezembro = 12;
        final int janeiro = 1;

        if (mes == janeiro) {
            mes = dezembro;
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
    public static int avancaDiaDaSemana(final int qtdDia,
        final int diaSemanaRef) {
        int iteradorDia = diaSemanaRef;
        final int limiteDias = 7;

        for (int i = 0; i < qtdDia; i++) {
            iteradorDia++;
            if (iteradorDia == limiteDias) {
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
    public static int recuaDiaDaSemana(final int qtdDia,
        final int diaSemanaRef) {
        int iteradorDia = diaSemanaRef;
        final int domingo = 6;

        for (int i = 0; i < qtdDia; i++) {
            iteradorDia--;
            if (iteradorDia == -1) {
                iteradorDia = domingo;
            }
        }

        return iteradorDia;
    }

    /**
     * Identifica se uma data enviada como String
     * no formato 'yyyymmdd' é maior, menor ou igual que uma
     * segunda data.
     *
     * @param dataOrigem Data de origem
     * @param dataDestino Data de destino
     *
     * @return Retorna 1 para maior, 0 para igual e -1
     * para menor
     */
    public static int qualDataMaior(final String dataOrigem,
        final String dataDestino) {
        final int diaOrigem = extraiDia(dataOrigem);
        final int mesOrigem = extraiMes(dataOrigem);
        final int anoOrigem = extraiAno(dataOrigem);
        final int diaDestino = extraiDia(dataDestino);
        final int mesDestino = extraiMes(dataDestino);
        final int anoDestino = extraiAno(dataDestino);

        if (anoDestino == anoOrigem) {
            if (mesDestino == mesOrigem) {
                if (diaOrigem > diaDestino) {
                    return -1;
                } else if (diaOrigem == diaDestino) {
                    return 0;
                } else {
                    return 1;
                }
            } else if (mesDestino > mesOrigem) {
                return 1;
            } else {
                return -1;
            }
        } else if (anoDestino > anoOrigem) {
            return 1;
        } else {
            return -1;
        }
    }

    /**
     * Recebe vetor de Strings, analisa todos os casos
     * de excessão e, caso válido, executa a iteração
     * das datas.
     *
     * @param argumentos Vetor de Strings em que se espera
     * data de interesse, ano bissexto, data de referência e
     * dia da semana de referência
     *
     * @return Retorna -1 para inválido ou um int que representa
     * um dia da semana, começando em 0 para segunda-feira e
     * finalizando em 6 para domingo
     */
    public static int executaPrograma(final String[] argumentos) {
        if (ValidaEntradaUtils.validadorEntrada(argumentos) == -1) {
            return -1;
        }

        int resultado = -1;
        final int igual = 0;

        if (qualDataMaior(argumentos[DATA_REF],
        argumentos[DATA_INTERESSE]) == igual) {
            resultado = Integer.parseInt(argumentos[DIA_DA_SEMANA]);
        }

        final int maior = 1;

        if (qualDataMaior(argumentos[DATA_REF],
        argumentos[DATA_INTERESSE]) == maior) {
            resultado = avancaDiaDaSemana(avancaData(
                argumentos[DATA_REF],
                argumentos[DATA_INTERESSE],
                Integer.parseInt(argumentos[ANO_BISSEXTO])),
                Integer.parseInt(argumentos[DIA_DA_SEMANA]));
        }

        final int menor = -1;

        if (qualDataMaior(argumentos[DATA_REF],
        argumentos[DATA_INTERESSE]) == menor) {
            resultado = recuaDiaDaSemana(recuaData(
                argumentos[DATA_REF],
                argumentos[DATA_INTERESSE],
                Integer.parseInt(argumentos[ANO_BISSEXTO])),
                Integer.parseInt(argumentos[DIA_DA_SEMANA]));
        }

        return resultado;
    }
}
