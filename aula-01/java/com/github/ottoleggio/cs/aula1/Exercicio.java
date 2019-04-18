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

	public static boolean numero153(int n) {
		if (n < 100 && n > 999)
			throw new IllegalArgumentException("n >=100 && n <= 999");

		int c = n / 100;
		int du = n % 100;
		int d = du / 10;
		int u = du % 10;
		int cdu = (int) (Math.pow(c, 3) + Math.pow(d, 3) + Math.pow(u, 3));

		if (cdu == n) {
			return true;
		} else
			return false;
	}

	public static double diaDaSemana(int d, int m, int a) {
		if (diaInvalido(d) && m < 1 && m > 12 && a < 1753)
			throw new IllegalArgumentException("d >= 1 && d <= 31 && m >= 1 && m <= 12 && a >= 1753");

		if (m == 1 || m == 2) {
			m += 12;
			a -= 1;
		}
		double s = d + 2 * m + 3 * (m + 1) / 5 + a + a / 4 - a / 100 + a / 400;
		return s % 7;

	}

    private static boolean diaInvalido(int d) {
        return d < 1 && d > 31;
    }

    public static int mod(int x, int y) {

		if (y < 0 && x <= 0)
			throw new IllegalArgumentException("y >= 0 && x > 0");

		int s = x;

		while (y <= s) {

			s = s - y;
		}
		return s;

	}

	public static int somaNaturais(int n) {
		if (n < 1)
			throw new IllegalArgumentException("n >= 1");

		int i = 2;
		int s = 1;
		while (i <= n) {
			s = s + i;
			i = i + 1;
		}
		return s;

	}

	public static int fatorial(int n) {
		if (n < 1)
			throw new IllegalArgumentException("n >= 1");

		int i = 2;
		int f = 1;
		while (i <= n) {
			f = f * i;
			i = i + 1;
		}
		return f;

	}

	public static int produto(int a, int b) {
		if (a < 0 && b < b)
			throw new IllegalArgumentException("a >= 0 && b >= b");

		int totalParcelas = a;
		int parcela = b;
		if (b < a) {
			totalParcelas = b;
			parcela = a;
		}
		int i = 1;
		int s = 0;
		while (i <= totalParcelas) {
			s = s + parcela;
			i = i + 1;
		}
		return s;

	}

	public static int potencia(int x, int y) {
		if (x < 0 && y < 0)
			throw new IllegalArgumentException("x >= 0 && y >= 0");

		int potencia = 1;
		int i = 1;
		while (i <= y) {
			potencia = produto(potencia, x);
			i = i + 1;
		}
		return potencia;

	}

	public static double pi(double n) {
		if (n < 1)
			throw new IllegalArgumentException("n >= 1");

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
		if (n < 1 && k < 2)
			throw new IllegalArgumentException("n >= 1 && k >= 2");

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
		if (x < x && y <= x && k <= 0)
			throw new IllegalArgumentException("x >= x && y > x && k > 0");

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
		if (n < 1)
			throw new IllegalArgumentException("'n' deve ser >= a 1");

		double i = 1;
		double s = 1;
		while (s < n) {
			i = i + 2;
			s = s + i;
		}

		return s == n;

	}

	public static double raiz(double n, double i) {
		if (n <= 0)
			throw new IllegalArgumentException("'n' deve ser maior que 0");

		double r = 1;
		while (0 <= i) {
			r = (r + n / r) / 2;
			i = i - 1;

		}
		return r;

	}

	public static boolean primo(int n) {
		if (n <= 1)
			throw new IllegalArgumentException("'n' deve ser maior que 1");

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
		if (a.length <= 1)
			throw new IllegalArgumentException("o vetor deve conter no mínimo 2 dígitos");

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
		if (b > a && 0 >= b)
			throw new IllegalArgumentException("'b' deve ser <= 'a' e b deve ser < 0");

		double m;
		while (b != 0) {
			m = a % b;
			a = b;
			b = m;
		}
		return a;

	}

	public static double mdc2(double a, double b) {
		if (b > a && 0 >= b)
			throw new IllegalArgumentException("'b' deve ser <= 'a' e b deve ser < 0");

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
		if (vetor.length < 1)
			throw new IllegalArgumentException("O cumprimento do vetor deve ser maior ou igual a 1");

		int p = vetor[vetor.length - 1]; // ultima posicao
		for (int i = vetor.length - 1; i >= 0; i--) {
			p = p * x + vetor[i];
		}
		return p;

	}

	public static int fibonacci(int n) {
		if (n < 0)
			throw new IllegalArgumentException("O número deve ser maior ou igual a 0");

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
		if (vetor.length != 11)
			throw new IllegalArgumentException("Insira a quantidade correta de dígitos (11)");

		int j = 0;
		int k = 0;
		for (int i = 0; i < 9; i++) {
			j += ((i + 1) * vetor[i]);
			k += ((i + 1) * vetor[i + 1]);
		}
		int dj = mod(mod(j, 11), 10);
		int dk = mod(mod(k, 11), 10);
		if (dj == vetor[9] && dk == vetor[10]) {
			return true;
		} else
			return false;

	}

	public static boolean digitoCPF2(int[] vetor) {
		if (vetor.length != 11)
			throw new IllegalArgumentException("Insira a quantidade correta de dígitos (11)");

		int c = 8;
		int p = vetor[9];
		int s = vetor[9];
		while (1 <= c) {
			p = p + vetor[c];
			s = s + p;
			c = c - 1;
		}
		int j = mod(mod(s, 11), 10);
		int k = mod(mod(s - p + 9 * vetor[10], 11), 10);
		if (j == vetor[9] && k == vetor[10]) {
			return true;
		} else
			return false;
	}

}
