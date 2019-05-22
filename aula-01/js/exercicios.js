/**
 * Funções matemáticas diversas com propósito de estudo das ferramentas
 * e boas práticas da disciplina de construção de software
 */
//{ f1 : numero3025 
//,f2 : numero153 
module.exports = { f1 : diaDaSemana 
                ,f2 : numero153 
                ,f3 : numero3025
                ,f4 : mod
                ,f5 : somaNaturais
                ,f6 : fatorial
                ,f7 : produto
                ,f8 : potencia
                ,f9 : pi
                ,f10 : logaritmoNatural
                ,f11 : razaoAurea
                ,f12 : quadradoPerfeito
                ,f13 : raiz
                ,f14 : primo
                ,f15 : crivoEratostenes
                ,f16 : mdc
                ,f17 : mdc2
                ,f18 : horner
                ,f19 : fibonacci
				,f20 : digitoCPF 
                ,f21 : digitoCPF2 }
/**Produz um numero inteiro que representa o dia da semana
 * a partir da data fornecida
 * 
 * @param dia inteiro que representa o dia do mês
 * @param mes inteiro que representa o mês no ano
 * @param ano inteiro que representa o ano
 * 
 * @returns O valor retornado é 0 para segunda-feira, 
 * 1 para terça-feira e assim sucessivamente.
 */ 
function diaDaSemana(dia, mes, ano) {

    if (typeof dia != "number" || typeof mes != "number" || typeof ano != "number") {
        throw new TypeError("Os argumentos devem ser números inteiros");
    }

    if (diaInvalido(dia) || mesInvalido(mes) || anoInvalido(ano)) {
        throw new RangeError("dia >= 1 && d <= 31 && mes >= 1 && m <= 12 && a >= 1753");
    }

    if (mes == 1 || mes == 2) {
        mes += 12;
        ano -= 1;
    }

    const resultado = dia + 2 * mes + 3 * (mes + 1) / 5 + ano + ano / 4 - ano / 100 + ano / 400;
    return Math.trunc(resultado % 7);
}

/**Valida se o dia usado como parametro está nos critérios estabelecidos
 * da função diaDaSemana
 * 
 * @param dia inteiro que representa o dia do mês
 * 
 * @returns Retorna verdadeiro ou falso de acordo com a entrada
 */ 
function diaInvalido(dia) {
    return dia < 1 || dia > 31;
}

/**Valida se o mes usado como parametro está nos critérios estabelecidos
 * da função diaDaSemana
 * 
 * @param mes inteiro que representa o mês do ano
 * 
 * @returns Retorna verdadeiro ou falso de acordo com a entrada
 */ 
function mesInvalido(mes) {
    return mes < 1 || mes > 12;
}

/**Valida se o ano usado como parametro está nos critérios estabelecidos
 * da função diaDaSemana
 * 
 * @param ano inteiro que representa o ano
 * 
 * @returns Retorna verdadeiro ou falso de acordo com a entrada
 */ 
function anoInvalido(ano) {
    return ano < 1753;
}

/**Função que verifica se a soma dos cubos dos dígitos fornecidos como entrada
 * somam 153
 * 
 * @param number inteiro que terá os dígitos somados
 * 
 * @returns Retorna verdadeiro ou falso de acordo com a entrada
 */ 
function numero153(numero) {
    if (typeof numero != "number") {
        throw new TypeError("Os argumentos devem ser números inteiros");
    }

    if (numero < 100 || numero > 999) {
        throw new RangeError("numero >=100 && numero <= 999");
    }

    // TODO defina como constantes, pois são constantes
    var centena = Math.trunc(numero / 100);
    var du = numero % 100;
    var dezena = Math.trunc(du / 10);
    var unidade = du % 10;
    const cdu = Math.pow(centena,3) + Math.pow(dezena,3) + Math.pow(unidade,3);
    return cdu == numero
}

/**Função que verifica se o quadrado da soma das dezenas da entrada
 * resulta no próprio número
 * 
 * @param number inteiro que terá as dezenas somadas
 * 
 * @returns Retorna verdadeiro ou falso de acordo com a entrada
 */ 
function numero3025(numero)
{
    if (typeof numero != "number") {
        throw new TypeError("Os argumentos devem ser números");
    }

    if (numero < 0 || numero > 9999) {
        throw new RangeError("numero >=0 && numero <= 9999");
    }

    if (Math.trunc(numero) != numero) {
        throw new RangeError("o argumento deve ser um inteiro");
    }

    var divisao = Math.round((numero / 100) , );     
    var resto = numero % 100;       

    var resultado = (Math.pow((resto + divisao), 2.0));
    return resultado  == numero
}

/**Função matemática que retorna o resto de uma divisão entre
 * dois numeros
 * 
 * @param numeroA inteiro que será o dividendo da operação
 * @param numeroB inteiro que será o divisor da operação
 * 
 * @returns Retorna o resto da divisao entre os dois parametros
 */ 
function mod(numeroA, numeroB) {
    if (typeof numeroA != "number" || typeof numeroB != "number") {
        throw new TypeError("Os argumentos devem ser números inteiros");
    }

    if (numeroB <= 0 || numeroA < 0) {
        throw new RangeError("y >= 0 && x > 0");
    }

    let resultado = numeroA;

    while (numeroB <= resultado) {
        resultado = resultado - numeroB;
    }

    return resultado;
}

/**Função que retorna a soma de numeros naturais dada a quantidade de
 * numeros a serem sequencialmente somados
 * 
 * @param numero inteiro que representa a quantidade de numeros a serem somados
 * 
 * @returns Retorna a soma dos numeros naturais somados
 */ 
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

/**Funçao matemática que retorna o fatorial do numero fornecido na entrada
 * 
 * @param numero Inteiro que representa o fatorial a ser calculado
 * 
 * @returns Resultado do número fatorial
 */ 
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

/**Função que retorna o produto entre dois numeros fornecidos como entrada
 * 
 * @param numeroA inteiro que representa o primeiro fator do produto
 * @param numeroB inteiro que representa o segundo fator do produto
 * 
 * @returns Retorna o produto das duas entradas
 */ 
function produto(numeroA, numeroB) {
    if (typeof numeroA != "number" || typeof numeroB != "number") {
        throw new TypeError("Os argumentos devem ser números");
    }

    if (numeroA < 0 || numeroB < 0) {
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

/**Função matemática que executa a operação de potenciação
 * 
 * @param base inteiro que representa a base da potenciação
 * @param expoente inteiro que representa o expoente da potenciação
 * 
 * @returns Retorna o resultado da operação entre as duas entradas
 */ 
function potencia(base, expoente) {
    if (typeof base != "number" || typeof expoente != "number") {
        throw new TypeError("Os argumentos devem ser números");
    }

    if (base < 0 || expoente < 0) {
        throw new RangeError("x >= 0 && y >= 0");
    }

    var potencia = 1;
    var i = 1;
    while (i <= expoente) {
        potencia = produto(potencia, base);
        i = i + 1;
    }

    return potencia;
}

/**Função que retorna n números das casas decimais de pi
 * 
 * @param numero inteiro que representa a quantidade de casas decimais
 * a serem representadas
 * 
 * @returns Retorna o numero pi
 */ 
function pi(numero) {
    if (typeof numero != "number") {
        throw new TypeError("Os argumentos devem ser números");
    }

    if (numero < 1) {
        throw new RangeError("n >= 1");
    }

    let s = -1;
    let d = -1;
    let resultado = 0;

    for (let i = 1; i <= numero; i++) {
        d = d + 2;
        s = -1 * s;
        resultado = resultado + ((4 * s) / d);
    }

return resultado;

}

/**Função que retorna a potência do numero de Euler
 * 
 * @param numero inteiro que representa o numerador
 * @param repeticoes define a precisao do calculo
 * 
 * @returns Retorna a potência do numero de Euler
 */ 
function logaritmoNatural(numero, repeticoes) {
    if (typeof numero != "number" || typeof repeticoes != "number") {
        throw new TypeError("Os argumentos devem ser números");
    }

    if (numero < 1 || repeticoes > 2) {
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

/**Função que calcula a Razao Áurea
 * 
 * @param numeroA inteiro utilizado na soma
 * @param numeroB inteiro utilizado na soma
 * @param repeticoes define a quantidade de iterações da soma a ser realizada
 * 
 * @returns Retorna a Razão Áurea
 */ 
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

/**Função que verifica se a operação é um quadrado perfeito
 * 
 * @param n número a ser elevado a enésima potencia
 * 
 * @returns Retorna verdadeiro ou falso
 */
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

/**Função matemática que faz o cálculo da raiz
 * 
 * @param n inteiro que representa o radicando
 * @param i inteiro que representa o índice
 * 
 * @returns Retorna o resultado da raiz
 */
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

/**Função que verifica se o número é primo
 * 
 * @param n inteiro a ser verificado
 * 
 * @returns Retorna verdadeiro ou falso
 */
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

/**Função que calcula o Crivo de Eratostenes
 * 
 * @param a vetor utilizado na operação
 * 
 * @returns Retorna o valor do Crivo de Eratostenes
 */
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

/**Função que calcula o maior divisor comum
 * 
 * @param a inteiro que representa o dividendo
 * @param b inteiro que representa o divisor
 * 
 * @returns Retorna o maior divisor comum
 */
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

/**Função que calcula o maior divisor comum
 * 
 * @param a inteiro que representa o dividendo
 * @param b inteiro que representa o divisor
 * 
 * @returns Retorna o maior divisor comum
 */
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

/**Função que avalia um polinômio de acordo com a regra de Horner
 * 
 * @param x inteiro utilizado no calculo
 * @param vetor inteiro que representa o polinomio
 * 
 * @returns Retorna o resultado do polinomio
 */
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

/**Função que obtém o n-ésimo número de Fibonacci
 * 
 * @param n inteiro que representa a quantidade de iterações do cálculo
 * 
 * @returns Retorna o número de Fibonnaci na n-ésima posição
 */
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

/**Função que valida um número de CPF de acordo com seus dígitos verificadores
 * 
 * @param vetor sequência de números que representa um CPF
 * 
 * @returns Retorna verdadeiro ou falso 
 */
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

/**Função que valida um número de CPF de acordo com seus dígitos verificadores
 * 
 * @param vetor sequência de números que representa um CPF
 * 
 * @returns Retorna verdadeiro ou falso 
 */
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

    var c = 7;
    var p = vetor[8];
    var s = vetor[8];

    while (0 <= c) {
        p = p + vetor[c];
        s = s + p;
        c--;
    }

    var j = mod(mod(s, 11), 10);
    var k = mod(mod(s - p + (9 * vetor[9]), 11), 10);

    return (j == vetor[9]) && (k == vetor[10]);
}
