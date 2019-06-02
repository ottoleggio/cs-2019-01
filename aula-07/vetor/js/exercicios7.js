/**
 * Funções matemáticas diversas com propósito de estudo das ferramentas e boas
 * práticas da disciplina de construção de software
 */


/**
 * Função que encontra a menor temperatura em um vetor de valores recebido como
 * argumento.
 *
 * @param vetor Vetor contendo temperaturas.
 *
 * @return {double[]} Retorna A menor temperatura encontrada.
 */
function menorTemp(vetor) {
    for (let i = 0; i < vetor.length; i++) {
        if (typeof vetor[i] != "number") {
            throw new RangeError("O vetor deve conter somente"
            + "números inteiros");
        }
    }

    vetor.sort();

    return vetor[0];
}

/**
 * Função que soma os números ímpares contidos em um vetor de inteiros.
 *
 * @param vetor Vetor contendo inteiros.
 *
 * @return {int} Retorna a soma dos números ímpares no vetor.
 */
function somaImpares(vetor) {
    if (vetor == null || !Array.isArray(vetor)) {
        throw new TypeError("Esperado um vetor como argumento");
    }

    for (let i = 0; i < vetor.length; i++) {
        if (typeof vetor[i] != "number") {
            throw new RangeError("O vetor deve conter somente"
            + "números inteiros");
        }
    }

    var somaImpar = 0;

    for (var i = 0; i < vetor.length; i++) {
        if (vetor[i] % 2 != 0) {
            somaImpar = somaImpar + vetor[i];
        }
    }

    return somaImpar;
}

/**
 * Função que conta a quantidade de cada uma das letras presentes em uma
 * sequência de caracteres.
 *
 * @param vetor Vetor contendo inteiros.
 *
 * @return {int} Retorna a soma dos números ímpares no vetor.
 */
function contaLetras(str) {
    if (str == null) {
        throw new TypeError("Esperado uma String como argumento");
    }

    var aux = str;
    
    return (aux.replace(/[^A-Z]/gi, "").length);
}

/**Exporta os métodos para testes.
 *
 */
module.exports = { verificaMenorTemp : menorTemp 
    ,verificaSomaImpares : somaImpares 
    ,verificaContaLetras : contaLetras};