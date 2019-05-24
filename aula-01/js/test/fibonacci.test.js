const funcao = require("../exercicios.js");

test("fibonacci satisfaz (caso classico)", () => {
    expect(funcao.verificaFibonacci(7)).toBe(13);
});

test("valor não é um número", () => {
    expect(() => { funcao.verificaFibonacci("a"); }).toThrow(TypeError);
});

test("valor fora da faixa", () => {
    expect(() => { funcao.verificaFibonacci(-1); }).toThrow(RangeError);
});