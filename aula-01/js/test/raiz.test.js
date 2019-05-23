const funcao = require("../exercicios.js");

test("raiz satisfaz (caso classico)", () => {
    expect(funcao.raiz(4, 100)).toBe(2.0);
});

test("valor não é um número", () => {
    expect(() => { funcao.raiz("a",100); }).toThrow(TypeError);
});

test("valor não é um número", () => {
    expect(() => { funcao.raiz(100,"a"); }).toThrow(TypeError);
});

test("valor fora da faixa", () => {
    expect(() => { funcao.raiz(0, 100); }).toThrow(RangeError);
});