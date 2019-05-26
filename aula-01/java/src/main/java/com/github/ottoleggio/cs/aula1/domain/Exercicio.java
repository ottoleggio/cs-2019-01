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
		final int primDezena = numero / centena;

		// Dois últimos dígitos (segunda dezena)
		final int degDezena = numero % centena;

		// Quadrado das somas das dezenas
		final int quadrado = (primDezena + degDezena)
		* (primDezena + degDezena);

		return quadrado == numero;
	}

	/**
	 * Função que verifica se a soma dos cubos dos dígitos fornecidos
	 * como entrada somam 153.
	 *
	 * @param valor inteiro que terá os dígitos somados
	 *
	 * @return {boolean} Retorna verdadeiro ou falso de acordo com a entrada
	 */
	public static boolean numero153(final int valor) {
		final int limiteMax = 999;
		final int limiteMin = 100;
		final int cem = 100;
		final int dez = 10;
		final int numero = valor;

		if (numero < limiteMin || numero > limiteMax) {
			throw new IllegalArgumentException("numero >=100 & "
		+ "numero <= 999");
		}
		final int potencia = 3;
		final int divisorCem = cem;
		final int divisoDez = dez;
		final int centena = numero / divisorCem;
		final int resto = numero % divisorCem;
		final int dezena = resto / divisoDez;
		final int unidade = resto % divisoDez;
		final int cdu = (int) (Math.pow(centena, potencia)
		+ Math.pow(dezena, potencia)
		+ Math.pow(unidade, potencia));
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
	public static double diaDaSemana(final int dia,
	final int mes, final int ano) {
		verificaData(dia, mes, ano);

		final int funcDia = dia;
		int funcMes = mes;
		int funcAno = ano;
		final int umAno = 12;
		final int umMes = 1;
		final int tresMes = 3;
		final int cincoAno = 5;
		final int quatroAno = 4;
		final int cemAno = 100;
		final int quatrocentosAno = 400;
		final int seteDia = 7;

		if (funcMes == 1 || funcMes == 2) {
			funcMes += umAno;
			funcAno -= umMes;
		}

		final int diaSemana = funcDia + 2 * funcMes
		+ tresMes * (funcMes + 1)
		/ cincoAno + funcAno + funcAno / quatroAno - funcAno
		/ cemAno + funcAno / quatrocentosAno;

		return diaSemana % seteDia;
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
		final int limiteMax = 1753;

		if (ano < limiteMax) {
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
			i++;
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
			i++;
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
			i++;
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
			i++;
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
			i++;
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
		double aux;

		while (i <= repeticoes) {
			aux = dividendo;
			dividendo = dividendo + divisor;
			divisor = aux;
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
	 * @param numero número que representa o radicando
	 * @param repeticoes número que representa o índice
	 *
	 * @return {double} Retorna o resultado da raiz
	 */
	public static double raiz(final double numero,
	final double repeticoes) {
		double funcRepeticoes = repeticoes;
		if (numero <= 0) {
			throw new IllegalArgumentException("'numero' deve"
			+ " ser maior que 0");
		}

		double raizR = 1;

		while (0 <= funcRepeticoes) {
			raizR = (raizR + numero / raizR) / 2;
			funcRepeticoes = funcRepeticoes - 1;

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
			i++;
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

		final double limite = Math.floor(Math.sqrt(tamanho));

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
	public static double mdc(final double numeroA,
	final double numeroB) {
		double funcNumeroA = numeroA;
		double funcNumeroB = numeroB;

		if (funcNumeroB > funcNumeroA || 0 >= funcNumeroB) {
			throw new IllegalArgumentException("'numeroB' deve ser"
			+ " <= 'numeroA' e numeroB deve ser < 0");
		}

		double resto;

		while (funcNumeroB != 0) {
			resto = funcNumeroA % funcNumeroB;
			funcNumeroA = funcNumeroB;
			funcNumeroB = resto;
		}

		return funcNumeroA;
	}

	/**
	 * Função que calcula o maior divisor comum.
	 *
	 * @param numeroA inteiro que representa o dividendo
	 * @param numeroB inteiro que representa o divisor
	 *
	 * @return {double} Retorna o maior divisor comum
	 */
	public static double mdc2(final int numeroA, final int numeroB) {
		int funcNumeroA = numeroA;
		int funcNumeroB = numeroB;

		if (funcNumeroB > funcNumeroA || 0 >= funcNumeroB) {
			throw new IllegalArgumentException("'numeroB' deve"
			+ " ser <= 'numeroA' e numeroB deve ser < 0");
		}

		while (funcNumeroA != funcNumeroB) {
			if (funcNumeroA > funcNumeroB) {
				funcNumeroA = funcNumeroA - funcNumeroB;
			} else {
				funcNumeroB = funcNumeroB - funcNumeroA;
			}

		}

		return funcNumeroA;
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
	public static int fibonacci(final int numero) {
		final int funcNumero = numero;
		if (funcNumero < 0) {
			throw new IllegalArgumentException("O número deve"
			+ " ser maior ou igual a 0");
		}

		int soma = 0;
		int resultado = 1;

		if (funcNumero == 0 || funcNumero == 1) {
			return resultado;
		}

		int i = 2;

		while (i <= funcNumero) {
			final int aux = resultado;
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
		final int limiteCpf = 11;
		final int limiteDigitos = 9;
		final int primeiroDigito = 10;
		final int segundoDigito = 11;

		if (vetor.length != limiteCpf) {
			throw new IllegalArgumentException("Insira a quantidade"
			+ " correta de dígitos (11)");
		}

		int i = 0;

		for (i = 0; i < limiteCpf; i++) {
			if (vetor[i] > limiteDigitos || vetor[i] < 0) {
				throw new IllegalArgumentException("O número"
				+ " deve estar entre 0 e 9");
			}
		}

		int testeA = 0;
		int testeB = 0;

		for (i = 0; i < limiteDigitos; i++) {
			testeA += (i + 1 * vetor[i]);
			testeB += (i + 1 * vetor[i + 1]);
		}

		final int digitoA = mod(mod(testeA, segundoDigito),
		primeiroDigito);
		final int digitoB = mod(mod(testeB, segundoDigito),
		primeiroDigito);
		return digitoA == vetor[limiteDigitos]
		&& digitoB == vetor[primeiroDigito];
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
		final int limiteCpf = 11;
		final int limiteDigitos = 9;
		final int primeiroDigito = 10;
		final int segundoDigito = 11;
		final int limiteDigitosVetor = 8;
		final int primeiroDigitoVetor = 9;
		final int segundoDigitoVetor = 10;
		final int caminhaDigitos = 7;

		if (vetor.length != limiteCpf) {
			throw new IllegalArgumentException("Insira a quantidade"
			+ " correta de dígitos (11)");
		}

		int i = 0;

		for (i = 0; i < limiteCpf; i++) {
			if (vetor[i] > limiteDigitos || vetor[i] < 0) {
				throw new IllegalArgumentException(
				"O número deve estar entre 0 e 9");
			}
		}

		i = caminhaDigitos;
		int testeA = vetor[limiteDigitosVetor];
		int testeB = vetor[limiteDigitosVetor];

		while (0 <= i) {
			testeA = testeA + vetor[i];
			testeB = testeB + testeA;
			i--;
		}

		final int digitoA = mod(mod(testeB, segundoDigito),
		primeiroDigito);
		final int digitoB = mod(mod(testeB - testeA
		+ (limiteDigitos * vetor[limiteDigitos]), segundoDigito),
		primeiroDigito);

		return (digitoA == vetor[primeiroDigitoVetor])
		&& (digitoB == vetor[segundoDigitoVetor]);
	}
}
