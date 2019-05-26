/**
 * Funções matemáticas diversas com propósito de estudo das ferramentas
 * e boas práticas da disciplina de construção de software.
 */

/**Produz um numero inteiro que representa o dia da semana
 * a partir da data fornecida.
 *
 * @param {number} dia inteiro que representa o dia do mês
 * @param {number} mes inteiro que representa o mês no ano
 * @param {number} ano inteiro que representa o ano
 *
 * @returns {number} O valor retornado é 0 para segunda-feira, 
 * 1 para terça-feira e assim sucessivamente.
 */ 
function diaDaSemana(dia, mes, ano) {
    if (typeof dia != "number" || typeof mes != "number"
    || typeof ano != "number") {
        throw new TypeError("Os argumentos devem ser números inteiros");
    }

    if (diaInvalido(dia) || mesInvalido(mes) || anoInvalido(ano)) {
        throw new RangeError("dia >= 1 && d <= 31 && mes "
        + ">= 1 && m <= 12 && a >= 1753");
    }

    const umAno = 12;
    const umMes = 1;
    const tresMes = 3;
    const cincoAno = 5;
    const quatroAno = 4;
    const cemAno = 100;
    const quatrocentosAno = 400;
    const seteDia = 7;

    if (mes == 1 || mes == 2) {
        mes += umAno;
        ano -= umMes;
    }

    const resultado = dia + 2 * mes + tresMes * (mes + 1)
    / cincoAno + ano + ano
    / quatroAno - ano / cemAno + ano / quatrocentosAno;
    return Math.trunc(resultado % seteDia);
}

/**Valida se o dia usado como parametro está nos critérios estabelecidos
 * da função diaDaSemana.
 *
 * @param {number} dia inteiro que representa o dia do mês
 *
 * @returns {boolean} Retorna verdadeiro ou falso de acordo com a entrada
 */ 
function diaInvalido(dia) {
    return dia < 1 || dia > 31;
}

/**Valida se o mes usado como parametro está nos critérios estabelecidos
 * da função diaDaSemana.
 *
 * @param mes inteiro que representa o mês do ano
 *
 * @returns Retorna verdadeiro ou falso de acordo com a entrada
 */ 
function mesInvalido(mes) {
    return mes < 1 || mes > 12;
}

/**Valida se o ano usado como parametro está nos critérios estabelecidos
 * da função diaDaSemana.
 *
 * @param {number} ano inteiro que representa o ano
 *
 * @returns {boolean} Retorna verdadeiro ou falso de acordo com a entrada
 */ 
function anoInvalido(ano) {
    return ano < 1753;
}

/**Verifica se a soma dos cubos dos dígitos de um número de três
 * dígitos resulta no próprio número.
 *
 * @param {number} number inteiro que terá os dígitos somados
 *
 * @returns {boolean} Retorna verdadeiro ou falso de acordo com a entrada
 */ 
function numero153(numero) {
    const limiteMin = 100;
    const limiteMax = 999;

    if (typeof numero != "number") {
        throw new TypeError("Os argumentos devem ser números inteiros");
    }

    if (numero < limiteMin || numero > limiteMax) {
        throw new RangeError("numero >=100 && numero <= 999");
    }

    const potencia = 3;
    const divisorCem = 100;
    const divisoDez = 10;
    const centena = Math.trunc(numero / divisorCem);
    const resto = numero % divisorCem;
    const dezena = Math.trunc(resto / divisoDez);
    const unidade = resto % divisoDez;
    const cdu = Math.pow(centena,potencia) + Math.pow(dezena,potencia)
    + Math.pow(unidade,potencia);
    return cdu == numero;
}

/**Função que verifica se o quadrado da soma das dezenas da entrada
 * resulta no próprio número.
 *
 * @param {number} numero inteiro que terá as dezenas somadas
 *
 * @returns {boolean} Retorna verdadeiro ou falso de acordo com a entrada
 */ 
function numero3025(numero) {
    const limiteMin = 0;
    const limiteMax = 9999;

    if (typeof numero != "number") {
        throw new TypeError("Os argumentos devem ser números");
    }

    if (numero < limiteMin || numero > limiteMax) {
        throw new RangeError("numero >=0 && numero <= 9999");
    }

    if (!Number.isInteger(numero)) {
        throw new RangeError("o argumento deve ser um inteiro");
    }

    const divisao = Math.round((numero / 100));     
    const resto = numero % 100;       

    let resultado = (Math.pow((resto + divisao), 2.0));
    return resultado  == numero;
}

/**Função matemática que retorna o resto de uma divisão entre
 * dois numeros.
 *
 * @param {number} numerador inteiro que será o dividendo da operação
 * @param {number} denominador inteiro que será o divisor da operação
 *
 * @returns {number} Retorna o resto da divisao entre os dois parametros
 */ 
function mod(numerador, denominador) {
    const limite = 0;

    if (typeof numerador != "number" || typeof denominador != "number") {
        throw new TypeError("Os argumentos devem ser números inteiros");
    }

    if (denominador <= limite || numerador < limite) {
        throw new RangeError("y >= 0 && x > 0");
    }

    let resultado = numerador;

    while (denominador <= resultado) {
        resultado = resultado - denominador;
    }

    return resultado;
}

/**Função que retorna a soma de numeros naturais dada a quantidade de
 * numeros a serem sequencialmente somados.
 *
 * @param {number} numero inteiro que representa a quantidade 
 * de numeros a serem somados
 *
 * @returns {number} Retorna a soma dos numeros naturais somados
 */ 
function somaNaturais(numero) {
    const limite = 1;

    if (typeof numero != "number") {
        throw new TypeError("Os argumentos devem ser números inteiros");
    }

    if (numero < limite) {
        throw new RangeError("numero >= 1");
    }

    let i = 2;
    let resultado = 1;

    while (i <= numero) {
        resultado = resultado + i;
        i++;
    }

    return resultado;
}

/**Funçao matemática que retorna o fatorial do numero fornecido na entrada.
 *
 * @param {number} numero Inteiro que representa o fatorial a ser calculado
 *
 * @returns {number} Resultado do número fatorial
 */ 
function fatorial(numero) {
    const limite = 1;
    if (typeof numero != "number") {
        throw new TypeError("Os argumentos devem ser números inteiros");
    }

    if (numero < limite) {
        throw new RangeError("numero >= 1");
    }

    let i = 2;
    let soma = 1;

    while (i <= numero) {
        soma = soma * i;
        i++;
    }

    return soma;
}

/**Função que retorna o produto entre dois numeros fornecidos como entrada.
 *
 * @param {number} produtoA inteiro que representa o primeiro fator do produto
 * @param {number} produto inteiro que representa o segundo fator do produto
 *
 * @returns {number} Retorna o produto das duas entradas
 */ 
function produto(produtoA, produto) {
    const limite = 0;

    if (typeof produtoA != "number" || typeof produto != "number") {
        throw new TypeError("Os argumentos devem ser números");
    }

    if (produtoA < limite || produto < limite) {
        throw new RangeError("a >= 0 && b >= b");
    }

    let totalParcelas = produtoA;
    let parcela = produto;
    if (produto < produtoA) {
        totalParcelas = produto;
        parcela = produtoA;
    }

    let i = 1;
    let resultado = 0;
    while (i <= totalParcelas) {
        resultado = resultado + parcela;
        i++;
    }

    return resultado;
}

/**Função matemática que executa a operação de potenciação.
 *
 * @param {number} base inteiro que representa a base da potenciação
 * @param {number} expoente inteiro que representa o expoente da potenciação
 *
 * @returns {number} Retorna o resultado da operação entre as duas entradas
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
        i++;
    }

    return potencia;
}

/**Função que retorna n números das casas decimais de pi.
 *
 * @param {number} numero inteiro que representa a quantidade de casas decimais
 * a serem representadas
 *
 * @returns {number} Retorna o numero pi
 */ 
function pi(numero) {
    const limite = 1;
    if (typeof numero != "number") {
        throw new TypeError("Os argumentos devem ser números");
    }

    if (numero < limite) {
        throw new RangeError("n >= 1");
    }

    let s = -1;
    let d = -1;
    let resultado = 0;

    for (let i = 1; i <= numero; i++) {
        const consta = 4;
        d = d + 2;
        s = -1 * s;
        resultado = resultado + ((consta * s) / d);
    }

    return resultado;

}

/**Função que retorna a potência do numero de Euler.
 *
 * @param {number} numero inteiro que representa o numerador
 * @param {number} repeticoes define a precisao do calculo
 *
 * @returns {number} Retorna a potência do numero de Euler
 */ 
function logaritmoNatural(numero, repeticoes) {
    const limitnum = 1;
    const limitrep = 2;

    if (typeof numero != "number" || typeof repeticoes != "number") {
        throw new TypeError("Os argumentos devem ser números");
    }

    if (numero < limitnum || repeticoes > limitrep) {
        throw new RangeError("n >= 1 && k >= 2");
    }

    let i = 2;
    let potenciaE = 1 + numero;
    let numerador = numero;
    let denominador = 1;

    while (i <= repeticoes) {
        numerador = numerador * numerador;
        denominador = denominador * i;
        potenciaE = potenciaE + numerador / denominador;
        i = i + 1;
    }

    return potenciaE;
}

/**Função que calcula a Razao Áurea.
 *
 * @param {number} numeroA inteiro utilizado na soma
 * @param {number} numeroB inteiro utilizado na soma
 * @param {number} repeticoes define a quantidade de iterações
 * da soma a ser realizada
 *
 * @returns {number} Retorna a Razão Áurea
 */ 
function razaoAurea(numeroA, numeroB, repeticoes) {
    const limite = 0;

    if (typeof numeroA != "number" || typeof numeroB != "number"
    || typeof repeticoes != "number") {
        throw new TypeError("Os argumentos devem ser números");
    }
    if (typeof numeroB != "number") {
        throw new TypeError("Os argumentos devem ser números");
    }

    if (numeroA < limite || numeroB < numeroA || repeticoes <= limite) {
        throw new RangeError("x >= x && y > x && k > 0");
    }

    let dividendo = numeroB;
    let divisor = numeroA;
    let i = 1;
    let aux;

    while (i <= repeticoes) {
        aux = dividendo;
        dividendo = dividendo + divisor;
        divisor = aux;
        i = i + 1;
    }

    return dividendo / divisor;
}

/**Função que verifica se a operação é um quadrado perfeito.
 *
 * @param {number} numero número a ser elevado a enésima potencia
 *
 * @returns {boolean}Retorna verdadeiro ou falso
 */
function quadradoPerfeito(numero) {
    const limite = 1;

    if (typeof numero != "number") {
        throw new TypeError("Os argumentos devem ser números");
    }

    if (numero < limite) {
        throw new RangeError("numero >= 1");
    }

    var i = 1;
    var soma = 1;

    while (soma < numero) {
        i = i + 2;
        soma = soma + i;
    }

    return soma == numero;
}

/**Função matemática que faz o cálculo da raiz.
 *
 * @param {number} numero inteiro que representa o radicando
 * @param {number} repeticoes inteiro que representa o índice
 *
 * @returns {number} Retorna o resultado da raiz
 */
function raiz(numero, repeticoes) {
    const limite = 0;
    if (typeof numero != "number" || typeof repeticoes != "number") {
        throw new TypeError("Os argumentos devem ser números");
    }

    if (numero <= limite) {
        throw new RangeError("n > 0");
    }

    let raizR = 1;

    while (limite <= repeticoes) {
        raizR = (raizR + numero / raizR) / 2;
        repeticoes--;
    }

    return raizR;
}

/**Função que verifica se o número é primo.
 *
 * @param {number} numero inteiro a ser verificado
 *
 * @returns {boolean} Retorna verdadeiro ou falso
 */
function primo(numero) {
    const limite = 1;

    if (typeof numero != "number") {
        throw new TypeError("Os argumentos devem ser números");
    }

    if (numero <= limite) {
        throw new RangeError("n > 1");
    }

    let i = 2;

    while (i < numero) {
        if (numero % i == 0) {
            return false;
        }

        i++;
    }

    return true;
}

/**Função que calcula o Crivo de Eratostenes.
 *
 * @param {number} vetor vetor utilizado na operação
 *
 * @returns {number} Retorna o valor do Crivo de Eratostenes
 */
function crivoEratostenes(vetor) {
    if (vetor == null || !Array.isArray(vetor)) {
        throw new TypeError("Esperado um vetor como argumento");
    }

    let i = 0;

    for (i; i < vetor.length; i++) {
        if (typeof vetor[i] != "number") {
            throw new RangeError("O vetor deve conter somente"
            + "números inteiros");
        }
    }

    let tamanho = vetor.length - 1;

    const limite = Math.floor(Math.sqrt(tamanho));

    for (i = 2; i <= limite; i++) {
        if (vetor[i] == 0) {
            let multiplo = i + i;
            while ( multiplo <= tamanho) {
                vetor[multiplo] = 1;
                multiplo = multiplo + i;
            }
        }
    }

    return vetor[tamanho] == 1;

}

/**Função que calcula o maior divisor comum.
 *
 * @param {number} numeroA inteiro que representa o dividendo
 * @param {number} numeroB inteiro que representa o divisor
 *
 * @returns {number} Retorna o maior divisor comum
 */
function mdc(numeroA, numeroB) {
    if (typeof numeroA != "number" || typeof numeroB != "number") {
        throw new TypeError("Os argumentos devem ser números");
    }

    if (numeroB > numeroA || 0 >= numeroB) {
        throw new RangeError("b <= numeroA && 0 < b");
    }

    let resto;

    while (numeroB != 0) {
        resto = numeroA % numeroB;
        numeroA = numeroB;
        numeroB = resto;
    }

    return numeroA;
}

/**Função que calcula o maior divisor comum.
 *
 * @param {number} numeroA inteiro que representa o dividendo
 * @param {number} numeroB inteiro que representa o divisor
 *
 * @returns {number} Retorna o maior divisor comum
 */
function mdc2(numeroA, numeroB) {
    const limite = 1;
    if (typeof numeroA != "number" || typeof numeroB != "number") {
        throw new TypeError("Os argumentos devem ser números");
    }

    if (numeroB > numeroA || numeroB < limite) {
        throw new RangeError("b <= a && b >= 1");
    }

    while (numeroA != numeroB) {
        if (numeroA > numeroB) {
            numeroA = numeroA - numeroB;
        } 
        else {
            numeroB = numeroB - numeroA;
        }
    }

    return numeroA;
}

/**Função que avalia um polinômio de acordo com a regra de Horner.
 *
 * @param {number} numero inteiro utilizado no calculo
 * @param {number} vetor inteiro que representa o polinomio
 *
 * @returns {number} Retorna o resultado do polinomio
 */
function horner(numero, vetor) {
    if (vetor == null || !Array.isArray(vetor)) {
        throw new TypeError("Esperado um vetor como argumento");
    }

    let i = 0;

    for (i; i < vetor.length; i++) {
        if (typeof vetor[i] != "number") {
            throw new RangeError("O vetor deve conter somente"
            + "números inteiros");
        }
    }

    if (typeof numero != "number") {
        throw new TypeError("Os argumentos devem ser números");
    }

    if (vetor.length < 1) {
        throw new RangeError("vetor.length >= 1");
    }

    let resultado = vetor[vetor.length - 1];

    for (i = vetor.length - 1; i >= 0; i--) {
        resultado = resultado * (numero + vetor[i]);
    }

    return resultado;
}

/**Função que obtém o n-ésimo número de Fibonacci.
 *
 * @param {number} n inteiro que representa a quantidade de
 * iterações do cálculo
 *
 * @returns {number} Retorna o número de Fibonnaci na n-ésima posição
 */
function fibonacci(numero) {
    const limite = 0;

    if (typeof numero != "number") {
        throw new TypeError("Os argumentos devem ser números");
    }

    if (numero < limite) {
        throw new RangeError("n >= 0");
    }

    let soma = 0;
    let resultado = 1;

    if (numero == 0 || numero == 1) {
        return resultado;
    }

    let i = 2;

    while (i <= numero) {
        let aux = resultado;
        resultado = resultado + soma;
        soma = aux;
        i++;
    }

    return resultado;
}

/**Função que valida um número de CPF de acordo com seus
 * dígitos verificadores
 *
 * @param {number} vetor sequência de números que representa um CPF
 *
 * @returns {boolean} Retorna verdadeiro ou falso 
 */
function digitoCPF(vetor) {
    const limiteCpf = 11;
    const limiteDigitos = 9;
    const primeiroDigito = 10;
    const segundoDigito = 11;
        
    if (vetor == null || !Array.isArray(vetor)) {
        throw new TypeError("Esperado um vetor como argumento");
    }

    if (vetor.length != limiteCpf) {
        throw new RangeError("Um cpf deve conter 11 dígitos");
    }

    let i = 0;

    for (i; i < limiteCpf; i++) {
        if (typeof vetor[i] != "number" || vetor[i] >9 || vetor[i] < 0) {
            throw new RangeError("O vetor deve conter somente"
            + " números inteiros");
        }
    }

    let j = 0;
    let k = 0;

    for (i = 0; i < limiteDigitos; i++) {
        j += ((i + 1) * vetor[i]);
        k += ((i + 1) * vetor[i + 1]);
    }

    let dj = mod(mod(j, segundoDigito), primeiroDigito);
    let dk = mod(mod(k, segundoDigito), primeiroDigito);

    return (dj == vetor[limiteDigitos] && dk == vetor[primeiroDigito]);
}

/**Função que valida um número de CPF de acordo com seus dígitos verificadores.
 *
 * @param {number} vetor sequência de números que representa um CPF
 *
 * @returns {number} Retorna verdadeiro ou falso 
 */
function digitoCPF2(vetor) {
    const limiteCpf = 11;
    const limiteDigitos = 9;
    const primeiroDigito = 10;
    const segundoDigito = 11;
    const limiteDigitosVetor = 8;
    const primeiroDigitoVetor = 9;
    const caminhaDigitos = 7;

    if (vetor == null || !Array.isArray(vetor)) {
        throw new TypeError("Esperado um vetor como argumento");
    }

    if (vetor.length != limiteCpf) {
        throw new RangeError("Um cpf deve conter 11 dígitos");
    }

    for (let i = 0; i < limiteCpf; i++) {
        if (typeof vetor[i] != "number" || vetor[i] > limiteDigitos
        || vetor[i] < 0) {
            throw new RangeError("O vetor deve conter "
            + "somente números inteiros");
        }
    }

    let c = caminhaDigitos;
    let p = vetor[limiteDigitosVetor];
    let s = vetor[limiteDigitosVetor];

    while (0 <= c) {
        p = p + vetor[c];
        s = s + p;
        c--;
    }

    let j = mod(mod(s, segundoDigito), primeiroDigito);
    let k = mod(mod(s - p + (primeiroDigitoVetor * vetor[primeiroDigitoVetor]),
        segundoDigito), primeiroDigito);

    return (j == vetor[primeiroDigitoVetor]) && (k == vetor[primeiroDigito]);
}

/**Exporta os métodos para testes.
 *
 */
module.exports = { verificaDiaDaSemana : diaDaSemana 
    ,verificaNumero153 : numero153 
    ,verificaNumero3025 : numero3025
    ,verificaMod : mod
    ,verificaSomaNaturais : somaNaturais
    ,verificaFatorial : fatorial
    ,verificaProduto : produto
    ,verificaPotencia : potencia
    ,verificaPi : pi
    ,verificaLogaritmoNatural : logaritmoNatural
    ,verificaRazaoAurea : razaoAurea
    ,verificaQuadradoPerfeito : quadradoPerfeito
    ,verificaRaiz : raiz
    ,verificaPrimo : primo
    ,verificaCrivoEratostenes : crivoEratostenes
    ,verificaMdc : mdc
    ,verificaMdc2 : mdc2
    ,verificaHorner : horner
    ,verificaFibonacci : fibonacci
    ,verificaDigitoCPF : digitoCPF 
    ,verificaDigitoCPF2 : digitoCPF2 };