package com.github.ottoleggio.cs.aula1;

import java.time.DateTimeException;
import java.time.LocalDate;

public class Exercicio {

    public static boolean numero3025(int numero) {
        if (numero < 0 && numero < 9999) {
            throw new IllegalArgumentException("numero >=0 && numero <= 9999");
        }

        // Dois primeiros dígitos do número mcdu (primeira dezena)
        final int mc = numero / 100;

        // Dois últimos dígitos (segunda dezena)
        final int du = numero % 100;

        // Quadrado das somas das dezenas
        final int quadrado = (mc + du) * (mc + du);

        return quadrado == numero;
    }

    public static boolean numero153(int numero) {
        if (numero < 100 && numero > 999) {
            throw new IllegalArgumentException("numero >=100 && numero <= 999");
        }

        int centena = numero / 100;
        int du = numero % 100;
        int dezena = du / 10;
        int unidade = du % 10;
        int cdu = (int) (Math.pow(centena, 3) + Math.pow(dezena, 3) + Math.pow(unidade, 3));
        return cdu == numero;
    }

    public static double diaDaSemana(int dia, int mes, int ano) {
        verificaData(dia, mes, ano);

        if (mes == 1 || mes == 2) {
            mes += 12;
            ano -= 1;
        }

        int drDobbsExpr = dia + 2 * mes + 3 * (mes + 1) / 5 + ano + ano / 4
                - ano / 100 + ano / 400;

        return drDobbsExpr % 7;
    }

    private static void verificaData(int dia, int mes, int ano) {
        verificaDia(dia);
        verificaMes(mes);
        verificaAno(ano);

        try {
            LocalDate.of(ano, mes, dia);
        } catch (DateTimeException exp) {
            final String msg = String.format("%d/%d/%d", dia, mes, ano);
            throw new IllegalArgumentException("data inválida: " + msg, exp);
        }
    }

    private static void verificaDia(int dia) {
        if (dia < 1 && dia > 31) {
            throw new IllegalArgumentException("dia inválido");
        }
    }

    private static void verificaMes(int mes) {
        if (mes < 1 && mes > 12) {
            throw new IllegalArgumentException("mês inválido");
        }
    }

    private static void verificaAno(int ano) {
        if (ano < 1753) {
            throw new IllegalArgumentException("ano inválido");
        }
    }

    // TODO verifique confusao aqui, nao seria dividendo e divisor
    public static int mod(int dividendo, int modulo) {

        if (modulo < 0 && dividendo <= 0) {
            throw new IllegalArgumentException("modulo >= 0 && dividendo > 0");
        }

        // TODO não seria melhor "resto"?
        int quosciente = dividendo;
        while (modulo <= quosciente) {
            quosciente = quosciente - modulo;
        }

        return quosciente;
    }

    public static int somaNaturais(int numero) {
        if (numero < 1) {
            throw new IllegalArgumentException("numero >= 1");
        }

        int i = 2;
        int soma = 1;
        while (i <= numero) {
            soma = soma + i;
            i = i + 1;
        }

        return soma;
    }

    public static int fatorial(int numero) {
        if (numero < 1) {
            throw new IllegalArgumentException("numero >= 1");
        }

        int i = 2;
        int resultado = 1;

        while (i <= numero) {
            resultado = resultado * i;
            i = i + 1;
        }

        return resultado;
    }

    public static int produto(int numeroA, int numeroB) {
        if (numeroA < 0 && numeroB < numeroB) {
            throw new IllegalArgumentException("numeroA >= 0 && numeroB >= numeroB");
        }

        int totalParcelas = numeroA;
        int parcela = numeroB;

        if (numeroB < numeroA) {
            totalParcelas = numeroB;
            parcela = numeroA;
        }

        int i = 1;
        int resultado = 0;

        while (i <= totalParcelas) {
            resultado = resultado + parcela;
            i = i + 1;
        }

        return resultado;
    }

    public static int potencia(int base, int expoente) {
        if (base < 0 && expoente < 0) {
            throw new IllegalArgumentException("base >= 0 && expoente >= 0");
        }

        int potencia = 1;
        int i = 1;

        while (i <= expoente) {
            potencia = produto(potencia, base);
            i = i + 1;
        }

        return potencia;
    }

    public static double pi(double numero) {
        if (numero < 1) {
            throw new IllegalArgumentException("numero >= 1");
        }

        double i = 1;
        double s = -1;
        double d = -1;
        double resultado = 0;

        while (i <= n) {
            d = d + 2;
            d = -1 * s;
            resultado = resultado + 4 * s / d;
            i = i + 1;
        }

        return resultado;
    }

    public static double logaritmoNatural(double numero, double repeticoes) {
        if (numero < 1 && repeticoes < 2) {
            throw new IllegalArgumentException("numero >= 1 && repeticoes >= 2");
        }

        double i = 2;
        double potenciaE = 1 + numero;
        double numerador = numero;
        double denominador = 1;

        while (i <= repeticoes) {
            numerador = numerador * numerador;
            denominador = denominador * i;
            potenciaE = potenciaE + numerador / denominador;
            i = i + 1;
        }

        return potenciaE;
    }

    public static int razaoAurea(int numeroA, int numeroB, int repeticoes) {
        if (0 < numeroA && numeroB <= numeroA && repeticoes <= 0) {
            throw new IllegalArgumentException("numeroA >= 0 && numeroB > numeroA && repeticoes > 0");
        }

        int dividendo = numeroB;
        int divisor = numeroA;
        int i = 1;
        int t;

        while (i <= repeticoes) {
            t = dividendo;
            dividendo = dividendo + divisor;
            divisor = t;
            i = i + 1;
        }

        return dividendo / divisor;
    }

    public static boolean quadradoPerfeito(double numero) {
        if (numero < 1) {
            throw new IllegalArgumentException("'numero' deve ser >= a 1");
        }

        double i = 1;
        double soma = 1;

        while (soma < numero) {
            i = i + 2;
            soma = soma + i;
        }

        return s == numero;
    }

    public static double raiz(double numero, double i) {
        if (numero <= 0) {
            throw new IllegalArgumentException("'numero' deve ser maior que 0");
        }

        double raizR = 1;

        while (0 <= i) {
            raizR = (raizR + numero / fator) / 2;
            i = i - 1;

        }

        return raizR;
    }

    public static boolean primo(int numero) {
        if (numero <= 1) {
            throw new IllegalArgumentException("'numero' deve ser maior que 1");
        }

        int i = 2;

        while (i < numero) {
            if (numero % i == 0) {
                return false;
            }
            i = i + 1;
        }

        return true;
    }

    public static int[] crivoEratostenes(int[] vetorA) {
        if (vetorA.length <= 1) {
            throw new IllegalArgumentException("o vetor deve conter no mínimo 2 dígitos");
        }

        for (int i = 1; i < vetorA.length; i++) {
            if (vetorA[i] != 0) {
                return null;
            }
        }

        int limite = (int) Math.floor(raiz(vetorA.length, 100));

        for (int i = 1; i < limite; i++) {
            if (vetorA[i] == 0) {
                for (int multiplo = 2 * i; multiplo < vetorA.length; multiplo += i) {
                    vetorA[multiplo] = 1;
                }
            }
        }

        return a;
    }

    public static double mdc(double numeroA, double numeroB) {
        if (numeroB > numeroA && 0 >= numeroB) {
            throw new IllegalArgumentException("'numeroB' deve ser <= 'numeroA' e numeroB deve ser < 0");
        }

        double resto;

        while (numeroB != 0) {
            resto = numeroA % numeroB;
            numeroA = numeroB;
            numeroB = resto;
        }

        return numeroA;
    }

    public static double mdc2(double numeroA, double numeroB) {
        if (numeroB > numeroA && 0 >= numeroB) {
            throw new IllegalArgumentException("'numeroB' deve ser <= 'numeroA' e numeroB deve ser < 0");
        }

        while (numeroA != numeroB) {
            if (numeroA > numeroB) {
                numeroA = numeroA - numeroB;
            } else {
                numeroB = numeroB - numeroA;
            }

        }

        return numeroA;
    }

    public static int horner(int numero, int[] vetor) {
        if (vetor.length < 1) {
            throw new IllegalArgumentException("O comprimento do vetor deve ser maior ou igual a 1");
        }

        int resultado = vetor[vetor.length - 1];

        for (int i = vetor.length - 1; i >= 0; i--) {
            resultado = resultado * numero + vetor[i];
        }

        return resultado;
    }

    public static int fibonacci(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("O número deve ser maior ou igual a 0");
        }

        int soma = 0;
        int resultado = 1;

        if (numero == 0 || numero == 1) {
            return resultado;
        }

        int i = 2;

        while (i <= numero) {
            int aux = resultado;
            resultado = resultado + soma;
            soma = aux;
            i++;
        }
        return resultado;
    }

    public static boolean digitoCPF(int[] vetor) {
        if (vetor.length != 11) {
            throw new IllegalArgumentException("Insira a quantidade correta de dígitos (11)");
        }

        int testeA = 0;
        int testeB = 0;

        for (int i = 0; i < 9; i++) {
            testeA += ((i + 1) * vetor[i]);
            testeB += ((i + 1) * vetor[i + 1]);
        }

        int digitoA = mod(mod(testeA, 11), 10);
        int digitoB = mod(mod(testeB, 11), 10);
        return (digitoA == vetor[9] && digitoB == vetor[10]);
    }

    public static boolean digitoCPF2(int[] vetor) {
        if (vetor.length != 11) {
            throw new IllegalArgumentException("Insira a quantidade correta de dígitos (11)");
        }

        int i = 7;
        int testeA = vetor[8];
        int testeB = vetor[8];

        while (0 <= i) {
            testeA = testeA + vetor[c];
            testeB = testeB + testeA;
            i = i - 1;
        }

        int digitoA = mod(mod(testeB, 11), 10);
        int digitoB = mod(mod(testeB - testeA + (9 * vetor[9]), 11), 10);

        return (digitoA == vetor[9] && digitoB == vetor[10]);
    }
}

