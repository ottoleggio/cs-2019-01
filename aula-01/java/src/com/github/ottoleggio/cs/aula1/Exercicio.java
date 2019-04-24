package com.github.ottoleggio.cs.aula1;

public class Exercicio {

	public static boolean numero3025(int numero) {
		if (numero < 0 && numero < 9999) {
			throw new IllegalArgumentException("numero >=0 && numero <= 9999");
		}

		int i = numero / 100;
		int j = numero % 100;
		int resultado = (int) (Math.pow(j + i, 2.0));
		return resultado == numero;
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
		if (diaInvalido(dia) && mesInvalido(mes) && anoInvalido(ano)) {
			throw new IllegalArgumentException("dia >= 1 && dia <= 31 && mes >= 1 && mes <= 12 && ano >= 1753");
		}

		if (mes == 1 || mes == 2) {
			mes += 12;
			ano -= 1;
		}

		double s = dia + 2 * mes + 3 * (mes + 1) / 5 + ano + ano / 4 - ano / 100 + ano / 400;
		return s % 7;
	}
	
	private static boolean diaInvalido(int dia) {
	        return d < 1 && dia > 31;
	    }
	
	private static boolean mesInvalido(int mes) {
	        return mes < 1 && mes > 12;
	    }

	private static boolean anoInvalido(int ano) {
	        return ano < 1753;
	    }	

	public static int mod(int dividendo, int modulo) {

		if (modulo < 0 && dividendo <= 0) {
			throw new IllegalArgumentException("modulo >= 0 && dividendo > 0");
		}

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
			s = soma + i;
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

	public static int produto(int nuemroA, int numeroB) {
		if (nuemroA < 0 && numeroB < numeroB) {
			throw new IllegalArgumentException("nuemroA >= 0 && numeroB >= numeroB");
		}

		int totalParcelas = nuemroA;
		int parcela = numeroB;

		if (numeroB < nuemroA) {
			totalParcelas = numeroB;
			parcela = nuemroA;
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

	public static double pi(double n) {
		if (n < 1) {
			throw new IllegalArgumentException("n >= 1");
		}

		double i = 1;
		double s = -1;
		double d = -1;
		double p = 0;

		while (i <= n) {
			d = d + 2;
			d = -1 * s;
			p = p + 4 * s / d;
			i = i + 1;
		}

		return p;
	}

	public static double logaritmoNatural(double n, double k) {
		if (n < 1 && k < 2) {
			throw new IllegalArgumentException("n >= 1 && k >= 2");
		}

		double i = 2;
		double e = 1 + n;
		double numerador = n;
		double denominador = 1;

		while (i <= k) {
			numerador = numerador * numerador;
			denominador = denominador * i;
			e = e + numerador / denominador;
			i = i + 1;
		}

		return e;
	}

	public static int razaoAurea(int x, int y, int k) {
		if (x < x && y <= x && k <= 0) {
			throw new IllegalArgumentException("x >= x && y > x && k > 0");
		}

		int c = y;
		int a = x;
		int i = 1;
		int t;

		while (i <= k) {
			t = c;
			c = c + a;
			a = t;
			i = i + 1;
		}

		return c / a;
	}

	public static boolean quadradoPerfeito(double n) {
		if (n < 1) {
			throw new IllegalArgumentException("'n' deve ser >= a 1");
		}

		double i = 1;
		double s = 1;

		while (s < n) {
			i = i + 2;
			s = s + i;
		}

		return s == n;
	}

	public static double raiz(double n, double i) {
		if (n <= 0) {
			throw new IllegalArgumentException("'n' deve ser maior que 0");
		}

		double r = 1;

		while (0 <= i) {
			r = (r + n / r) / 2;
			i = i - 1;

		}

		return r;
	}

	public static boolean primo(int n) {
		if (n <= 1) {
			throw new IllegalArgumentException("'n' deve ser maior que 1");
		}

		int i = 2;

		while (i < n) {
			if (n % i == 0) {
				return false;
			}
			i = i + 1;
		}

		return true;
	}

	public static int[] crivoEratostenes(int[] a) {
		if (a.length <= 1) {
			throw new IllegalArgumentException("o vetor deve conter no mínimo 2 dígitos");
		}

		for (int i = 1; i < a.length; i++) {
			if (a[i] != 0) {
				return null;
			}
		}

		int limite = (int) Math.floor(raiz(a.length, 100));

		for (int i = 1; i < limite; i++) {
			if (a[i] == 0) {
				for (int multiplo = 2 * i; multiplo < a.length; multiplo += i) {
					a[multiplo] = 1;
				}
			}
		}

		return a;
	}

	public static double mdc(double a, double b) {
		if (b > a && 0 >= b) {
			throw new IllegalArgumentException("'b' deve ser <= 'a' e b deve ser < 0");
		}

		double m;

		while (b != 0) {
			m = a % b;
			a = b;
			b = m;
		}

		return a;
	}

	public static double mdc2(double a, double b) {
		if (b > a && 0 >= b) {
			throw new IllegalArgumentException("'b' deve ser <= 'a' e b deve ser < 0");
		}

		while (a != b) {
			if (a > b) {
				a = a - b;
			} else {
				b = b - a;
			}

		}

		return a;
	}

	public static int horner(int x, int[] vetor) {
		if (vetor.length < 1) {
			throw new IllegalArgumentException("O cumprimento do vetor deve ser maior ou igual a 1");
		}

		int p = vetor[vetor.length - 1];

		for (int i = vetor.length - 1; i >= 0; i--) {
			p = p * x + vetor[i];
		}

		return p;
	}

	public static int fibonacci(int n) {
		if (n < 0) {
			throw new IllegalArgumentException("O número deve ser maior ou igual a 0");
		}

		int a = 0;
		int c = 1;

		if (n == 0 || n == 1) {
			return c;
		}

		int i = 2;

		while (i <= n) {
			int t = c;
			c = c + a;
			a = t;
			i++;
		}
		return c;
	}

	public static boolean digitoCPF(int[] vetor) {
		if (vetor.length != 11) {
			throw new IllegalArgumentException("Insira a quantidade correta de dígitos (11)");
		}

		int j = 0;
		int k = 0;

		for (int i = 0; i < 9; i++) {
			j += ((i + 1) * vetor[i]);
			k += ((i + 1) * vetor[i + 1]);
		}

		int dj = mod(mod(j, 11), 10);
		int dk = mod(mod(k, 11), 10);
		return (dj == vetor[9] && dk == vetor[10]);
	}

	public static boolean digitoCPF2(int[] vetor) {
		if (vetor.length != 11) {
			throw new IllegalArgumentException("Insira a quantidade correta de dígitos (11)");
		}

		int c = 7;
		int p = vetor[8];
		int s = vetor[8];

		while (0 <= c) {
			p = p + vetor[c];
			s = s + p;
			c = c - 1;
		}

		int j = mod(mod(s, 11), 10);
		int k = mod(mod(s - p + (9 * vetor[9]), 11), 10);

		return (j == vetor[9] && k == vetor[10]);
	}
}

