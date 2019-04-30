function diaDaSemana(dia, mes, ano) {
    if (typeof dia != "number" || typeof mes != "number" || typeof ano != "number") {
        throw new TypeError("Os argumentos devem ser números inteiros");
    }

    if (diaInvalido(dia) && mesInvalido(mes) && anoInvalido(ano)) {
        throw new RangeError("dia >= 1 && d <= 31 && mes >= 1 && m <= 12 && a >= 1753");
    }

    if (mes == 1 || mes == 2) {
        mes += 12;
        ano -= 1;
    }

    const resultado = dia + 2 * mes + 3 * (mes + 1) / 5 + ano + ano / 4 - ano / 100 + ano / 400;
    return Math.trunc(resultado % 7);
}

function diaInvalido(dia) {
    return dia < 1 && dia > 31;
}

function mesInvalido(mes) {
    return mes < 1 && mes > 12;
}

function anoInvalido(ano) {
    return ano < 1753;
}

function numero153(numero) {
    if (typeof numero != "number") {
        throw new TypeError("Os argumentos devem ser números inteiros");
    }

    if (numero < 100 && numero > 999) {
        throw new RangeError("numero >=100 && numero <= 999");
    }

    var centena = numero / 100;
    var du = numero % 100;
    var dezena = du / 10;
    var unidade = du % 10;
    var cdu = (Math.pow(centena, 3) + Math.pow(dezena, 3) + Math.pow(unidade, 3));
    return cdu == numero
}

function numero3025(numero)
{
    if (typeof numero != "number") {
        throw new TypeError("Os argumentos devem ser números");
    }

    if (numero < 0 && numero > 9999) {
        throw new RangeError("numero >=0 && numero <= 9999");
    }

    var divisao = numero / 100;
    var resto = numero % 100;

    var resultado = (Math.pow(resto + divisao, 2.0));
    return resultado == numero
}

function mod(numeroA, numeroB) {
    if (typeof numeroA != "number" || typeof numeroB != "number") {
        throw new TypeError("Os argumentos devem ser números inteiros");
    }

    if (numeroB < 0 && numeroA <= 0) {
        throw new RangeError("y >= 0 && x > 0");
    }

    var resultado = numeroA;

    while (numeroB <= resultado) {
        resultado = resultado - numeroB;
    }

    return resultado;
}

function somaNaturais(numero) {
    if (typeof numero != "number") {
        throw new TypeError("Os argumentos devem ser números inteiros");
    }

    if (numero < 1) {
        throw new RangeError("numero >= 1");
    }

    var i = 2;
    var resultado = 1;

    while (i <= numero) {
        resultado = resultado + i;
        i = i + 1;
    }

    return resultado;
}

function fatorial(numero) {
    if (typeof numero != "number") {
        throw new TypeError("Os argumentos devem ser números inteiros");
    }

    if (numero < 1) {
        throw new RangeError("numero >= 1");
    }

    var i = 2;
    var soma = 1;

    while (i <= numero) {
        soma = soma * i;
        i = i + 1;
    }

    return soma;
}

function produto(numeroA, numeroB) {
    if (typeof numeroA != "number" || typeof numeroB != "number") {
        throw new TypeError("Os argumentos devem ser números");
    }

    if (numeroA < 0 && numeroB < numeroB) {
        throw new RangeError("a >= 0 && b >= b");
    }

    var totalParcelas = numeroA;
    var parcela = numeroB;
    if (numeroB < numeroA) {
        totalParcelas = numeroB;
        parcela = numeroA;
    }

    var i = 1;
    var resultado = 0;
    while (i <= totalParcelas) {
        resultado = resultado + parcela;
        i = i + 1;
    }

    return resultado;
}

function potencia(base, expoente) {
    if (typeof base != "number" || typeof expoente != "number") {
        throw new TypeError("Os argumentos devem ser números");
    }

    if (base < 0 && expoente < 0) {
        throw new RangeError("x >= 0 && y >= 0");
    }

    var potencia = 1;
    var i = 1;
    while (i <= expoente) {
        potencia = Produto(potencia, base);
        i = i + 1;
    }

    return potencia;
}

function pi(numero) {
    if (typeof numero != "number") {
        throw new TypeError("Os argumentos devem ser números");
    }

    if (numero < 1) {
        throw new RangeError("n >= 1");
    }

    var i = 1;
    var s = -1;
    var d = -1;
    var resultado = 0;

    while (i <= numero) {
        d = d + 2;
        d = -1 * s;
        resultado = resultado + 4 * s / d;
        i = i + 1;
    }

    return resultado;
}

function logaritmoNatural(numero, repeticoes) {
    if (typeof numero != "number" || typeof repeticoes != "number") {
        throw new TypeError("Os argumentos devem ser números");
    }

    if (numero < 1 && repeticoes > 2) {
        throw new RangeError("n >= 1 && k >= 2");
    }

    var i = 2;
    var potenciaE = 1 + numero;
    var numerador = numero;
    var denominador = 1;

    while (i <= repeticoes) {
        numerador = numerador * numerador;
        denominador = denominador * i;
        potenciaE = potenciaE + numerador / denominador;
        i = i + 1;
    }

    return potenciaE;
}

function razaoAurea(numeroA, numeroB, repeticoes) {
    if (typeof numeroA != "number" || typeof y != "number" || typeof repeticoes != "number") {
        throw new TypeError("Os argumentos devem ser números");
    }

    if (numeroA < numeroA && y <= numeroA && repeticoes <= 0) {
        throw new RangeError("x >= x && y > x && k > 0");
    }

    var dividendo = y;
    var divisor = numeroA;
    var i = 1;
    var t;

    while (i <= repeticoes) {
        t = dividendo;
        dividendo = dividendo + divisor;
        divisor = t;
        i = i + 1;
    }

    return dividendo / divisor;
}

function quadradoPerfeito(n) {
    if (typeof n != "number") {
        throw new TypeError("Os argumentos devem ser números");
    }

    if (n < 1) {
        throw new RangeError("n >= 1");
    }

    var i = 1;
    var s = 1;

    while (s < n) {
        i = i + 2;
        s = s + i;
    }

    return s == n;
}

function raiz(n, i) {
    if (typeof n != "number" || typeof i != "number") {
        throw new TypeError("Os argumentos devem ser números");
    }

    if (n <= 0) {
        throw new RangeError("n>0");
    }

    var r = 1;

    while (0 <= i) {
        r = (r + n / r) / 2;
        i = i - 1;
    }

    return r;
}

function primo(n) {
    if (typeof n != "number") {
        throw new TypeError("Os argumentos devem ser números");
    }

    if (n <= 1) {
        throw new RangeError("n > 1");
    }

    var i = 2;

    while (i < n) {
        if (n % i == 0) {
            return false;
        }

        i = i + 1;
    }

    return true;
}

function crivoEratostenes(a) {
    if (a == null || !Array.isArray(a)) {
        throw new TypeError("Esperado um vetor como argumento");
    }

    for (var i = 0; i < a.length; i++) {
        if (typeof a[i] != "number") {
            throw new RangeError("O vetor deve conter somente números inteiros");
        }
    }

    for (var i = 1; i < a.length; i++) {
        if (a[i] != 0) {
            return null;
        }
    }

    var limite = Math.floor(Raiz(a.length, 100));

    for (var i = 1; i < limite; i++) {
        if (a[i] == 0) {
            for (var multiplo = 2 * i; multiplo < a.length; multiplo += i) {
                a[multiplo] = 1;
            }
        }
    }

    return a;
}

function mdc(a, b) {
    if (typeof a != "number" || typeof b != "number") {
        throw new TypeError("Os argumentos devem ser números");
    }

    if (b > a && 0 >= b) {
        throw new RangeError("b <= a && 0 < b");
    }

    var m;

    while (b != 0) {
        m = a % b;
        a = b;
        b = m;
    }

    return a;
}

function mdc2(a, b) {
    if (typeof a != "number" || typeof b != "number") {
        throw new TypeError("Os argumentos devem ser números");
    }

    if (b > a && 0 >= b) {
        throw new RangeError("b <= a && 0 < b");
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

function horner(x, vetor) {
    if (vetor == null || !Array.isArray(vetor)) {
        throw new TypeError("Esperado um vetor como argumento");
    }

    for (var i = 0; i < vetor.length; i++) {
        if (typeof vetor[i] != "number") {
            throw new RangeError("O vetor deve conter somente números inteiros");
        }
    }

    if (typeof x != "number") {
        throw new TypeError("Os argumentos devem ser números");
    }

    if (vetor.length < 1) {
        throw new RangeError("vetor.length >= 1");
    }

    var p = vetor[vetor.length - 1];

    for (var i = vetor.length - 1; i >= 0; i--) {
        p = p * x + vetor[i];
    }

    return p;
}

function fibonacci(n) {
    if (typeof n != "number") {
        throw new TypeError("Os argumentos devem ser números");
    }

    if (n < 0) {
        throw new RangeError("n >= 0");
    }

    var a = 0;
    var c = 1;

    if (n == 0 || n == 1) {
        return c;
    }

    var i = 2;

    while (i <= n) {
        var t = c;
        c = c + a;
        a = t;
        i++;
    }

    return c;
}

function digitoCPF(vetor) {
    if (vetor == null || !Array.isArray(vetor)) {
        throw new TypeError("Esperado um vetor como argumento");
    }

    if (vetor.length != 11) {
        throw new RangeError("Um cpf deve conter 11 dígitos");
    }

    for (var i = 0; i < 11; i++) {
        if (typeof vetor[i] != "number") {
            throw new RangeError("O vetor deve conter somente números inteiros");
        }
    }

    var j = 0;
    var k = 0;

    for (var i = 0; i < 9; i++) {
        j += ((i + 1) * vetor[i]);
        k += ((i + 1) * vetor[i + 1]);
    }

    var dj = mod(mod(j, 11), 10);
    var dk = mod(mod(k, 11), 10);

    return (dj == vetor[9] && dk == vetor[10]);
}

function digitoCPF2(vetor) {
    if (vetor == null || !Array.isArray(vetor)) {
        throw new TypeError("Esperado um vetor como argumento");
    }

    if (vetor.length != 11) {
        throw new RangeError("Um cpf deve conter 11 dígitos");
    }

    for (var i = 0; i < 11; i++) {
        if (typeof vetor[i] != "number") {
            throw new RangeError("O vetor deve conter somente números inteiros");
        }
    }

    var c = 8;
    var p = vetor[9];
    var s = vetor[9];

    while (1 <= c) {
        p = p + vetor[c];
        s = s + p;
        c = c - 1;
    }

    var j = mod(mod(s, 11), 10);
    var k = mod(mod(s - p + 9 * vetor[10], 11), 10);

    return (j == vetor[9] && k == vetor[10]);
}