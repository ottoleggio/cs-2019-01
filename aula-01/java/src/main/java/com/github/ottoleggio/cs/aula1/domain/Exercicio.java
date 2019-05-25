package com.github.ottoleggio.cs.aula1.domain;

import java.math.BigDecimal;

/**
 * Funções matemáticas diversas com propósito de estudo das ferramentas e boas
 * práticas da disciplina de construção de software.
 */
public class Exercicio {

	/**
	 * Função que verifica se o quadrado da soma das dezenas da entrada
	 * resulta no próprio número.
	 *
	 * @param numero inteiro que terá as dezenas somadas
	 *
	 * @return {boolean} Retorna verdadeiro ou falso de acordo com a entrada
	 */
	public static boolean numero3025(final int numero) {
		final int limiteMax = 9999;
		final int mimiteMin = 0;
		final int centena = 100;

		if (numero < mimiteMin || numero > limiteMax) {
			throw new IllegalArgumentException("numero >=0 && "
					+ "numero <= 9999");
		}

		// Dois primeiros dígitos do número mcdu (primeira dezena)
		final int mc = numero / centena;

		// Dois últimos dígitos (segunda dezena)
		final int du = numero % centena;

		// Quadrado das somas das dezenas
		final int quadrado = (mc + du) * (mc + du);

		return quadrado == numero;
	}

	/**
	 * Função que verifica se a soma dos cubos dos dígitos fornecidos
	 * como entrada somam 153.
	 *
	 * @param numero inteiro que terá os dígitos somados
	 *
	 * @return {boolean} Retorna verdadeiro ou falso de acordo com a entrada
	 */
	public static boolean numero153(int numero) {
		final int limiteMax = 999;
		final int limiteMin = 100;
		final int cem = 100;
		final int dez = 10;

		if (numero < limiteMin || numero > limiteMax) {
			throw new IllegalArgumentException("numero >=100 & "
		+ "numero <= 999");
		}

		int divisorCem = cem;
		int divisoDez = dez;
		int centena = numero / divisorCem;
		int du = numero % divisorCem;
		int dezena = du / divisoDez;
		int unidade = du % divisoDez;
		int cdu = (int) (Math.pow(centena, 3) + Math.pow(dezena, 3)
		+ Math.pow(unidade, 3));
		return cdu == numero;
	}

	/**
	 * Produz um numero inteiro que representa o dia da semana
	 * a partir da data fornecida.
	 *
	 * @param dia inteiro que representa o dia do mês
	 * @param mes inteiro que representa o mês no ano
	 * @param ano inteiro que representa o ano
	 *
	 * @return {double} O valor retornado é 0 para segunda-feira,
	 * 1 para terça-feira e assim sucessivamente.
	 */
	public static double diaDaSemana(final int dia, int mes, int ano) {
		verificaData(dia, mes, ano);

		if (mes == 1 || mes == 2) {
			mes += 12;
			ano -= 1;
		}

		int drDobbsExpr = dia + 2 * mes + 3 * (mes + 1)
		/ 5 + ano + ano / 4 - ano / 100 + ano / 400;

		return drDobbsExpr % 7;
	}

	/**
	 * Valida se a data usada como parametro está nos critérios
	 * estabelecidos da função diaDaSemana.
	 *
	 * @param dia inteiro que representa o dia do mês
	 * @param mes inteiro que representa o mês do ano
	 * @param ano inteiro que representa o ano
	 *
	 */
	private static void verificaData(final int dia, final int mes,
	final int ano) {
		verificaDia(dia);
		verificaMes(mes);
		verificaAno(ano);
	}

	/**
	 * Valida se o dia usado como parametro está nos
	 * critérios estabelecidos da função diaDaSemana.
	 *
	 * @param dia inteiro que representa o dia do mês
	 *
	 */
	private static void verificaDia(final int dia) {
		final int limiteMin = 1;
		final int limiteMax = 31;

		if (dia < limiteMin || dia > limiteMax) {
			throw new IllegalArgumentException("dia inválido");
		}
	}

	/**
	 * Valida se o mês usado como parametro está nos critérios
	 * estabelecidos da função diaDaSemana.
	 *
	 * @param mes inteiro que representa o mês do ano
	 *
	 */
	private static void verificaMes(final int mes) {
		final int limiteMin = 1;
		final int limiteMax = 12;

		if (mes < limiteMin || mes > limiteMax) {
			throw new IllegalArgumentException("mês inválido");
		}
	}

	/**
	 * Valida se o ano usado como parametro está nos
	 * critérios estabelecidos da função diaDaSemana.
	 *
	 * @param ano inteiro que representa o ano
	 *
	 */
	private static void verificaAno(final int ano) {
		if (ano < 1753) {
			throw new IllegalArgumentException("ano inválido");
		}
	}

	/**
	 * Função matemática que retorna o resto de uma
	 * divisão entre dois numeros.
	 *
	 * @param dividendo inteiro que será o dividendo da operação
	 * @param divisor   inteiro que será o divisor da operação
	 *
	 * @return {int} Retorna o resto da divisao entre os dois parametros
	 */
	public static int mod(final int dividendo, final int divisor) {

		if (divisor <= 0 || dividendo < 0) {
			throw new IllegalArgumentException("divisor >= 0 "
		+ "&& dividendo > 0");
		}

		int resto = dividendo;
		while (divisor <= resto) {
			resto = resto - divisor;
		}

		return resto;
	}

	/**
	 * Função que retorna a soma de numeros naturais dada a
	 * quantidade de numeros a serem sequencialmente somados.
	 *
	 * @param numero inteiro que representa a quantidade de
	 * numeros a serem somados
	 *
	 * @return {int} Retorna a soma dos numeros naturais somados
	 */
	public static int somaNaturais(final int numero) {
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

	/**
	 * Funçao matemática que retorna o fatorial do numero
	 * fornecido na entrada.
	 *
	 * @param numero Inteiro que representa o fatorial a ser calculado
	 *
	 * @return {int} Resultado do número fatorial
	 */
	public static int fatorial(final int numero) {
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

	/**
	 * Função que retorna o produto entre dois numeros
	 * fornecidos como entrada.
	 *
	 * @param numeroA inteiro que representa o primeiro fator do produto
	 * @param numeroB inteiro que representa o segundo fator do produto
	 *
	 * @return {int} Retorna o produto das duas entradas
	 */
	public static int produto(final int numeroA, final int numeroB) {
		if (numeroA < 0 || numeroB < 0) {
			throw new IllegalArgumentException("numeroA >= 0 "
		+ "&& numeroB < 0");
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

	/**
	 * Função matemática que executa a operação de potenciação.
	 *
	 * @param base     inteiro que representa a base da potenciação
	 * @param expoente inteiro que representa o expoente da potenciação
	 *
	 * @return {int} Retorna o resultado da operação entre as duas entradas
	 */
	public static int potencia(final int base, final int expoente) {
		if (base < 0 || expoente < 0) {
			throw new IllegalArgumentException("base >= 0 "
		+ "&& expoente >= 0");
		}

		int potencia = 1;
		int i = 1;

		while (i <= expoente) {
			potencia = produto(potencia, base);
			i = i + 1;
		}

		return potencia;
	}

	/**
	 * Função que retorna n números das casas decimais de pi.
	 *
	 * @param numero inteiro que representa a quantidade de
	 * casas decimais a serem representadas
	 *
	 * @return {double} {double} Retorna o numero pi
	 */
	public static double pi(final double numero) {
		if (numero < 1) {
			throw new IllegalArgumentException("numero >= 1");
		}

		int i = 0;
		double s = -1;
		double d = -1;
		double resultado = 0;

		while (i <= numero) {
			final int consta = 4;
			d = d + 2;
			s = -1 * s;
			resultado = resultado + ((consta * s) / d);
			i++;
		}

		return resultado;
	}

	/**
	 * Função que retorna a potência do numero de Euler.
	 *
	 * @param numero     inteiro que representa o numerador
	 * @param repeticoes define a precisao do calculo
	 *
	 * @return {double} Retorna a potência do numero de Euler
	 */
	public static double logaritmoNatural(final double numero,
	final double repeticoes) {
		if (numero < 1 || repeticoes < 2) {
			throw new IllegalArgumentException("numero >= 1 "
			+ "&& repeticoes >= 2");
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

	/**
	 * Função que calcula a Razao Áurea.
	 *
	 * @param numeroA    inteiro utilizado na soma
	 * @param numeroB    inteiro utilizado na soma
	 * @param repeticoes define a quantidade de iterações da
	 * soma a ser realizada
	 *
	 * @return {double} Retorna a Razão Áurea
	 */
	public static double razaoAurea(final int numeroA, final int numeroB,
	final int repeticoes) {
		if (numeroA < 0 || numeroB < numeroA || repeticoes <= 0) {
			throw new IllegalArgumentException("numeroA >= 0 "
			+ "&& numeroB > numeroA && repeticoes > 0");
		}

		double dividendo = numeroB;
		double divisor = numeroA;
		int i = 1;
		double t;

		while (i <= repeticoes) {
			t = dividendo;
			dividendo = dividendo + divisor;
			divisor = t;
			i++;
		}

		return dividendo / divisor;
	}

	/**
	 * Função que verifica se a operação é um quadrado perfeito.
	 *
	 * @param numero número a ser elevado a enésima potencia
	 *
	 * @return {boolean} Retorna verdadeiro ou falso
	 */
	public static boolean quadradoPerfeito(final double numero) {
		if (numero < 1) {
			throw new IllegalArgumentException("'numero' deve"
			+ " ser >= a 1");
		}

		double i = 1;
		double soma = 1;

		while (soma < numero) {
			i = i + 2;
			soma = soma + i;
		}
		BigDecimal soma2 = new BigDecimal(soma);
		BigDecimal numero2 = new BigDecimal(numero);
		return soma2.compareTo(numero2) == 0;
	}

	/**
	 * Função matemática que faz o cálculo da raiz.
	 *
	 * @param numero inteiro que representa o radicando
	 * @param i      inteiro que representa o índice
	 *
	 * @return {double} Retorna o resultado da raiz
	 */
	public static double raiz(final double numero, double i) {
		if (numero <= 0) {
			throw new IllegalArgumentException("'numero' deve"
			+ " ser maior que 0");
		}

		double raizR = 1;

		while (0 <= i) {
			raizR = (raizR + numero / raizR) / 2;
			i = i - 1;

		}

		return raizR;
	}

	/**
	 * Função que verifica se o número é primo.
	 *
	 * @param numero inteiro a ser verificado
	 *
	 * @return {boolean} Retorna verdadeiro ou falso
	 */
	public static boolean primo(final int numero) {
		if (numero <= 1) {
			throw new IllegalArgumentException("'numero' deve"
			+ " ser maior que 1");
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

	/**
	 * Função que calcula o Crivo de Eratostenes.
	 *
	 * @param original vetor utilizado na operação
	 *
	 * @return {int[]} Retorna o valor do Crivo de Eratostenes
	 */
	public static boolean crivoEratostenes(final int[] original) {
		int[] vetor = original.clone();

		if (vetor.length <= 1) {
			throw new IllegalArgumentException("o vetor deve"
			+ " conter no mínimo 2 dígitos");
		}

		final int tamanho = vetor.length - 1;

		double limite = Math.floor(Math.sqrt(tamanho));

		for (int i = 2; i <= limite; i++) {
			if (vetor[i] == 0) {
				int multiplo = i + i;
				while (multiplo <= tamanho) {
					vetor[multiplo] = 1;
					multiplo = multiplo + i;
				}
			}
		}

		return vetor[tamanho] == 1;
	}

	/**
	 * Função que calcula o maior divisor comum.
	 *
	 * @param numeroA inteiro que representa o dividendo
	 * @param numeroB inteiro que representa o divisor
	 *
	 * @return {double} Retorna o maior divisor comum
	 */
	public static double mdc(double numeroA, double numeroB) {
		if (numeroB > numeroA || 0 >= numeroB) {
			throw new IllegalArgumentException("'numeroB' deve ser"
			+ " <= 'numeroA' e numeroB deve ser < 0");
		}

		double resto;

		while (numeroB != 0) {
			resto = numeroA % numeroB;
			numeroA = numeroB;
			numeroB = resto;
		}

		return numeroA;
	}

	/**
	 * Função que calcula o maior divisor comum.
	 *
	 * @param numeroA inteiro que representa o dividendo
	 * @param numeroB inteiro que representa o divisor
	 *
	 * @return {double} Retorna o maior divisor comum
	 */
	public static double mdc2(int numeroA, int numeroB) {
		if (numeroB > numeroA || 0 >= numeroB) {
			throw new IllegalArgumentException("'numeroB' deve"
			+ " ser <= 'numeroA' e numeroB deve ser < 0");
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

	/**
	 * Função que avalia um polinômio de acordo com a regra de Horner.
	 *
	 * @param numero inteiro utilizado no calculo
	 * @param vetor  inteiro que representa o polinomio
	 *
	 * @return {int} Retorna o resultado do polinomio
	 */
	public static int horner(final int numero, final int[] vetor) {
		if (numero < 1) {
			throw new IllegalArgumentException("O comprimento"
			+ " do vetor deve ser maior ou igual a 1");
		}

		int resultado = vetor[vetor.length - 1];

		for (int i = vetor.length - 1; i >= 0; i--) {
			resultado = resultado * (numero + vetor[i]);
		}

		return resultado;
	}

	/**
	 * Função que obtém o n-ésimo número de Fibonacci.
	 *
	 * @param numero inteiro que representa a quantidade
	 * de iterações do cálculo
	 *
	 * @return {int} Retorna o número de Fibonnaci na n-ésima posição
	 */
	public static int fibonacci(int numero) {
		if (numero < 0) {
			throw new IllegalArgumentException("O número deve"
			+ " ser maior ou igual a 0");
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

	/**
	 * Função que valida um número de CPF de acordo com seus
	 * dígitos verificadores.
	 *
	 * @param vetor sequência de números que representa um CPF
	 *
	 * @return {boolean} Retorna verdadeiro ou falso
	 */
	public static boolean digitoCPF(final int[] vetor) {
		if (vetor.length != 11) {
			throw new IllegalArgumentException("Insira a quantidade"
			+ " correta de dígitos (11)");
		}

		int i = 0;

		for (i = 0; i < 11; i++) {
			if (vetor[i] > 9 || vetor[i] < 0) {
				throw new IllegalArgumentException("O número"
				+ " deve estar entre 0 e 9");
			}
		}

		int testeA = 0;
		int testeB = 0;

		for (i = 0; i < 9; i++) {
			testeA += ((i + 1) * vetor[i]);
			testeB += ((i + 1) * vetor[i + 1]);
		}

		int digitoA = mod(mod(testeA, 11), 10);
		int digitoB = mod(mod(testeB, 11), 10);
		return (digitoA == vetor[9] && digitoB == vetor[10]);
	}

	/**
	 * Função que valida um número de CPF de acordo com seus
	 * dígitos verificadores.
	 *
	 * @param vetor sequência de números que representa um CPF
	 *
	 * @return {boolean} Retorna verdadeiro ou falso
	 */
	public static boolean digitoCPF2(final int[] vetor) {
		if (vetor.length != 11) {
			throw new IllegalArgumentException("Insira a quantidade"
			+ " correta de dígitos (11)");
		}

		int i = 0;

		for (i = 0; i < 11; i++) {
			if (vetor[i] > 9 || vetor[i] < 0) {
				throw new IllegalArgumentException(
				"O número deve estar entre 0 e 9");
			}
		}

		i = 7;
		int testeA = vetor[8];
		int testeB = vetor[8];

		while (0 <= i) {
			testeA = testeA + vetor[i];
			testeB = testeB + testeA;
			i = i - 1;
		}

		int digitoA = mod(mod(testeB, 11), 10);
		int digitoB = mod(mod(testeB - testeA + 
		(9 * vetor[9]), 11), 10);

		return (digitoA == vetor[9]) && (digitoB == vetor[10]);
	}
}
