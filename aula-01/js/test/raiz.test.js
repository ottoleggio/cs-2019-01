const funcao = require("../exercicios.js");

test("raiz satisfaz (caso classico)", () => {
    expect(funcao.verificaRaiz(4, 100)).toBe(2.0);
});

test("valor não é um número", () => {
    expect(() => { funcao.verificaRaiz("a",100); }).toThrow(TypeError);
});

test("valor não é um número", () => {
    expect(() => { funcao.verificaRaiz(100,"a"); }).toThrow(TypeError);
});

test("valor fora da faixa", () => {
    expect(() => { funcao.verificaRaiz(0, 100); }).toThrow(RangeError);
});